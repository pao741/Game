package Entities.Boss;

import Entities.Entities;

public class AnimatedGolem extends Entities {
    private static int health;

    private static int maxHealth;

    private final int ATTACK = 25;

    public AnimatedGolem(){
        maxHealth = 120;
        health = 120;
        isAlive = true;
    }


    public String getName() {
        return "Animated Golem";
    }

    public void setHealth(int health) {
        this.health = health;
        if (this.health <= 0){
            isAlive = false;
        }
    }

    public int getHealth() {
        return health;
    }

    public int getATTACK() {
        return ATTACK;
    }

    @Override
    public int getMaxHealth() {
        return maxHealth;
    }
}
