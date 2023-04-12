package com.kadirgurturk.Location.BattleLoc;

import com.kadirgurturk.Characters.Player;
import com.kadirgurturk.Location.Location;
import com.kadirgurturk.Obstacle.Ayı;
import com.kadirgurturk.Obstacle.Obstacle;

import java.util.ArrayList;

public abstract class BattleLoc extends Location {

    public BattleLoc(Player player, String name) {
        super(player, name);

    }

    public abstract void combat();

    @Override
    public boolean onLocation() {
        return false;
    }

    @Override
    public void Location() {

    }
}
