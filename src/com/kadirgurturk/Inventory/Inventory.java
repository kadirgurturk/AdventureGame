package com.kadirgurturk.Inventory;

import com.kadirgurturk.Items.Armor.Armor;
import com.kadirgurturk.Items.Item;
import com.kadirgurturk.Items.Weapon.Weapon;

public class Inventory {
    private boolean water;
    private boolean food;
    private boolean firewoord;
    private Item armor;
    private Item weapon;

    public boolean isWater() {
        return water;
    }

    public void setWater(boolean water) {
        this.water = water;
    }

    public boolean isFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public boolean isFirewoord() {
        return firewoord;
    }

    public void setFirewoord(boolean firewoord) {
        this.firewoord = firewoord;
    }

    public Item getArmor() {
        return armor;
    }

    public void setArmor(Item armor) {
        this.armor = armor;
    }

    public Item getWeapon() {
        return weapon;
    }

    public void setWeapon(Item weapon) {
        this.weapon = weapon;
    }
}
