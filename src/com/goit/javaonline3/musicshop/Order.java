package com.goit.javaonline3.musicshop;


import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ler4enko on 11.06.2016.
 */
public class Order {
    private final Map<String, Integer> order = new HashMap<>() ;

    public void createOrder(MyScanner myScanner) {

        System.out.println("Please enter how many Guitars you want buy: ");
        order.put("guitars", myScanner.getPositiveInt());

        System.out.println("Please enter how many Trumpets you want buy:");
        order.put("trumpets", myScanner.getPositiveInt());

        System.out.println("Please enter how many Piano you you want buy");
        order.put("pianos", myScanner.getPositiveInt());
    }

    public void printOrder(){
        System.out.println("Your order:");
        System.out.println("Guitars:" + order.get("guitars"));
        System.out.println("Trumpet:" + order.get("trumpets"));
        System.out.println("Pianos:" + order.get("pianos"));
    }

    public Map<String, Integer> getOrder() {
        return order;
    }
}