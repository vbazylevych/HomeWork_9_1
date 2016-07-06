package com.goit.javaonline3.musicshop;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Ler4enko on 30.05.2016.
 */
public class Piano extends MusicInstrument{
    public String color;

    public Piano(String producer, double price, String color) {
        super(price, producer);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
