package com.pb.Skochikovskij.hw4;


import java.util.Scanner;

public class CapitalLetter {

    static  char[] toMass (String makePhrase) {
        return makePhrase.toCharArray();
         }


    public static void main (String[]args){
        Scanner input = new Scanner(System.in);                                       // объявляем название сканнер переменной - инпут тут
        System.out.println("Введите, пожалуйста любую фразу, будем делать мэджик: "); //Пишем что хотим от пользователя
        String myPhrase = input.nextLine();                                       // Создаем переменную моя фраз - которая считывается с клавиатуры
        char[] myPhraseMassive = toMass(myPhrase);                                    // Создаём Массив который делается из строки введённой пользователем через метод выше
        myPhraseMassive[0] = Character.toUpperCase(myPhraseMassive[0]);          //для первой буковки применяем метод - сделать большую буковку
        for (int i = 0; i < myPhraseMassive.length - 1; i++) {                    //делаем это пока массив не закончится
            if (myPhraseMassive[i] == ' ')                                            //если на каком-то этапе элемент массива - пробел
            {
                myPhraseMassive[i + 1] = Character.toUpperCase(myPhraseMassive[i + 1]);//делаем шаг вперёд и снова пробуем делать следующую букву большой
            }
        }
        System.out.println(myPhraseMassive);                                    //Вывод на экран
    }
}

