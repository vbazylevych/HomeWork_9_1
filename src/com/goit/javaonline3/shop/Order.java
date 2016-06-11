package com.goit.javaonline3.shop;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ler4enko on 11.06.2016.
 */
public class Order {
    private Map<String, Integer> order = new HashMap<String, Integer>() ;

    public void createOrder() {

        System.out.println("Please enter how many Guitars you want buy: ");
        order.put("guitars", GetInt.getPositiveInt());

        System.out.println("Please enter how many Trumpets you want buy:");
        order.put("trumpets",GetInt.getPositiveInt());

        System.out.println("Please enter how many Piano you you want buy");
        order.put("pianos", GetInt.getPositiveInt());
    }

    public Map<String, Integer> getOrder() {
        return order;
    }
}
