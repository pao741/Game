package Entities.Boss;

import Entities.Entities;

public class GiantRat extends Entities {
    private static int health;
    private final int ATTACK = 30;
    private static int maxHealth;

    public GiantRat(){
        maxHealth = 90;
        health = 90;
        isAlive = true;
    }
    public String getName() {
        return "GiantRat";
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
