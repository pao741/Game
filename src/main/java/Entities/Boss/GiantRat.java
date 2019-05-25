package Entities.Boss;

import Entities.Entities;

public class GiantRat extends Entities {
    private static int health;
    private final int attack = 30;

    public GiantRat(){
        health = 90;
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

    public int getAttack() {
        return attack;
    }

}
