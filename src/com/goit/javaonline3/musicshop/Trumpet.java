package com.goit.javaonline3.musicshop;

/**
 * Created by Ler4enko on 30.05.2016.
 */
public class Trumpet extends MusicInstrument{
    private String producer;
    private double price;
    private String type;

    public Trumpet(String producer, double price) {
        super(price, producer);
        this.producer = producer;
        this.price = price;
    }
}
