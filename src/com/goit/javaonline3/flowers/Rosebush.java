package com.goit.javaonline3.flowers;

import java.util.List;

/**
 * Created by Ler4enko on 27.05.2016.
 */
public class Rosebush {
    private List<Rose> Roses;
    private double price;

    public List<Rose> getRoses() {
        return Roses;
    }

    public void setRoses(List<Rose> roses) {
        Roses = roses;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
