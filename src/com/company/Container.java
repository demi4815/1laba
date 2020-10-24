package com.company;

class Container <Type>
{
    int mLength;
    Object [] mData;

    Container()
    {
        mLength = 0;
        mData = null;
    }

    Container(int length)
    {
        assert(length >= 0);
        mLength = length;

        if (length > 0)
            mData = new Object[length];
        else
            mData = null;
    }

    void Erase()
    {
        mData = null;
        mLength = 0;
    }

    Type Get(int index)
    {
        assert(index >= 0 && index < mLength);
        return (Type) mData[index];
    }

    int GetLength() { return mLength; }

    void Resize1(int newLength)  //Изменение размера массива с удалением всех старых элементов
    {
        // Удаляем все существующие элементы внутри массива
        Erase();

        // Если наш массив должен быть пустым, то выполняем возврат здесь
        if (newLength <= 0)
            return;

        // Дальше нам нужно выделить новые элементы
        mData = new Object[newLength];
        mLength = newLength;
    }

    void Resize2(int newLength) //Изменение размера массива с сохранением всех элементов
    {
        if (newLength == mLength)
            return;

        if (newLength <= 0)
        {
            Erase();
            return;
        }

        // Выделяем новый массив
        Object[] data = new Object[newLength];

        if (mLength > 0)
        {
            int elementsToCopy = Math.min(newLength, mLength);

            // Поочередно копируем элементы
            for (int index = 0; index < elementsToCopy ; index++)
                data[index] = mData[index];
        }

        // Удаляем старый массив, так как он нам уже не нужен
        mData = null;

        mData = data;
        mLength = newLength;
    }

    void Insert(Type value, int index) //Вставляем value после элемента с индексом index
    {
        assert(index >= 0 && index <= mLength);

        // Создаем новый массив на один элемент больше старого массива
        Object[] data = new Object[mLength + 1];

        // Копируем все элементы до index
        for (int before = 0; before < index; before++)
            data[before] = mData[before];

        // Вставляем наш новый элемент в наш новый массив
        data [index] = value;

        // Копируем все значения после вставляемого элемента
        for (int after = index; after < mLength; after++)
            data[after+1] = mData[after];

        // Удаляем старый массив и используем вместо него новый массив
        mData = null;

        mData = data;
        mLength++;
    }

    void RemoveIndex(int index) //Удаление по индексу
    {
        assert(index >= 0 && index < mLength);

        if (mLength == 1)
        {
            Erase();
            return;
        }

        Object[] data = new Object[mLength - 1];

        for (int before = 0; before  < index; before++)
            data[before] = mData[before];


        for (int after = index+1; after < mLength; after++ )
            data[after-1] = mData[after];

        mData = null;

        mData = data;
        --mLength;
    }

    void Remove(Type value) //Удаление по индексу
    {
        int index = -1; //Невозможно будет найти такой же индекс
        for (int i = 0; i < mLength; i++)
        {
            if (this.mData[i] == value)
            {
                index = i;
                break;
            }
        }

        if (index >= 0)
        {
            Object[] data = new Object[mLength - 1];

            for (int i = 0; i < index; i++)  data[i] = mData[i];

            for (int i = index + 1; i < mLength; i++) data[i-1] = mData[i];

            mData = null;

            mData = data;
            --mLength;
        }

    }

    void InsertAtBeginning(Type value) { Insert(value, 0); }

    void InsertAtEnd(Type value) { Insert(value, mLength); }

}
