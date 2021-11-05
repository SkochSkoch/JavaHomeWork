package com.pb.skochikovskij.hw2;

import java.util.Scanner;
/*2) Напишите программу определения интервала.
        Создайте класс Interval в пакете hw2.
        Предложите пользователю ввести целое число и сохраните его в переменную с произвольным именем.
        Программа должна выяснить в какой промежуток попадает введенное число [0 -14] [15 - 35] [36 - 50] [51 - 100].
        Вывести на экран сообщение с подходящим промежутком.
        Если введенное число не попадает в один из имеющихся промежутков, то вывести соответствующее сообщение.*/
public class Interval {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int myNumber;

        System.out.print("Введите целое число(без вот этого вот 1.5 2,4): ");
        myNumber = input.nextInt();
        if ((myNumber >= 1) & (myNumber <= 14)) {
            System.out.print("Число в промежутке 0-14");
        } else if ((myNumber >= 15) & (myNumber <= 35)) {
            System.out.print("Число в промежутке 15-35");
        }
        else if ((myNumber >= 36) & (myNumber <= 50)) {
            System.out.print("Число в промежутке 36-50");
        } else if ((myNumber >= 51) & (myNumber <= 100))
                    {
                        System.out.print("Число в промежутке 51-100");
                    } else
                    {
                        System.out.print("Число не диапазонится, попробуйте в другой раз");
                    }
                }
            }