package com.goit.javaonline3.musicshop;

import java.util.ArrayList;

/**
 * Created by vbazylevych on 7/8/2016.
 */
public class Ceasar {

    public static ArrayList<Character> artificialAlphabet = new ArrayList<Character>();
    public static int shift = 3;

    public Ceasar() {

        for (char symbol = 'a'; symbol <= 'z'; symbol++) {
            artificialAlphabet.add(symbol);
        };

        for (char symbol = 'A'; symbol <= 'Z'; symbol++) {
            artificialAlphabet.add(symbol);
        };

        for (char symbol = 'а'; symbol <= 'я'; symbol++) {
            artificialAlphabet.add(symbol);
        };

        for (char symbol = 'А'; symbol <= 'Я'; symbol++) {
            artificialAlphabet.add(symbol);
        };
    }

    public static StringBuilder encript(String text){
      StringBuilder encriptedText = new StringBuilder();

      for(int i = 0; i < text.length(); i++) {
          char symbol = text.charAt(i);
          int currentSymbolPosition = artificialAlphabet.indexOf(symbol);

          if(currentSymbolPosition >= 0) {
              encriptedText.append(artificialAlphabet.get(findNewSymbolPositionForEncripting(currentSymbolPosition)));
          } else {
              encriptedText.append( text.charAt(i));
          }
      }
      return encriptedText;
    }

    public static int findNewSymbolPositionForEncripting(int currentSymbolPosition){

        if (currentSymbolPosition <= artificialAlphabet.size() - shift - 1) {
            return currentSymbolPosition + 3;
        } else {
            return shift - (artificialAlphabet.size() % currentSymbolPosition);
        }
    }

    public static StringBuilder decrypt(String text){
        StringBuilder encriptedText = new StringBuilder();

        for(int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            int currentSymbolPosition = artificialAlphabet.indexOf(symbol);

            if(currentSymbolPosition >= 0) {
                encriptedText.append(artificialAlphabet.get(findOldSymbolPositionForEncripting(currentSymbolPosition)));
            } else {
                encriptedText.append( text.charAt(i));
            }
        }
        return encriptedText;
    }

    public static int findOldSymbolPositionForEncripting(int currentSymbolPosition){

        if (currentSymbolPosition <= shift - 1) {
            return artificialAlphabet.size() - shift + currentSymbolPosition;
        } else {
            return currentSymbolPosition - shift;
        }
    }

    public static ArrayList<Character> getArtificialAlphabet() {
        return artificialAlphabet;
    }

    public static void setArtificialAlphabet(ArrayList<Character> artificialAlphabet) {
        Ceasar.artificialAlphabet = artificialAlphabet;
    }

    public static int getShift() {
        return shift;
    }

    public static void setShift(int shift) {
        Ceasar.shift = shift;
    }
}



