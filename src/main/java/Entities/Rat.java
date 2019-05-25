package Entities;

public class Rat extends Entities{
    private static int health;
    private final int ATTACK = 15;

    Rat(){
        health = 30;
        isAlive = true;
    }

    public String getName() {
        return "Rat";
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
