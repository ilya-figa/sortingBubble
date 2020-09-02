package com.company;
import java.util.Scanner;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner num = new Scanner(System.in);

        byte [] array = new byte[num.nextInt()];

        rnd.nextBytes(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    byte temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
