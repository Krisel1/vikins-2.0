package org.example.saxon;

import org.example.soldier.Soldier;

public class Saxon extends Soldier {
    public String msg;

    public Saxon(int health, int strength) {
        super(health, strength);

    }

    public  String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void receiveDamage(int damage) {
        this.health -= damage;
        if (this.health > 0) {
            this.msg = "A Saxon has received" + damage + "points of damage";
        } else {
            this.msg = "A Saxon has died in combat";
        }

    }

}


