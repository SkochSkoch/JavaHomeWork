package com.pb.skochikovskij.hw3;
import java.util.Scanner;
import java.util.Random;
/*1. Написать программу игру “Bingo”.
Создайте класс Bingo в пакете hw3.
Программа должна загадать целое число в диапазоне от 0 до 100 и предложить пользователю его отгадать.
При вводе числа пользователем, программа проверяет на соответствие с загаданным число и если числа совпали вывести сообщение о том, что число отгадано.
Если числа не совпали, тогда следует вывести надпись о том, что задуманное число является больше или меньше вводимого.
Также программа ведет подсчет попыток, и выводит это количество после того как число угадали.
Предусмотреть возможность досрочного завершения программы, в случае если пользователь не желает продолжать угадывать число. */
public class Bingo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random randomizer = new Random();
        int number = randomizer.nextInt(101);
        int badTry = 0;
        int guess;
        /*System.out.println("Number is: " + number);*/

        System.out.print("Введите целое число от 0 до 100 (Но если Вам лень - введите 300): ");


        do
        { badTry++;
        guess = input.nextInt();

            if (guess == 300)
            {
                System.out.print("Ответ спроси у тракториста ");
                break;
            }
            if ((guess > 100) || (guess < 0)) {
                System.out.print("Ты думаешь " + guess + " в диапазоне от 0 до 100? Давай еще разок подумаем : ");
                continue;
            }
            if (guess < number)
            {
                System.out.print("Чутка недобор, попробуй еще ");
            }
            else if (guess > number)
            {
                System.out.print("Немного переборщил, попробуй еще ");
            }
             else  System.out.println("Да тебе на битву экстрасенсов! всего-то " + badTry + " попыточек!");
            }
              while (guess != number);
        System.out.println( "Вот и сказочке конец, кто решил - тот молодец" );

        }


        }


