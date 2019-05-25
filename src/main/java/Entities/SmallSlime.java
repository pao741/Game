package Entities;

public class SmallSlime extends Entities{
    private static int health;
    private final int ATTACK = 10;

    SmallSlime(){
        health = 10;
    }
    public String getName() {
        return "SmallSlime";
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
