package com.kadirgurturk.Items.Armor;

import com.kadirgurturk.Items.Item;

public abstract class Armor extends Item {
    private int defense;

    public Armor(int id, String name, int defense, int price) {
        super(id, name, price);
        this.defense = defense;
    }

    public int getDefense() {
        return defense;
    }


}
