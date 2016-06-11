package com.goit.javaonline3.shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Ler4enko on 30.05.2016.
 */
public class MusicShop {
    private List<MusicInstrument> musicInstruments = new ArrayList<MusicInstrument>();
    private List<Guitar> guitars = new ArrayList<Guitar>();
    private List<Trumpet> trumpets = new ArrayList<Trumpet>();
    private List<Piano> pianos = new ArrayList<Piano>();


    public void openShop() {
        int initialGuitarCount = 0;
        int initialPianoCount = 0;
        int initialTrumpetCount = 0;

        System.out.println("Congratulation! You just opened your MUSIC SHOP!!!." + "\n" + "\n");

        System.out.println("Please enter how many Guitars you have in your shop: ");
        initialGuitarCount = GetInt.getPositiveInt();

        System.out.println("Please enter how many Trumpets you have in your shop:");
        initialTrumpetCount = GetInt.getPositiveInt();

        System.out.println("Please enter how many Piano you have in your shop:");
        initialPianoCount = GetInt.getPositiveInt();

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

    public void inventory(){
        musicInstruments.clear();
        musicInstruments.addAll(guitars);
        musicInstruments.addAll(trumpets);
        musicInstruments.addAll(pianos);
    }

    public void handleOrder(Map<String, Integer> order){

        if (order.get("guitars") <= guitars.size() && order.get("trumpets") <= trumpets.size()
                && order.get("pianos") <= pianos.size() ){
            shipInstruments(order);
        } else {
            whatWentWrong(order);
        }
    }

    private List<MusicInstrument> shipInstruments(Map<String, Integer> order){

        for(int i = 0; i < order.get("guitars");i++){
          guitars.remove(i);
        }

        for(int i = 0; i < order.get("trumpets");i++){
            trumpets.remove(i);
        }

        for(int i = 0; i < order.get("pianos");i++){
            pianos.remove(i);
        }

        inventory();
        return musicInstruments;
    }

    private void whatWentWrong(Map<String, Integer> order) throws IllegalArgumentException{
        if (order.get("guitars") > guitars.size()) {
            throw new IllegalArgumentException("Count of wanted guitars is more than " +
                    "currently present in the shop");
        }

        if (order.get("trumpets") > trumpets.size()) {
            throw new IllegalArgumentException("Count of wanted trumpets is more than " +
                    "currently present in the shop");
        }

        if (order.get("pianos") > pianos.size()) {
            throw new IllegalArgumentException("Count of wanted pianos is more than " +
                    "currently present in the shop");
        }
    }

    public List<MusicInstrument> getMusicInstruments() {
        return musicInstruments;
    }
}
