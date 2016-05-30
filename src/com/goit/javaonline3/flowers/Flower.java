package com.goit.javaonline3.flowers;

/**
 * Created by Ler4enko on 27.05.2016.
 */
public class Flower {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private void bloom(){
        System.out.println("Bloom!");
    }


}
