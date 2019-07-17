package Entities;

public class Skeleton extends Entities {
    private int health;
    private final int ATTACK = 10;
    private int maxHealth;

    Skeleton(){
        maxHealth = 40;
        health = 40;
        isAlive = true;
    }

    public String getName() {
        return "Skeleton";
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
