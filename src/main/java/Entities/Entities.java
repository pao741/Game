package Entities;

import java.util.Random;

public abstract class Entities {
    public boolean isAlive;

    public abstract String getName();
    public abstract void setHealth(int health);
    public abstract int getHealth();
    public abstract int getAttack();

    public void getDamage(int damage){
        setHealth(getHealth() - damage);
    }

    public int attact(){
        return getAttack();
    }

    public void introduce(){
        System.out.println("You see a " + getName() + " fast approach.");
    }

}
