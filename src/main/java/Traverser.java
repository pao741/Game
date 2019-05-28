import Entities.*;
import Item.*;
import Item.Consumable.Consumable;
import Item.Weapon.Weapon;
import Level.*;

import java.io.Console;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Traverser {
    private static Player player;
    private static Map currentLevel;
    private static int level;
//    private ArrayList<Room> grid;

    public Traverser(){
        level = 1;
        currentLevel = new LevelOne();
        player = new Player();
    }

    public void move(String[] arg){
        String direction = arg[0];
        int[] newPos = player.getPosition();
            if (direction.equals("north")) {
                try {
                    currentLevel.getMap().get(newPos[0]-1).get(newPos[1]);
                    System.out.println("You decided to go north");
                    newPos[0] -= 1;
                    player.setPosition(newPos);
                }catch (IndexOutOfBoundsException e){
                    System.out.println("Invalid move: You can't go there");
                }
            } else if (direction.equals("south")) {
                try{
                    currentLevel.getMap().get(newPos[0]+1).get(newPos[1]);
                    System.out.println("You decided to go south");
                    newPos[0] += 1;
                    player.setPosition(newPos);
                }catch (IndexOutOfBoundsException e){
                    System.out.println("Invalid move: You can't go there");
                }
            } else if (direction.equals("east")) {
                try{
                    currentLevel.getMap().get(newPos[0]).get(newPos[1]+1);
                    System.out.println("You decided to go east");
                    newPos[1] += 1;
                    player.setPosition(newPos);
                }catch (IndexOutOfBoundsException e){
                    System.out.println("Invalid move: You can't go there");
                }


            } else if (direction.equals("west")) {
                try{
                    currentLevel.getMap().get(newPos[0]).get(newPos[1]-1);
                    System.out.println("You decided to go west");
                    newPos[1] -= 1;
                    player.setPosition(newPos);
                }catch (IndexOutOfBoundsException e){
                    System.out.println("Invalid move: You can't go there");
                }

            } else{
                System.out.println("Direction choices: north/south/east/west");
            }
    }

    void info(String[] arg){
        if (arg.length == 0){
            System.out.println("Which info do you want to see?");
            System.out.println("Options: \'room\' \'player\' \'inventory\' ");
            return;
        }
        String command = arg[0];
        if (command.equals("room")) {
            printCurrentRoomInfo();
        }else if (command.equals("player")){
            player.printPlayerInfo();
            System.out.println("player pos: " + player.getPosition()[0] + ", " +player.getPosition()[1]);
        }else if (command.equals("inventory")) {
            player.inventoryInfo();
        }else if (command.equals("map")){
            printMap();
        }else{
            System.out.println("Which info do you want to see?");
            System.out.println("Options: \'room\' \'player\' \'inventory\' ");
        }
    }

    void take(String[] arg){
        String taking = arg[0];
        boolean taken = false;
        int[] playerPos = player.getPosition();
        if (currentLevel.getMap().get(playerPos[0]).get(playerPos[1]) instanceof LootRoom) {
            currentLevel.getMap().get(playerPos[0]).get(playerPos[1]).setIsCleared();
            ArrayList<Item> loot = ((LootRoom) currentLevel.getMap().
                    get(playerPos[0]).get(playerPos[1])).getLoot();
            for (Item item : loot) {
                if (taking.equals(item.getName())) {
                    Item giving = ((LootRoom) currentLevel.getMap().get(playerPos[0])
                            .get(playerPos[1])).takeItems(item.getName());
                    loot.remove(giving);
                    player.give(giving);
                    ((LootRoom) currentLevel.getMap()
                            .get(playerPos[0]).get(playerPos[1])).setLoot(loot);
                    if (loot.isEmpty()){
                        currentLevel.getMap().get(playerPos[0]).get(playerPos[1]).setIsCleared();
                    }
                    taken = true;
                }
            }
            if (!taken){
                System.out.println("There is no " + taking + " lying around");
            }
        } else {
            System.out.println("\tThis is not a loot room. There is nothing to take");
        }
    }

    public void printMap (){
        ArrayList<ArrayList<Room>> map = currentLevel.getMap();
        int[] playerPos = player.getPosition();
        System.out.print("\n");
        for (int i = 0; i < 4; i++){
            System.out.print("\t");
            for (int j = 0; j < 4; j++){
                if (i == playerPos[0] && j == playerPos[1]){
                    System.out.print("Current room: ");
                }else {
                    System.out.print(map.get(i).get(j).getName()+ ": " );
                }
                map.get(i).get(j).roomState();
                System.out.print(" | \t");
            }
            System.out.println();
        }
    }

    void printCurrentRoomInfo(){
        int[] pos = player.getPosition();
        currentLevel.getMap().get(pos[0]).get(pos[1]).getRoomInfo();
    }


    void attack(String[] arg){
        int[] pos = player.getPosition();
        if (!(currentLevel.getMap().get(pos[0]).get(pos[1]) instanceof LootRoom)){
    //        String[] splitArg = arg[0].split("(?<!\\G\\w)\\s");
            String enemy = arg[0];
            Scanner scanner = new Scanner(System.in);
            System.out.println("What weapon do you want to attack with?");
            String stringWeapon = scanner.nextLine();
            Weapon weapon = (Weapon)ItemFactory.createItem(stringWeapon);
            boolean attacked = false;
            try {
                if (player.have(weapon)) {
                    weapon = player.getWeapon(weapon);
                } else {
                    System.out.println("You don't have that weapon");
                    return;
                }
            }catch (Exception e){
                System.out.println(weapon + " is not a weapon");
                return;
            }
            if (currentLevel.getMap().get(pos[0]).get(pos[1]) instanceof BossRoom){
                BossRoom currentRoom = (BossRoom)currentLevel.getMap().get(pos[0]).get(pos[1]);
                ArrayList<Entities> bosses = currentRoom.getBosses();
                if (bosses.contains(EntitiesFactory.createEntities(enemy))){
                    int index = bosses.indexOf(EntitiesFactory.createEntities(enemy));
                    Entities target = bosses.get(index);
                    target.setHealth(target.getHealth() - weapon.getAttackValue());
                    bosses.set(index,target);
                    currentRoom.setBosses(bosses);
                }else{
                    System.out.println("You don't see any " + enemy);
                }
            }else{
                EnemyRoom currentRoom = (EnemyRoom)currentLevel.getMap().get(pos[0]).get(pos[1]);
                ArrayList<Entities> enemies = currentRoom.getEnemies();
                for (int i = 0; i < enemies.size(); i++){
                    Entities each = enemies.get(i);
                    if (each.getName().equals(enemy) && !attacked){
//                        each.getInfo();
//                        Entities target = enemies.get(enemies.indexOf(EntitiesFactory.createEntities(enemy)));
                        each.setHealth(each.getHealth() - weapon.getAttackValue());
                        enemies.set(i,each);
                        currentRoom.checkIfCleared();
                        currentRoom.setEnemies(enemies);
                        attacked = true;
                        System.out.println("You attack " + enemy + " for: " + weapon.getAttackValue() + " DMG");
                    }
                }
                if (attacked) {
                    for (Entities each : enemies) {
                        player.setHealth(player.getHealth() - each.getATTACK());
                        System.out.println(each.getName() + " attack you for : " + each.getATTACK() + " DMG");
                    }
                }else {
                    System.out.println("You don't see any " + enemy);
                }
                currentRoom.getRoomInfo();
            }

        }else{
            System.out.println("There is no enemy to fight");
        }
    }

    void drop(String[] arg){
        String droppingName = arg[0];
        Item droppingItem;
        try {
            droppingItem = ItemFactory.createItem(droppingName);
            ArrayList<Item> inventory = player.getInventory();
            if (inventory.contains(droppingItem)){
                inventory.remove(droppingItem);
                player.setInventory(inventory);
            }else {
                System.out.println("You don't have " + droppingName);
            }
        }catch (Exception e){
            System.out.println(droppingName + "is not a item");
        }
    }

    void clearRoom(){
        int[] pos = player.getPosition();
        currentLevel.getMap().get(pos[0]).get(pos[1]).setIsCleared();
        currentLevel.getMap().get(pos[0]).get(pos[1]).getRoomInfo();
    }

    void use(String[] arg){
        Consumable consumable;
        try {
            consumable = (Consumable)ItemFactory.createItem(arg[0]);
        }catch (Exception e){
            System.out.println(arg[0] + " is not a consumable item");
            return;
        }
        if (player.have(consumable)){
            player.setHealth(player.getHealth() + consumable.getRestores());
            ArrayList<Item> newInventory = player.getInventory();
            for (int i = 0; i < newInventory.size(); i++){
                if (newInventory.get(i).getName().equals(consumable.getName())){
                    newInventory.remove(i);
                    break;
                }
            }
            player.setInventory(newInventory);
            System.out.println(consumable.getName() + " is used");
        }else{
            System.out.println("You dont have " + arg[0]);
        }
    }


}
