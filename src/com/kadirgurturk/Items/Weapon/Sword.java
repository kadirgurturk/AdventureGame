package com.kadirgurturk.Items.Weapon;

public class Sword extends Weapon{

    public Sword() {
        super(2, "Kılıç", 3, 35);
    }

    @Override
    public int hashCode() {
        return super.getName().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Sword && super.getName().equals(((Sword) obj).getName());
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
