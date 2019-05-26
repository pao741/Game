import Item.Consumable.*;
import Item.Item;
import Item.ItemFactory;
import Item.Weapon.*;

import java.util.ArrayList;
import java.util.Random;

public class LootRoom {

    private static ArrayList<Item> loot = new ArrayList<Item>();

    private final double bandage = 0.99;

    private final double bread = 0.80;

    private final double instantNoodle = 0.55;

    private final double burger = 0.35;

    private final double legendarySoda = 0.05;

    private Random rand = new Random();

    LootRoom(int level){
        if (level == 1){
            spawnItem(1);
        }else if(level == 2){
            spawnItem(2);
            spawnItem(2);

        }else if(level == 3){
            spawnItem(3);
            spawnItem(3);
            spawnItem(3);
        }
    }

    public void spawnConsumable(){
        double num = rand.nextDouble();
        if (num <= legendarySoda){
            LegendarySoda legendarySoda = (LegendarySoda) ItemFactory.createItem("Legendary Soda");
            loot.add(legendarySoda);
        }else if(num <= burger){
            Burger burger = (Burger)ItemFactory.createItem("Burger");
            loot.add(burger);
        }else if(num <= instantNoodle){
            InstantNoodle instantNoodle = (InstantNoodle) ItemFactory.createItem("Instant Noodle");
            loot.add(instantNoodle);
        }else if(num <= bread){
            Bread bread = (Bread)ItemFactory.createItem("Bread");
            loot.add(bread);
        }else if (num <= bandage){
            Bandage bandage = (Bandage)ItemFactory.createItem("Bandage");
            loot.add(bandage);
        }

    }

    public void spawnItem(int level){
        double num = rand.nextDouble();
        if (num > 0.50){
            spawnConsumable();
        }else{
            spawnWeapon(level);
        }
    }
    public void spawnWeapon(int level){
        double num = rand.nextDouble();
        if (level == 1){
            if (num >= 0.50){
                TornNotebook tornNotebook = (TornNotebook)ItemFactory.createItem("Torn Notebook");
                loot.add(tornNotebook);
            }else{
                BurntPan burntPan = (BurntPan)ItemFactory.createItem("Burnt Pan");
                loot.add(burntPan);
            }
        }else{
            if (num >= 0.50){
                ToyKnife toyKnife = (ToyKnife) ItemFactory.createItem("Toy Knife");
                loot.add(toyKnife);
            }else{
                WornDagger wornDagger= (WornDagger) ItemFactory.createItem("Worn Dagger");
                loot.add(wornDagger);
            }
        }
    }

}
