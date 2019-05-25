package Entities;

public class Skeleton extends Entities {
    private static int health;
    private final int ATTACK = 25;

    Skeleton(){
        health = 40;
        isAlive = true;
    }

    public String getName() {
        return "Skeleton";
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
