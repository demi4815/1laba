package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("Enter container size:");
        Scanner num = new Scanner(System.in);
        int n;
        n = num.nextInt();

        Container array = new Container(n);

        // Заполняем массив числами от 1 до n
        for (int i = 0; i < n; i++)
            array.m_data[i] = i + 1;

        for (int i = 0; i < array.GetLength(); i++)
            System.out.print(array.m_data[i] + " ");
        System.out.println();

        // Изменяем размер массива до 7 элементов
        array.Resize2(7);

        for (int i = 0; i < array.GetLength(); i++)
            System.out.print(array.m_data[i] + " ");
        System.out.println();

        // Вставляем число 15 после элемента с индексом 4
        array.Insert(15, 4);

        // Удаляем элемент с индексом 5
        array.Remove(5);

        // Добавляем числа 35 и 50 в конец и в начало
        array.InsertAtEnd(35);
        array.InsertAtBeginning(50);

        // Выводим все элементы массива
        for (int i = 0; i < array.GetLength(); i++)
            System.out.print(array.m_data[i] + " ");


    }
}
