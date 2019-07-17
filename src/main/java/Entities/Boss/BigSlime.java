package Entities.Boss;

import Entities.Entities;

public class BigSlime extends Entities {
    private int health;
    private final int ATTACK = 25;
    private int maxHealth;

    public BigSlime(){
        maxHealth = 80;
        health = 80;
        isAlive = true;
    }

    public String getName() {
        return "Big Slime";
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
