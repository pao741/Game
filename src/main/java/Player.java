import Item.Consumable.Bandage;
import Item.Consumable.Consumable;
import Item.Item;
import Item.Weapon.Stick;
import Item.Weapon.Weapon;

import java.util.ArrayList;

public class Player {

    private static int health;

    private static int maxHealth = 20;

    private static int exp = 0;

    private static ArrayList<Consumable> inventory;

    private static Weapon weapon;

    private static int[] position;

    private static int level;

    Player(){
        level = 1;
        position = new int[]{2,0};
        health = 20;
        weapon = new Stick();
        inventory.add(new Bandage());
        inventory.add(new Bandage());
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

    public static int getHealth() {
        return health;
    }

    public static void setHealth(int health) {
        Player.health = health;
    }

    public static int getMaxHealth() {
        return maxHealth;
    }

    public static void setMaxHealth(int maxHealth) {
        Player.maxHealth = maxHealth;
    }

    public static void increaseExp(int exp) {
        Player.exp += exp;
        while(exp > level * 10){
            exp -= level * 10;
            level += 1;
        }
    }

    public static ArrayList<Consumable> getInventory() {
        return inventory;
    }

    public static void setInventory(ArrayList<Consumable> inventory) {
        Player.inventory = inventory;
    }

    public static Weapon getWeapon() {
        return weapon;
    }

    public static void setWeapon(Weapon weapon) {
        Player.weapon = weapon;
    }

    public static int[] getPosition() {
        return position;
    }

    public static void setPosition(int[] position) {
        Player.position = position;
    }
}
