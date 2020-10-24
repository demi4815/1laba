package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        /*
        System.out.println("Enter container size:");
        Scanner num = new Scanner(System.in);
        int n;
        n = num.nextInt();
        */

        int n = 10;

        //Для int
        System.out.println("For int:");

        Container<Integer> arrayInt = new Container<>(n);

        // Заполняем массив числами от 1 до n
        for (int i = 0; i < n; i++)
            arrayInt.mData[i] = i + 1;

        for (int i = 0; i < arrayInt.GetLength(); i++)
            System.out.print(arrayInt.mData[i] + " ");
        System.out.println();

        // Изменяем размер массива до 7 элементов
        arrayInt.Resize2(7);

        for (int i = 0; i < arrayInt.GetLength(); i++)
            System.out.print(arrayInt.mData[i] + " ");
        System.out.println();

        // Вставляем число 15 после элемента с индексом 4
        arrayInt.Insert(15, 4);

        // Удаляем элемент с индексом 5
        arrayInt.RemoveIndex(5);

        // Добавляем числа 35 и 50 в конец и в начало
        arrayInt.InsertAtEnd(35);
        arrayInt.InsertAtBeginning(50);

        for (int i = 0; i < arrayInt.GetLength(); i++)
            System.out.print(arrayInt.mData[i] + " ");
        System.out.println();

        //Удаляем элемент со значением 4
        arrayInt.Remove(15);

        for (int i = 0; i < arrayInt.GetLength(); i++)
            System.out.print(arrayInt.mData[i] + " ");
        System.out.println();

        // Получаем элемент с индексом 5
        System.out.println(arrayInt.Get(5));



        //Для float
        System.out.println("For float:");

        Container<Float> arrayFloat = new Container<>(n);

        // Заполняем массив числами от 1 до n
        for (int i = 0; i < n; i++)
            arrayFloat.mData[i] = i + 1;

        for (int i = 0; i < arrayFloat.GetLength(); i++)
            System.out.print(arrayFloat.mData[i] + " ");
        System.out.println();

        // Изменяем размер массива до 7 элементов
        arrayFloat.Resize2(7);

        for (int i = 0; i < arrayFloat.GetLength(); i++)
            System.out.print(arrayFloat.mData[i] + " ");
        System.out.println();

        // Вставляем число 15.4 после элемента с индексом 4
        arrayFloat.Insert(15.4f, 4);

        // Удаляем элемент с индексом 5
        arrayFloat.RemoveIndex(5);

        // Добавляем числа 35.72 и 50.96 в конец и в начало
        arrayFloat.InsertAtEnd(35.72f);
        arrayFloat.InsertAtBeginning(50.96f);

        // Выводим все элементы массива
        for (int i = 0; i < arrayFloat.GetLength(); i++)
            System.out.print(arrayFloat.mData[i] + " ");
        System.out.println();

        for (int i = 0; i < arrayFloat.GetLength(); i++)
            System.out.print(arrayFloat.mData[i] + " ");
        System.out.println();

        //if(arrayFloat.mData[5] == 15.4f)  System.out.println();

        // Получаем элемент с индексом 5
        System.out.println(arrayFloat.Get(5));



        //Для string
        System.out.println("For string:");
        Container<String> arrayStr = new Container<>(n);

        arrayStr.Insert("zxc", 0);
        arrayStr.Insert("asd", 1);
        arrayStr.Insert("qwe", 2);

        arrayStr.Resize2(3);

        for (int i = 0; i < arrayStr.GetLength(); i++)
            System.out.print(arrayStr.mData[i] + " ");
        System.out.println();

        arrayStr.RemoveIndex(1);

        for (int i = 0; i < arrayStr.GetLength(); i++)
        System.out.print(arrayStr.mData[i] + " ");
        System.out.println();

        System.out.print(arrayStr.Get(1));
        System.out.println();

        arrayStr.Remove("qwe");

        for (int i = 0; i < arrayStr.GetLength(); i++)
            System.out.print(arrayStr.mData[i] + " ");
        System.out.println();

    }
}
