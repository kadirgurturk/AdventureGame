package com.kadirgurturk.Items.Weapon;

public class Rifle extends Weapon {

    public Rifle() {
        super(3, "Tüfek", 7, 45);
    }

    @Override
    public int hashCode() {
        return super.getName().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Rifle && super.getName().equals(((Rifle) obj).getName());
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
