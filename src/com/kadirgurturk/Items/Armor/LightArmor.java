package com.kadirgurturk.Items.Armor;

public class LightArmor extends Armor{
    public LightArmor() {
        super(1, "Hafif Zirh", 1, 15);
    }

    @Override
    public int hashCode() {
        return super.getName().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof LightArmor && super.getName().equals(((LightArmor) obj).getName());
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
