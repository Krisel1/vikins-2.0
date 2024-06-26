package org.example.war;

import org.example.saxon.Saxon;
import org.example.soldier.Soldier;
import org.example.vikins.Vikings;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class War {
    private final List<Vikings> vikingArmy;
    private final List<Saxon> saxonArmy;
    private final Random random;

    public War() {
        this.vikingArmy = new ArrayList<>();
        this.saxonArmy = new ArrayList<>();
        this.random = new Random();
    }

    public List<Saxon> getSaxonArmy() {
        return this.saxonArmy;
    }
    public List<Vikings> getVikingArmy() {
        return this.vikingArmy;
    }

    public void addViking(Vikings vikings) {
        vikingArmy.add(vikings);
    }

    public void addSaxon(Saxon saxon) {
        saxonArmy.add(saxon);
    }

    public String vikingAttack() {
        if (saxonArmy.isEmpty()) {
            return null;
        }

        Vikings randomViking = vikingArmy.get(random.nextInt(vikingArmy.size()));
        Saxon randomSaxon = saxonArmy.get(random.nextInt(saxonArmy.size()));

        int damage = randomViking.attack();
        randomSaxon.receiveDamage(damage);
        if (randomSaxon.getHealth() <= 0) {
            saxonArmy.remove(randomSaxon);
            return "A Saxon has died in combat";
        } else {
            return "A Saxon has received " + damage + " points of damage";
        }
    }

    public String saxonAttack() {
        if (vikingArmy.isEmpty()) {
            return "No Vikings left to attack";
        }

        Vikings randomViking = vikingArmy.get(random.nextInt(vikingArmy.size()));

        int damage = saxonArmy.get(random.nextInt(saxonArmy.size())).attack();
        randomViking.receiveDamage(damage);

        if (randomViking.getHealth() <= 0) {
            vikingArmy.remove(randomViking);
            return randomViking.getName() + " has died in act of combat";
        } else {
            return randomViking.getName() + " has received " + damage + " points of damage";
        }
    }

    public String showStatus() {
        if (saxonArmy.isEmpty() && !vikingArmy.isEmpty()) {
            return "Vikings have won the war of the century!";
        } else if (vikingArmy.isEmpty() && !saxonArmy.isEmpty()) {
            return "Saxons have fought for their lives and survive another day...";
        } else {
            return "Vikings and Saxons are still in the thick of battle.";
        }
    }
}


