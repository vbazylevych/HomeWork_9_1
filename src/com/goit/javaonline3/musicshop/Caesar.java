package com.goit.javaonline3.musicshop;

import java.util.ArrayList;

/**
 * Created by vbazylevych on 7/8/2016.
 */
public class Caesar {

    private static final ArrayList<Character> artificialAlphabet = new ArrayList<Character>();
    private static final int shift = 3;

    static {

        for (char symbol = 'a'; symbol <= 'z'; symbol++) {
            artificialAlphabet.add(symbol);
        }

        for (char symbol = 'A'; symbol <= 'Z'; symbol++) {
            artificialAlphabet.add(symbol);
        }

        for (char symbol = 'а'; symbol <= 'я'; symbol++) {
            artificialAlphabet.add(symbol);
        }

        for (char symbol = 'А'; symbol <= 'Я'; symbol++) {
            artificialAlphabet.add(symbol);
        }
    }

    public static StringBuilder encrypt(String text){
      StringBuilder encryptedText = new StringBuilder();

      for (int i = 0; i < text.length(); i++) {
          char symbol = text.charAt(i);
          int currentSymbolPosition = artificialAlphabet.indexOf(symbol);

          if (currentSymbolPosition >= 0) {
              encryptedText.append(artificialAlphabet.get(findNewSymbolPositionForEncrypting(currentSymbolPosition)));
          } else {
              encryptedText.append(text.charAt(i));
          }
      }
      return encryptedText;
    }

    private static int findNewSymbolPositionForEncrypting(int currentSymbolPosition){

        if (currentSymbolPosition <= artificialAlphabet.size() - shift - 1) {
            return currentSymbolPosition + 3;
        } else {
            return shift - (artificialAlphabet.size() % currentSymbolPosition);
        }
    }

    public static StringBuilder decrypt(String text){
        StringBuilder decryptedText = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            int currentSymbolPosition = artificialAlphabet.indexOf(symbol);

            if (currentSymbolPosition >= 0) {
                decryptedText.append(artificialAlphabet.get(findOldSymbolPositionForEncrypting(currentSymbolPosition)));
            } else {
                decryptedText.append( text.charAt(i));
            }
        }
        return decryptedText;
    }

    private static int findOldSymbolPositionForEncrypting(int currentSymbolPosition){

        if (currentSymbolPosition <= shift - 1) {
            return artificialAlphabet.size() - shift + currentSymbolPosition;
        } else {
            return currentSymbolPosition - shift;
        }
    }

    public static ArrayList<Character> getArtificialAlphabet() {
        return artificialAlphabet;
    }

    public static int getShift() {
        return shift;
    }

}



