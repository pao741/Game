import Item.Consumable.*;
import Item.*;
import Item.Weapon.*;

import java.util.ArrayList;

public class Player {

    private static int health;

    private static int maxHealth = 20;

    private static int exp = 0;

    private static ArrayList<Item> inventory = new ArrayList<Item>();

    private static Weapon weapon;

    private static int[] position;

    private static int level;

    Player(){
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
        System.out.println("Health : " + health);
        System.out.println("Weapon : " + weapon.getName() + " ATK : " + weapon.getAttackValue());
    }

    public void inventoryInfo(){
        System.out.println("Inventory :\n");
        for (int i = 0; i < inventory.size(); i++){
            System.out.println("\t"+inventory.get(i).getName());
        }
    }

    public void useConsumable(Consumable consumable){
        health += consumable.getRestores();
        System.out.println("You are healed for : " + consumable.getRestores());
        inventory.remove(consumable);
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        Player.health = health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        Player.maxHealth = maxHealth;
    }

    public void increaseExp(int exp) {
        this.exp += exp;
        while(exp > level * 10){
            exp -= level * 10;
            level += 1;
        }
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Item> inventory) {
        Player.inventory = inventory;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        Player.weapon = weapon;
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
}
