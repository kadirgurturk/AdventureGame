package com.kadirgurturk.Characters;

import com.kadirgurturk.Inventory.Inventory;

public class Player {
    private Inventory inventory;
    private Character character;
    private String name;

    public Player(Character character, String name) {
        this.inventory = new Inventory();
        this.character = character;
        this.name = name;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
