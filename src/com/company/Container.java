package com.company;

public class Container
{

    int m_length;
    int[] m_data;

    Container()
    {
        m_length = 0;
        m_data = null;
    }

    Container(int length)
    {
        assert(length >= 0);
        m_length = length;


        if (length > 0)
            m_data = new int[length];
        else
            m_data = null;
    }

    void Erase()
    {
        m_data = null;
        m_length = 0;
    }

    int Get(int index)
    {
        assert(index >= 0 && index < m_length);
        return m_data[index];
    }

    int GetLength() { return m_length; }

    void Resize1(int newLength)
    {
        // Удаляем все существующие элементы внутри массива
        Erase();

        // Если наш массив должен быть пустым, то выполняем возврат здесь
        if (newLength <= 0)
            return;

        // Дальше нам нужно выделить новые элементы
        m_data = new int[newLength];
        m_length = newLength;
    }

    void Resize2(int newLength)
    {
        if (newLength == m_length)
            return;

        if (newLength <= 0)
        {
            Erase();
            return;
        }

        // Выделяем новый массив
        int[] data = new int[newLength];

        if (m_length > 0)
        {
            int elementsToCopy = Math.min(newLength, m_length);

            // Поочередно копируем элементы
            for (int index = 0; index < elementsToCopy ; index++)
                data[index] = m_data[index];
        }

        // Удаляем старый массив, так как он нам уже не нужен
        m_data = null;

        m_data = data;
        m_length = newLength;
    }

    void Insert(int value, int index)
    {
        assert(index >= 0 && index <= m_length);

        // Создаем новый массив на один элемент больше старого массива
        int[] data = new int[m_length+1];

        // Копируем все элементы до index
        for (int before = 0; before < index; before++)
            data[before] = m_data[before];

        // Вставляем наш новый элемент в наш новый массив
        data [index] = value;

        // Копируем все значения после вставляемого элемента
        for (int after = index; after < m_length; after++)
            data[after+1] = m_data[after];

        // Удаляем старый массив и используем вместо него новый массив
        m_data = null;

        m_data = data;
        m_length++;
    }

    void Remove(int index)
    {
        assert(index >= 0 && index < m_length);

        if (m_length == 1)
        {
            Erase();
            return;
        }

        int[] data = new int[m_length-1];

        for (int before = 0; before  < index; before++)
            data[before] = m_data[before];


        for (int after = index+1; after < m_length; after++ )
            data[after-1] = m_data[after];

        m_data = null;

        m_data = data;
        --m_length;
    }

    void InsertAtBeginning(int value) { Insert(value, 0); }

    void InsertAtEnd(int value) { Insert(value, m_length); }

    int proverka;

}
