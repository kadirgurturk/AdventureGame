package com.kadirgurturk.Items.Weapon;

import com.kadirgurturk.Items.Item;

public abstract class Weapon extends Item {
    private int damage;

    public Weapon(int id, String name, int damage, int price) {
        super(id, name, price);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
