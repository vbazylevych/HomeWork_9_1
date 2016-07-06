package com.goit.javaonline3.musicshop;

/**
 * Created by Ler4enko on 30.05.2016.
 */
public class Guitar extends MusicInstrument {
    private String type;

    public Guitar(String producer, double price, String type) {
        super(price, producer);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
