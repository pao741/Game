package Entities.Boss;

import Entities.Entities;

public class BigSlime extends Entities {
    private static int health;
    private final int attack = 25;

    public BigSlime(){
        health = 80;
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

    public int getAttack() {
        return attack;
    }
}
