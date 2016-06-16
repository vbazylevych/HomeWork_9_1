package com.goit.javaonline3.musicshop;

import java.util.Scanner;

/**
 * Created by Ler4enko on 11.06.2016.
 */
public class IntScanner {

    public static int getPositiveInt() {
        boolean correctValueOfInt = false;
        int positiveInt = 0;

        while(!correctValueOfInt) {
            positiveInt = getInt();
            if (positiveInt < 0) {
                System.out.println("You enter value less or equal 0. Please try again.");
            } else {
                correctValueOfInt = true;
            }
        }
        return positiveInt;
    }

    public static int getInt() {
        boolean correctValueOfInt = false;
        int correctInt = 0;
        while(!correctValueOfInt) {
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                correctInt = scanner.nextInt();
                correctValueOfInt = true;
            } else {
                System.out.println("You entered incorrect value. Please try again");
            }
        }
        return correctInt;
    }
}


/*
Объект сканнер создается каждый раз, когда нужно получить инт и никогда не закрывается
*/
