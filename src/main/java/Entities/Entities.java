package Entities;

public abstract class Entities {
    public boolean isAlive;

    public abstract String getName();
    public abstract void setHealth(int health);
    public abstract int getHealth();
    public abstract int getATTACK();

    public void getDamage(int damage){
        setHealth(getHealth() - damage);
    }

    public int attact(){
        return getATTACK();
    }

    public void introduce(){
        System.out.println("You see a " + getName() + " fast approach.");
    }

}
