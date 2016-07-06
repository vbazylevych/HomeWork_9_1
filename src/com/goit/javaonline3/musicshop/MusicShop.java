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
//    private MusicInstrument instrument;


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

    public void handleOrder(Map<String, Integer> order){
        try{
            if (order.get("guitars") <= guitars.size() && order.get("trumpets") <= trumpets.size()
                    && order.get("pianos") <= pianos.size() ){
                shipInstruments(order);
            } else {
                whatWentWrong(order);
            }
        } catch (NullPointerException e){
            System.out.println("Incorrect key for order");
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }

    private void shipInstruments(Map<String, Integer> order){

        for(int i = 0; i < order.get("guitars"); i++) {
          guitars.remove(0);
        }

        for(int i = 0; i < order.get("trumpets"); i++) {
            trumpets.remove(0);
        }

        for(int i = 0; i < order.get("pianos"); i++) {
            pianos.remove(0);
        }

        inventory();
    }

    private void whatWentWrong(Map<String, Integer> order) throws IllegalArgumentException{
        if (order.get("guitars") > guitars.size()) {
            throw new IllegalArgumentException("Count of wanted guitars is more than " +
                    "currently present in the musicshop");
        }

        if (order.get("trumpets") > trumpets.size()) {
            throw new IllegalArgumentException("Count of wanted trumpets is more than " +
                    "currently present in the musicshop");
        }

        if (order.get("pianos") > pianos.size()) {
            throw new IllegalArgumentException("Count of wanted pianos is more than " +
                    "currently present in the musicshop");
        }
    }

    public List<MusicInstrument> getMusicInstruments() {
        return musicInstruments;
    }

    public void printRestOfInstruments() {
        System.out.println("Rest of instruments:");
        System.out.println("Guitars:" + guitars.size());
        System.out.println("Trumpet:" + trumpets.size());
        System.out.println("Pianos:" + pianos.size());

    }

    public String[][]  printAssortment() {
        String[][] test = new String[musicInstruments.size()][4];

        for (int i = 0; i < musicInstruments.size(); i++) {

                switch (musicInstruments.get(i).getClass().getSimpleName()) {
                    case "Guitar":
                        Guitar guitar = (Guitar) musicInstruments.get(i);
                        test[i][0] = "" + guitar.getPrice();
                        test[i][1] =  guitar.getProducer();
                        test[i][2] = guitar.getType();
                        test[i][3] = "---";
                        break;
                    case "Piano":
                        Piano piano = (Piano) musicInstruments.get(i);

                        test[i][0] = "" + piano.getPrice();
                        test[i][1] =  piano.getProducer();
                        test[i][2] = "---";
                        test[i][3] = piano.getColor();
                        break;
                    case "Trumpet":
                        Trumpet trumpet = (Trumpet) musicInstruments.get(i);
                        test[i][0] = "" + trumpet.getPrice();
                        test[i][1] =  trumpet.getProducer();
                        test[i][2] = "---";
                        test[i][3] = "---";
                        break;
                }
        }
        return test;
    }
}