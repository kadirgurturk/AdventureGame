package com.kadirgurturk.Items.Weapon;

import com.kadirgurturk.Items.Armor.LightArmor;

public class Gun extends Weapon{

    public Gun() {
        super(1, "Tabanca", 2, 25);
    }

    @Override
    public int hashCode() {
        return super.getName().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Gun && super.getName().equals(((Gun) obj).getName());
    }

    public String toString() {
        return String.format(
                "--------------------------------------"+ "\n"+
                        "Silahin Adi: " + super.getName() +"\n" +
                        "Silahin Hasari: " + super.getDamage() +"\n" +
                        "Silahin Fiyati: " + super.getPrice() +"\n" +
                        "--------------------------------------"+ "\n"
        );
    }
}
