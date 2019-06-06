package Entities;

public class Rat extends Entities{
    private static int health;
    private static int maxHealth;
    private final int ATTACK = 10;

    Rat(){
        maxHealth = 30;
        health = 30;
        isAlive = true;
    }

    public String getName() {
        return "Rat";
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
