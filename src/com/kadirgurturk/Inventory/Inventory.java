package com.kadirgurturk.Inventory;

import com.kadirgurturk.Items.Armor.Armor;
import com.kadirgurturk.Items.Item;
import com.kadirgurturk.Items.Weapon.Weapon;

public class Inventory {
    private boolean water = false;
    private boolean food = false;
    private boolean firewoord = false;
    private Armor armor;
    private Weapon weapon;

    public String checkItem(boolean ıtem){
            if(ıtem){
                return "var";
            }
            else{
                return "yok";
            }
    }

    public String checkItem(Item ıtem){
        if(ıtem != null){
            if(ıtem instanceof Weapon){
                return String.format(" adi: " + weapon.getName() + " hasari: " + weapon.getDamage());
            }else if(ıtem instanceof Armor){
                return String.format(" adi: " + armor.getName() + " savunmasi: " + armor.getDefense());
            }

        }else{
            return " Yok";
        }
        return null;
    }

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

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public Weapon getWeapon() {

        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
