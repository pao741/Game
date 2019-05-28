package Entities;

public class SmallSlime extends Entities{
    private static int health;
    private final int ATTACK = 10;
    private static int maxHealth;

    SmallSlime(){
        maxHealth = 10;
        health = 10;
        isAlive = true;
    }
    public String getName() {
        return "Small Slime";
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
