package com.goit.javaonline3.musicshop;

import java.awt.Dimension;
import javax.swing.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/**
 * Created by Ler4enko on 30.05.2016.
 */
public class MusicShop {
    private final List<MusicInstrument> musicInstruments = new ArrayList<>();
    private final List<Guitar> guitars = new ArrayList<Guitar>();
    private final List<Trumpet> trumpets = new ArrayList<Trumpet>();
    private final List<Piano> pianos = new ArrayList<Piano>();

    public List<MusicInstrument> getMusicInstruments() {
        return musicInstruments;
    }

    public void openShop(MyScanner myScanner) {
        System.out.println("CONGRATULATION!YOU JUST OPENED NEW MUSIC SHOP!!!." + "\n");

        System.out.println("Please enter how many Guitars you have in your musicshop: ");
        int initialGuitarCount = myScanner.getPositiveInt();

        System.out.println("Please enter how many Trumpets you have in your musicshop:");
        int initialTrumpetCount = myScanner.getPositiveInt();

        System.out.println("Please enter how many Piano you have in your musicshop:");
        int initialPianoCount = myScanner.getPositiveInt();

        fillShop(initialGuitarCount, initialTrumpetCount, initialPianoCount, myScanner);
    }

    private void fillShop(int guitarCount, int trumpetCount, int pianoCount, MyScanner myScanner) {

        for (int i = 0; i < guitarCount; i++) {

            System.out.println("Enter producer for " + (i+1) + " guitar");
            String producer = myScanner.getString();

            System.out.println("Enter price for " + (i+1) + " guitar");
            double price = myScanner.getDouble();

            System.out.println("Enter type for " + (i+1) + " guitar");
            String type = myScanner.getString();

            guitars.add(new Guitar(producer, price, type));
        }

        for (int i = 0; i < trumpetCount; i++) {
            System.out.println("Enter producer for " + (i+1) + " trumpet");
            String producer = myScanner.getString();

            System.out.println("Enter price for " + (i+1) + " trumpet");
            double price = myScanner.getDouble();

            trumpets.add(new Trumpet(producer, price));
        }

        for (int i = 0; i < pianoCount; i++) {

            System.out.println("Enter producer for " + (i+1) + " piano");
            String producer = myScanner.getString();

            System.out.println("Enter price for " + (i+1) + " piano");
            double price = myScanner.getDouble();

            System.out.println("Enter color for " + (i+1) + " piano");
            String color = myScanner.getString();

            pianos.add(new Piano(producer, price, color));
        }

        inventory();
    }

    private void inventory(){
        musicInstruments.clear();
        musicInstruments.addAll(guitars);
        musicInstruments.addAll(trumpets);
        musicInstruments.addAll(pianos);
    }
    public void sortMusicInstrumentsByPrice() {

        for (int j = musicInstruments.size() - 1; j > 0; j--) {
            for (int i = 0; i < j; i++){
                if(musicInstruments.get(i).getPrice() > musicInstruments.get(i+1).getPrice()) {
                    MusicInstrument temp = musicInstruments.get(i);
                    musicInstruments.set(i, musicInstruments.get(i+1));
                    musicInstruments.set(i+1, temp);
                }
            }
        }
    }

    public String[][] prepareAssortmentTable() {
        String[][] dataTable = new String[musicInstruments.size()][5];

        for (int i = 0; i < musicInstruments.size(); i++) {

                switch (musicInstruments.get(i).getClass().getSimpleName()) {
                    case "Guitar":
                        Guitar guitar = (Guitar) musicInstruments.get(i);

                        dataTable[i][0] = "Guitar";
                        dataTable[i][1] = "" + guitar.getPrice();
                        dataTable[i][2] =  guitar.getProducer();
                        dataTable[i][3] = guitar.getType();
                        dataTable[i][4] = "---";
                        break;
                    case "Piano":
                        Piano piano = (Piano) musicInstruments.get(i);

                        dataTable[i][0] = "Piano";
                        dataTable[i][1] = "" + piano.getPrice();
                        dataTable[i][2] =  piano.getProducer();
                        dataTable[i][3] = "---";
                        dataTable[i][4] = piano.getColor();
                        break;
                    case "Trumpet":
                        Trumpet trumpet = (Trumpet) musicInstruments.get(i);

                        dataTable[i][0] = "Trumpet";
                        dataTable[i][1] = "" + trumpet.getPrice();
                        dataTable[i][2] = trumpet.getProducer();
                        dataTable[i][3] = "---";
                        dataTable[i][4] = "---";
                        break;
                }
        }
        return dataTable;
    }
}