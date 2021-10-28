package com.pb.Skochikovskij.hw4;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
 /*2. Создайте класс Anagram в пакете hw4.
Напишите программу, которая определяет, является ли одна строка анаграммой другой строки.
Обе строки вводит пользователь.
Анаграмма - это слово или фраза, сделанная путем переноса букв другого слова или фразы.
Программа должна игнорировать пробелы и знаки препинания.
Пример анаграмм:
Аз есмь строка, живу я, мерой остр. -> За семь морей ростка я вижу рост.
Я в мире — сирота. -> Я в Риме — Ариост.
При выполнении задания использовать метод(ы).*/


public class Anagram {

    static char[] toMass(String makePhrase) {
        return makePhrase.toCharArray();
    }


    static String smallLetter(String makeSmall) {
        return makeSmall.toLowerCase(Locale.ROOT);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);                                       // объявляем название сканнер переменной - инпут тут
        System.out.println("Милок-милок, черкани пару строк: "); //Пишем что хотим от пользователя
        String firstPhrase = input.nextLine();                                       // Создаем переменную моя фраз - которая считывается с клавиатуры
        System.out.println("И вторую фразу тоже, быть одной ей тут не гоже: "); //Пишем что хотим от пользователя
        String secondPhrase = input.nextLine();
        System.out.println("Вот спасибо, родной, запускаемся в бой : "); //Пишем что хотим от пользователя
        String small1 = smallLetter(firstPhrase);
        String small2 = smallLetter(secondPhrase);
        String smallUpdate1 = small1.replaceAll("[^A-Za-zА-Яа-я]","");
        String smallUpdate2 = small2.replaceAll("[^A-Za-zА-Яа-я]","");
        System.out.println("Обезжиренная фразочка №1 \n " + smallUpdate1); //Пишем что хотим от пользователя
        System.out.println("Обезжиренная фразочка №2 \n" + smallUpdate2); //Пишем что хотим от пользователя
        char[] firstMass =  toMass(smallUpdate1);                          //Творим массив символов
        char[] secondMass = toMass(smallUpdate2);                          //Творим массив символов

        boolean sorted = false;
        char swap;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < firstMass.length-1; i++) {
                if(firstMass[i] > firstMass[i+1]){
                    sorted = false;

                    swap = firstMass[i];
                    firstMass[i] = firstMass[i+1];
                    firstMass[i+1] = swap;

                }

            }

        }
        boolean sorted2 = false;
        char swap2;
        while(!sorted2) {
            sorted2 = true;
            for (int i = 0; i < secondMass.length-1; i++) {
                if(secondMass[i] > secondMass[i+1]){
                    sorted2 = false;

                    swap2 = secondMass[i];
                    secondMass[i] = secondMass[i+1];
                    secondMass[i+1] = swap2;

                }

            }

        }
        System.out.println(" А вот и наши отсортированные массивчики с пылу с жару: \n");
        System.out.println("По порядочку да по полочкам 1 \n " + Arrays.toString(firstMass)); //Пишем что хотим от пользователя
        System.out.println("По порядочку да по полочкам 2 \n" + Arrays.toString(secondMass)); //Пишем что хотим от пользователя

        String almostFinal1 = Arrays.toString(firstMass);
        String almostFinal2 = Arrays.toString(secondMass);
        if (almostFinal1.equals(almostFinal2)) {
            System.out.println("Чьёрт побьери - да это же самая настоящщая анаграмма!! \n");
        } else { System.out.println("Анаграммщик из тебя, конечно, так себе =( \n");

        }
    }
}