package com.goit.javaonline3.musicshop;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Ler4enko on 30.05.2016.
 */
public class Guitar extends MusicInstrument {
    private String producer;
    private double price;
    private String type;

    public Guitar(String producer, double price, String type) {
        super(price, producer);
        this.producer = producer;
        this.price = price;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
