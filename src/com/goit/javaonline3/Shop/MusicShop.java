package com.goit.javaonline3.Shop;

import java.util.List;

/**
 * Created by Ler4enko on 30.05.2016.
 */
public class MusicShop {
    private List<MusicInstrument> MusicInstrument;

    public List<com.goit.javaonline3.Shop.MusicInstrument> getMusicInstrument() {
        return MusicInstrument;
    }

    public void setMusicInstrument(List<com.goit.javaonline3.Shop.MusicInstrument> musicInstrument) {
        MusicInstrument = musicInstrument;
    }
}
