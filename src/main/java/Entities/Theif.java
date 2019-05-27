package Entities;

public class Theif extends Entities {
    private static int health;
    private final int ATTACK = 20;
    private static int maxHealth;

    Theif(){

        health = 20;
        isAlive = true;
    }

    public String getName() {
        return "Theif";
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
