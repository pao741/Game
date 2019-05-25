package Entities;

public class Rat extends Entities{
    private static int health;
    private final int attack = 15;

    Rat(){
        health = 30;
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

    public int getAttack() {
        return attack;
    }

}
