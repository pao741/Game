import Item.Consumable.*;
import Item.*;
import Item.Weapon.*;

import java.util.ArrayList;

public class Player {

    private static int health;

    private static int maxHealth;

    private static int exp;

    private static ArrayList<Item> inventory;

    private static int[] position;

    private static int level;

    Player(){
        exp = 0;
        maxHealth = 20;
        inventory = new ArrayList<Item>();
        level = 1;
        position = new int[]{2,0};
        health = 20;
        inventory.add(ItemFactory.createItem("Stick"));
        inventory.add(ItemFactory.createItem("Bandage"));
        inventory.add(ItemFactory.createItem("Bandage"));
    }

    public void levelUp(){
        maxHealth += 10;
        health = maxHealth;
    }

    public void playerInfo(){
        System.out.println("Player Health : " + health +"/"+maxHealth + "HP");
    }

    public void inventoryInfo(){
        System.out.println("Inventory :\n");
        for (int i = 0; i < inventory.size(); i++){
            System.out.print("\t"+inventory.get(i).getName());
            if (inventory.get(i)instanceof Consumable){
                Consumable consumable = (Consumable) inventory.get(i);
                System.out.println(": restores " + consumable.getRestores() + " HP");
            }else{
                Weapon weapon = (Weapon) inventory.get(i);
                System.out.println(": " + weapon.getAttackValue() + " ATK");
            }
        }
    }

    public void useConsumable(Consumable consumable){
        System.out.println("You used " + consumable.getName());
        health += consumable.getRestores();
        System.out.println("You are healed for : " + consumable.getRestores());
        inventory.remove(consumable);
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public void increaseExp(int exp) {
        this.exp += exp;
        while(this.exp > level * 10){
            this.exp -= level * 10;
            level += 1;
        }
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Item> inventory) {
        this.inventory = inventory;
    }

    public int[] getPosition() {
        return position;
    }

    public void setPosition(int[] position) {
        Player.position = position;
    }

    public void give(Item item){
        inventory.add(item);
        System.out.println("You got a " + item.getName());
    }

    public void printPlayerInfo(){
        System.out.println("Player: " + getHealth() + "/" + getHealth() + "HP");
    }

    public Weapon getWeapon(Weapon weapon){
        for (int i = 0; i < inventory.size();i++){
            if (inventory.get(i) instanceof Weapon){
                return (Weapon)inventory.get(i);
            }
        }
        return null;
    }
    public boolean have(Item item){
        for (int i = 0; i < inventory.size(); i++){
            if (inventory.get(i).getName().equals(item.getName())){
                return true;
            }
        }
        return false;
    }
}
