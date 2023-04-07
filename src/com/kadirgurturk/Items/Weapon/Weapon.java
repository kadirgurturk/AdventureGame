package com.kadirgurturk.Items.Weapon;

import com.kadirgurturk.Items.Item;

public abstract class Weapon extends Item {
    private int id;
    private String name;
    private int Damage;
    private int price;

    public Weapon(int id, String name, int damage, int price) {
        this.id = id;
        this.name = name;
        Damage = damage;
        this.price = price;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public int getDamage() {
        return Damage;
    }



    public int getPrice() {
        return price;
    }

}
