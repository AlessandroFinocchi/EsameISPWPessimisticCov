package org.example;

import java.util.HashMap;

public class ThingsSeller {

    private int actualMoney;
    private HashMap<String, Integer> Items;

    public ThingsSeller(){
        actualMoney = 0;
        Items = new HashMap<>();
        Items.put("forchetta", 1);
        Items.put("bicchiere", 3);
        Items.put("penna", 2);
        Items.put("computer", 500);
        Items.put("pantalone", 10);
    }

    public int sellSomething(String item){
        return actualMoney += Items.get(item);
    }

    public int getActualMoney() {
        return actualMoney;
    }

}
