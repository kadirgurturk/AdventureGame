package com.kadirgurturk.Obstacle;

public class Zombi extends Obstacle{
    private final int id = 2;

    public Zombi() {
        super(3, 10, 4);
    }

    public int getId() {
        return id;
    }
}
