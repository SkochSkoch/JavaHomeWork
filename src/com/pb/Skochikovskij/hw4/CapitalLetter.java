package com.pb.Skochikovskij.hw4;


import java.util.Scanner;

public class CapitalLetter {

    static void newPhrase () {
        System.out.println("Придумайте любое предложение на Ваш выбор - покажем магию");
    }

    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        newPhrase();
        String myPhrase = input.nextLine();
        char[] myPhraseMassive = myPhrase.toCharArray();
        myPhraseMassive[0] = Character.toUpperCase(myPhraseMassive[0]);
        for (int i = 0; i < myPhraseMassive.length - 1; i++) {
            if (myPhraseMassive[i] == ' ') {
                myPhraseMassive[i + 1] = Character.toUpperCase(myPhraseMassive[i + 1]);
            }
        }
        String myPhrase2 = new String(myPhraseMassive);
        System.out.println(myPhraseMassive);
    }
}
