package Entities.Boss;

import Entities.Entities;

public class BigSlime extends Entities {
    private static int health;
    private final int ATTACK = 25;


    public BigSlime(){
        health = 80;
        isAlive = true;
    }

    public String getName() {
        return "Big Slime";
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public int getATTACK() {
        return ATTACK;
    }
}
