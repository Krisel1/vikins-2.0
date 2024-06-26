package org.example.vikins;

import org.example.soldier.Soldier;

public class Vikings extends Soldier {
    public String name;
    private String msg;

    public Vikings(String name, int health, int strength, String msg) {
        super(health, strength);
        this.name = name;
        this.msg = msg;

    }

    public String getMsg() {

        return msg;
    }

    public void setMsg(String msg) {

        this.msg = msg;
    }

    public void receiveDamage(int damage) {
        this.health -= damage;
        if (this.health > 0) {
            this.msg = this.name + "has received" + damage + "points of damage";
        } else {
            this.msg = this.name + "has died in combat";
        }
    }

    public String battleCry() {

        return "Odin Owns You All!";
    }

    public String getName() {
        return name;
    }
}