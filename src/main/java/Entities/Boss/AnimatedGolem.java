package Entities.Boss;

import Entities.Entities;

public class AnimatedGolem extends Entities {
    private static int health;
    private final int attack = 25;

    public AnimatedGolem(){
        health = 120;
    }


    public String getName() {
        return "Animated Gloem";
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }
}
