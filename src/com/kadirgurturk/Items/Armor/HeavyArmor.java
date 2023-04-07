package com.kadirgurturk.Items.Armor;

public class HeavyArmor extends Armor{

    public HeavyArmor() {
        super(3, "Ağır Zırh", 5, 40);
    }

    @Override
    public int hashCode() {
        return super.getName().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof HeavyArmor && super.getName().equals(((HeavyArmor) obj).getName());
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
