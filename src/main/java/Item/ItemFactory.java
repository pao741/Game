package Item;

import Item.Consumable.*;
import Item.Weapon.*;

public class ItemFactory {
    public static Item createItem(String name){
        switch (name){
            case "Burnt Pan":
                BurntPan burntPan = new BurntPan();
                return burntPan;
            case "Real Knife":
                RealKnife realKnife = new RealKnife();
                return realKnife;
            case "Stick":
                Stick stick = new Stick();
                return stick;
            case "Torn Notebook":
                TornNotebook tornNotebook= new TornNotebook();
                return tornNotebook;
            case "Toy Knife":
                ToyKnife toyKnife = new ToyKnife();
                return toyKnife;
            case "Worn Dagger":
                WornDagger wornDagger = new WornDagger();
                return wornDagger;
            case "Bandage":
                Bandage bandage = new Bandage();
                return bandage;
            case "Bread":
                Bread bread = new Bread();
                return bread;
            case "Burger":
                Burger burger = new Burger();
                return burger;
            case "Instant Noodle":
                InstantNoodle instantNoodle = new InstantNoodle();
                return instantNoodle;
            case "Legendary Soda":
                LegendarySoda legendarySoda = new LegendarySoda();
                return legendarySoda;
            default:
                return null;

        }
    }
}
