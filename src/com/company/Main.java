package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String aRussianVault;
        final int NUM = 10;
        String word = "Слово";
        aRussianVault = NUM+word;
        System.out.println(aRussianVault+NUM+word);
        if (NUM<0) {
            System.out.println("Вы сохранили отрицательное число");
        }else if (NUM>0) {
            System.out.println("Вы сохранили положительное число");
        }else {
            System.out.println("Вы сохранили нуль");
        }
        Scanner a = new Scanner(System.in);
        System.out.println("Введите ваше имя:");
        String b = a.next();
        System.out.println("Привет " + b + "!");
    }
}
