package com.kadirgurturk.Location.NormalLoc;

import com.kadirgurturk.Characters.Player;
import com.kadirgurturk.Location.Location;

public class NormalLoc extends Location {


    public NormalLoc(Player player, String name) {
        super(player, name);
    }

    @Override
    public boolean onLocation() {
        return false;
    }

    @Override
    public void Location() {

    }
}
