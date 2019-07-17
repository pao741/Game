package Entities;

public abstract class Entities {
    public boolean isAlive;

    public abstract String getName();
    public abstract void setHealth(int health);
    public abstract int getHealth();
    public abstract int getATTACK();
    public abstract int getMaxHealth();

    public void takeDamage(int damage){
        setHealth(getHealth() - damage);
    }

    public void getInfo(){
        System.out.println(getName() + ": " + getHealth() + "/" + getMaxHealth()+ "hp");
    }

}
