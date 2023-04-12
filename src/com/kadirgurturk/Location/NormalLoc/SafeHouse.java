package com.kadirgurturk.Location.NormalLoc;

import com.kadirgurturk.Characters.Player;

public class SafeHouse extends NormalLoc{
    public SafeHouse(Player player) {
        super(player, "Güvenli Ev");
    }

    @Override
    public boolean onLocation() {
        if(super.getPlayer() != null){
            return true;
        }

        return false;
    }

    @Override
    public void Location() {
        System.out.println("-------------------");
        System.out.println("Guvenli Evdesiniz. Caniniz Fulleniyor");
        var id = getPlayer().getCharacter().getId();

        switch (id){
            case 1:{
                super.getPlayer().getCharacter().setHealth(21);
                System.out.println("Samuray Cani Fullendi");
                break;
            }
            case 2:{
                super.getPlayer().getCharacter().setHealth(18);
                System.out.println("Okçu Cani Fullendi");
                break;
            }
            case 3:{
                super.getPlayer().getCharacter().setHealth(24);
                System.out.println("Sovalye Cani Fullendi");
                break;
            }
        }
    }
}
