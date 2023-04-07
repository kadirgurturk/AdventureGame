package com.kadirgurturk.Items.Armor;

public class MidArmor extends Armor{

    public MidArmor() {
        super(3, "Orta Zirh", 3, 25);
    }

    @Override
    public int hashCode() {
        return super.getName().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof MidArmor && super.getName().equals(((MidArmor) obj).getName());
    }

    public String toString() {
        return String.format(
                "--------------------------------------"+ "\n"+
                        "Zırhın Adı: " + super.getName() +"\n" +
                        "Zırhın Savunması: " + super.getDefense() +"\n" +
                        "Zırhın Fiyati: " + super.getPrice() +"\n" +
                        "--------------------------------------"+ "\n"
        );
    }
}
