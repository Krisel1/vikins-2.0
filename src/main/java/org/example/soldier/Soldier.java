package org.example.soldier;

public class Soldier {
    public int health;
    public int strength;
    public String getName;

    public Soldier(int health, int strength) {
        this.health = health;
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int attack() {
        return this.strength;
    }

    public void receiveDamage(int damage) {
        health -= damage;
    }

}
