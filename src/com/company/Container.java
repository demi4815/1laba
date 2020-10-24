package com.company;

public class Container
{

    int mLength;
    int[] mData;

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
            mData = new int[length];
        else
            mData = null;
    }

    void Erase()
    {
        mData = null;
        mLength = 0;
    }

    int Get(int index)
    {
        assert(index >= 0 && index < mLength);
        return mData[index];
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
        mData = new int[newLength];
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
        int[] data = new int[newLength];

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

    void Insert(int value, int index)
    {
        assert(index >= 0 && index <= mLength);

        // Создаем новый массив на один элемент больше старого массива
        int[] data = new int[mLength + 1];

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

    void Remove(int index)
    {
        assert(index >= 0 && index < mLength);

        if (mLength == 1)
        {
            Erase();
            return;
        }

        int[] data = new int[mLength - 1];

        for (int before = 0; before  < index; before++)
            data[before] = mData[before];


        for (int after = index+1; after < mLength; after++ )
            data[after-1] = mData[after];

        mData = null;

        mData = data;
        --mLength;
    }

    void InsertAtBeginning(int value) { Insert(value, 0); }

    void InsertAtEnd(int value) { Insert(value, mLength); }



}
