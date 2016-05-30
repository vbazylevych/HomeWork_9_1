package com.goit.javaonline3.files;

import java.awt.*;
import java.util.List;

/**
 * Created by Ler4enko on 30.05.2016.
 */
public class GeneralFile {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println("Play File");
    }
}
