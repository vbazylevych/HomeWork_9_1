package com.goit.javaonline3.musicshop;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ler4enko on 30.05.2016.
 */
public class MusicShop {
    private final List<MusicInstrument> musicInstruments = new ArrayList<>();
    private final List<Guitar> guitars = new ArrayList<>();
    private final List<Trumpet> trumpets = new ArrayList<>();
    private final List<Piano> pianos = new ArrayList<>();

    public List<MusicInstrument> getMusicInstruments() {
        return musicInstruments;
    }

    public void openShop() {
        System.out.println("CONGRATULATION!YOU JUST OPENED NEW MUSIC SHOP!!!." + "\n");

        System.out.println("Please enter how many Guitars, Trumpets, Pianos you have in your musicshop: ");

        int initialGuitarCount = MyScanner.getPositiveInt();
        int initialTrumpetCount = MyScanner.getPositiveInt();
        int initialPianoCount = MyScanner.getPositiveInt();

        fillShop(initialGuitarCount, initialTrumpetCount, initialPianoCount);
    }

    private void fillShop(int guitarCount, int trumpetCount, int pianoCount) {

        for (int i = 0; i < guitarCount; i++) {

            System.out.println("Enter producer for " + (i+1) + " guitar");
            String producer = MyScanner.getString();

            guitars.add(new Guitar(producer));
        }

        for (int i = 0; i < trumpetCount; i++) {

            System.out.println("Enter producer for " + (i+1) + " trumpet");
            String producer = MyScanner.getString();

            trumpets.add(new Trumpet(producer));
        }

        for (int i = 0; i < pianoCount; i++) {

            System.out.println("Enter producer for " + (i+1) + " piano");
            String producer = MyScanner.getString();

            pianos.add(new Piano(producer));
        }

        inventory();
    }

    private void inventory(){
        musicInstruments.clear();
        musicInstruments.addAll(guitars);
        musicInstruments.addAll(trumpets);
        musicInstruments.addAll(pianos);
    }

    public String[][] prepareDataForTable() {
        String[][] dataTable = new String[musicInstruments.size()][3];
        Caesar caesar = new Caesar();

        for (int i = 0; i < musicInstruments.size(); i++) {

            dataTable[i][0] = musicInstruments.get(i).getProducer();
            dataTable[i][1] = caesar.encript(dataTable[i][0]).toString();
            dataTable[i][2] = caesar.decrypt(dataTable[i][1]).toString();
        }
        return dataTable;
    }
}