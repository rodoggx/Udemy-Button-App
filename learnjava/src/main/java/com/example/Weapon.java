package com.example;

/**
 * Created by admin on 10/20/2016.
 */

public class Weapon {
    private String name;
    private int damage;
    private int points;

    public Weapon(String name, int damage, int points) {
        super();
        this.name = name;
        this.damage = damage;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
