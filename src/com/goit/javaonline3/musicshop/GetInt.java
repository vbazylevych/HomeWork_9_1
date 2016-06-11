package com.goit.javaonline3.musicshop;

import java.util.Scanner;

/**
 * Created by Ler4enko on 11.06.2016.
 */
public class GetInt {

    public static int getPositiveInt() {
        boolean correctValueofInt = false;
        int PositiveInt = 0;

        while(!correctValueofInt) {
            PositiveInt = getAnyInt();
            if (PositiveInt < 0) {
                System.out.println("You enter value less or equal 0. Please try again.");
            } else {
                correctValueofInt = true;
            }
        }
        return PositiveInt;
    }

    public static int getAnyInt() {
        boolean CorrectValueOfInt = false;
        int correctInt = 0;
        while(!CorrectValueOfInt) {
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                correctInt = scanner.nextInt();
                CorrectValueOfInt = true;
            } else {
                System.out.println("You entered incorrect value. Please try again");
            }
        }
        return correctInt;
    }
}
