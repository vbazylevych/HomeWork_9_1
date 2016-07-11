package com.goit.javaonline3.musicshop;

/**
 * Created by Ler4enko on 30.05.2016.
 */
public class Guitar extends MusicInstrument {
    private String type;

    public Guitar(String producer) {
        super(producer);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
