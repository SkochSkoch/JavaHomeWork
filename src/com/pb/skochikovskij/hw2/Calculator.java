package com.pb.skochikovskij.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int operand1;
        int operand2;
        String sign;


        System.out.print("Введите целое число №1: ");
        operand1 = input.nextInt();
        System.out.print("Введите целое число №2: ");
        operand2 = input.nextInt();
        System.out.print("Введите желаемую операцию (+,-,/,*): ");
        sign = input.next();

        switch (sign) {
            case "+":
                System.out.print("Result is: " + (operand1 + operand2));
                break;
            case "-":
                System.out.print("Result is: " + (operand1 - operand2));
                break;
            case "*":
                System.out.print("Result is: " + (operand1 * operand2));
                break;
            case "/":
                if (operand2 == 0) {
                    System.out.print("На нолики делить низя");
                } else {
                    System.out.print("Result is: " + (operand1 / operand2));
                    break;
                }
                    default:
                        System.out.print("Шановний, а то точно операція шо ти ото понаписував?");

        }
    }
}