package com.pb.skochikovskij.hw3;

import java.util.Arrays;
import java.util.Scanner;

/* Создайте класс Array в пакете hw3.Программа должна позволить пользователю ввести одномерный массив целых чисел размерностью 10 элементов.
Вывести на экран введенный массив.
Подсчитать сумму всех элементов массива и вывести ее на экран.
Подсчитать и вывести на экран количество положительных элементов.
Произвести сортировку этого массива от меньшего к большему по алгоритму сортировки пузырьком. (https://en.wikipedia.org/wiki/Bubble_sort)
Вывести на экран отсортированный массив.*/
public class Array {
    public static void main(String[] args) {
        int [] myMassive;
        int sum = 0;
        int countPositivs = 0;
        int swap;
        boolean sorted = false;
        myMassive = new int [10];
        /*int numberCount = 0;*/
        Scanner input = new Scanner(System.in);
        System.out.print("Введите  число массива  ");
                   for(int i=0;i < 10;i++) {
                       myMassive[i] = input.nextInt();
                       System.out.print("Введите следующее число массива  ");
                   }
        System.out.println();
        System.out.print("Спасибо за помощь в наполнении, Ваш массив: ");
        for (int i=0; i < 10;i++) {
            System.out.print(myMassive[i]);
        }
        for (int i = 0; i < 10; i++) {
            sum = sum + myMassive[i];

        }
        System.out.println();
        System.out.println("Сумма чисел в массиве: " +  sum);
for (int i = 0;i < 10; i++) {
        if (myMassive[i] > 0) {
        countPositivs = countPositivs + 1;
    }
}
    System.out.println();
    System.out.println("Количество положительных чисел: " + countPositivs);
        while(!sorted) {
            sorted = true;
                        for (int i = 0; i < 9; i++) {
                    if(myMassive[i] > myMassive[i+1]){
                    sorted = false;

                    swap = myMassive[i];
                    myMassive[i] = myMassive[i+1];
                    myMassive[i+1] = swap;

                }

            }

        }
        System.out.println("Массив запузырился в строку");
        System.out.println(Arrays.toString(myMassive));
}


    }






