package org.example.war;

import org.example.saxon.Saxon;
import org.example.vikins.Vikings;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class War {
    private final List<Vikings> vikingArmy;
    private final List<Saxon> saxonArmy;

    public War() {
        this.vikingArmy = new ArrayList<>();
        this.saxonArmy = new ArrayList<>();
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

        Random random = new Random();
        Vikings randomViking = vikingArmy.get(random.nextInt(vikingArmy.size()));
        Saxon randomSaxon = saxonArmy.get(random.nextInt(saxonArmy.size()));

        int damage = randomViking.attack(damage);
        randomSaxon.receiveDamage(damage);
        if (randomSaxon.getHealth() <= 0) {
            saxonArmy.remove(randomSaxon);
            return "A Saxon has died in combat";
        } else {
            return "A Saxon has received" + damage + "points of damage";
        }
    }

    public String saxonAttack() {
        if (vikingArmy.isEmpty()) {
            return "Vikings have won the war of the century";
        }

        Random random = new Random();
        Saxon randomSaxon = saxonArmy.get(random.nextInt(saxonArmy.size()));
        Vikings randomViking = vikingArmy.get(random.nextInt(vikingArmy.size()));

        int damage = randomSaxon.attack(damage);
        randomViking.receiveDamage(damage);
        if (randomViking.getHealth() <= 0) {
            vikingArmy.remove(randomViking);
            return "Has died in combat";
        } else {
            return "Has received" + damage + "point of damage";
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


