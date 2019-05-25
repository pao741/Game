package Entities;

public class Theif extends Entities {
    private static int health;
    private final int ATTACK = 20;

    Theif(){
        health = 20;
    }

    public String getName() {
        return "Theif";
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
