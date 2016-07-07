package com.goit.javaonline3.musicshop;

import java.util.Scanner;

/**
 * Created by Ler4enko on 11.06.2016.
 */
public class MyScanner {

    private static final Scanner scanner = new Scanner(System.in);

    public static void close() {
        scanner.close();
    }

    public static int getPositiveInt() {

        while(true) {
            int PositiveInt = getInt();

            if (PositiveInt < 0) {
                System.out.println("You enter value less or equal 0. Please try again.");
            } else {
                return PositiveInt;
            }
        }
    }

    public static int getInt() {

        while(true) {

            if (scanner.hasNextInt()) {
                int userInput = scanner.nextInt();
                return userInput;
            } else {
                System.out.println("You entered incorrect value. Please try again");
                scanner.next();
            }
        }
    }

    public static double getPositiveDouble() {

        while(true) {
            double positiveDouble = getDouble();
            if (positiveDouble < 0) {
                System.out.println("You enter value less or equal 0. Please try again.");
            } else {
                return positiveDouble;
            }
        }
    }

    public static double getDouble() {

        while(true) {

            if (scanner.hasNextDouble()) {
                double userInput = scanner.nextDouble();
                return userInput;
            } else {
                System.out.println("You entered incorrect value. Please try again");
                scanner.next();
            }
        }
    }

    public static String getString() {
        while(true) {

            if (scanner.hasNext()) {
                String userInput = scanner.next();
                return userInput;
            } else {
                System.out.println("You entered incorrect value. Please try again");
                scanner.next();
            }
        }
    }
}


/*
Объект сканнер создается каждый раз, когда нужно получить инт и никогда не закрывается
*/
