package com.goit.javaonline3.musicshop;

import java.util.ArrayList;
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


    public void openShop() {
        System.out.println("CONGRATULATION!YOU JUST OPENED NEW MUSIC SHOP!!!." + "\n");

        System.out.println("Please enter how many Guitars you have in your musicshop: ");
        int initialGuitarCount = IntScanner.getPositiveInt();

        System.out.println("Please enter how many Trumpets you have in your musicshop:");
        int initialTrumpetCount = IntScanner.getPositiveInt();

        System.out.println("Please enter how many Piano you have in your musicshop:");
        int initialPianoCount = IntScanner.getPositiveInt();

        fillShop(initialGuitarCount, initialTrumpetCount, initialPianoCount);
    }

    private void fillShop(int guitarCount, int trumpetCount, int pianoCount) {

        for (int i = 0; i < guitarCount; i++) {
            guitars.add(new Guitar());
        }

        for (int i = 0; i < trumpetCount; i++) {
            trumpets.add(new Trumpet());
        }

        for (int i = 0; i < pianoCount; i++) {
            pianos.add(new Piano());
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
}

//int initialGuitarCount = 0;
//если можно не инициализировать явно - лучше этого не делать. Это произойдет автоматически.

//for(int i = 0; i < order.get("guitars");i++) - потерялся отступ

//private List<MusicInstrument> shipInstruments(Map<String, Integer> order){}  - можно сделать void

//все поля этого класса можно сделать final

//private List<MusicInstrument> musicInstruments = new ArrayList<MusicInstrument>();
//==
//private List<MusicInstrument> musicInstruments = new ArrayList<>();