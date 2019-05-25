package Entities.Boss;

import Entities.Entities;

public class GiantRat extends Entities {
    private static int health;
    private final int ATTACK = 30;

    public GiantRat(){
        health = 90;
        isAlive = true;
    }
    public String getName() {
        return "GiantRat";
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
