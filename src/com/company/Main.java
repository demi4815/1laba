package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("Enter container size:");
        Scanner num = new Scanner(System.in);
        int n;
        n = num.nextInt();



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
        arrayInt.Remove(5);

        // Добавляем числа 35 и 50 в конец и в начало
        arrayInt.InsertAtEnd(35);
        arrayInt.InsertAtBeginning(50);

        // Выводим все элементы массива
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
        arrayFloat.Remove(5);

        // Добавляем числа 35.72 и 50.96 в конец и в начало
        arrayFloat.InsertAtEnd(35.72f);
        arrayFloat.InsertAtBeginning(50.96f);

        // Выводим все элементы массива
        for (int i = 0; i < arrayFloat.GetLength(); i++)
            System.out.print(arrayFloat.mData[i] + " ");
        System.out.println();

        // Получаем элемент с индексом 5
        System.out.println(arrayFloat.Get(5));



        //Для string
        System.out.println("For string:");
        Container<String> array = new Container<>(n);

        array.Insert("zxc", 0);
        array.Insert("asd", 1);
        array.Insert("qwe", 2);

        array.Resize2(3);

        for (int i = 0; i < array.GetLength(); i++)
            System.out.print(array.mData[i] + " ");
        System.out.println();

        array.Remove(1);

        for (int i = 0; i < array.GetLength(); i++)
        System.out.print(array.mData[i] + " ");
        System.out.println();

        System.out.print(array.Get(1));

    }
}
