package com.kadirgurturk.Items.Armor;

import com.kadirgurturk.Items.Item;

public abstract class Armor extends Item {
    private int id;
    private String name;
    private int Defense;
    private int price;

    public Armor(int id, String name, int defense, int price) {
        this.id = id;
        this.name = name;
        Defense = defense;
        this.price = price;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getDefense() {
        return Defense;
    }


}
