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

    public int getStrength() {
        return strength;
    }

    public int attack(int damage) {
        return this.strength;
    }

    public void receiveDamage(int damage) {
        health -= damage;
    }

    public int setHealth(int i) {
        return this.health;
    }

    public String getName() {
        return getName;
    }
}
