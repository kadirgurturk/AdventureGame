package com.kadirgurturk.Characters;

import com.kadirgurturk.Inventory.Inventory;

public abstract class Character {
    private int damage;
    private int health;
    private int money;
    private final int id;

    public Character(int damage, int health, int money,int id) {
        this.damage = damage;
        this.health = health;
        this.money = money;
        this.id = id;
    }

    public abstract String getCharacterName();

    public int getId() {
        return id;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
