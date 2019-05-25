package Entities;

public class SmallSlime extends Entities{
    private static int health;
    private final int attack = 10;

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

    public int getAttack() {
        return attack;
    }

}
