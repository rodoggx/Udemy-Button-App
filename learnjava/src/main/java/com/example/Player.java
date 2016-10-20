package com.example;

/**
 * Created by admin on 10/20/2016.
 */

public class Player {
    private String name;
    private int lives;
    private int level;
    private int score;
    private Weapon weapon;

    public Player() {
        this.name = "Unknown";
        this.lives = 3;
        this.level = 1;
        this.score = 0;
        setDefaultWeapon();
    }

    public Player(String handle) {
        this();
        setName(handle);
    }

    public Player(String handle, int level) {
        this();
        setName(handle);
        setLevel(level);
    }

    public void setDefaultWeapon() {
        this.weapon = new Weapon("Sword", 10, 20);
    }

    public void setName(String handle) {
        if (handle.length() < 3)
            return;
        name = handle;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    //end of class
}
