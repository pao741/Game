import Entities.*;
import Item.*;
import Item.Weapon.Weapon;
import Level.*;

import java.io.IOException;
import java.util.ArrayList;

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

    public void move(String direction){
        int[] newPos = player.getPosition();
        try {
            if (direction.equals("north")) {
                newPos[0] -= 1;
                currentLevel.getMap().get(newPos[0]).get(newPos[1]);
                player.setPosition(newPos);
            } else if (direction.equals("south")) {
                newPos[0] += 1;
                currentLevel.getMap().get(newPos[0]).get(newPos[1]);
                player.setPosition(newPos);
            } else if (direction.equals("east")) {
                newPos[1] += 1;
                currentLevel.getMap().get(newPos[0]).get(newPos[1]);
                player.setPosition(newPos);
            } else if (direction.equals("west")) {
                newPos[1] -= 1;
                currentLevel.getMap().get(newPos[0]).get(newPos[1]);
                player.setPosition(newPos);
            } else{
                System.out.println("Direction choices: north/south/east/west");
            }
        }catch (IndexOutOfBoundsException e){
            System.out.println("Invalid move: You can't go there");
        }
    }

    void info(String[] arg){
        int[] playerPos = player.getPosition();
        String command = arg[0];
        if (command.equals("room")) {
            currentLevel.getMap().get(playerPos[0]).get(playerPos[1]).getRoomInfo();
        }else if (command.equals("player")){
            player.printPlayerInfo();
        }else if (command.equals("inventory")){
            player.inventoryInfo();
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
            currentLevel.getMap().get(playerPos[0]).get(playerPos[1]).setRoomClear();
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
                        currentLevel.getMap().get(playerPos[0]).get(playerPos[1]).setRoomClear();
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
        System.out.println("\n");
        for (int i = 0; i < 4; i++){
            System.out.println("\t");
            for (int j = 0; j < 4; j++){
                if (i == playerPos[0] && j == playerPos[1]){
                    System.out.println("Current room");
                }else {
                    map.get(i).get(j).getName();
                }
                map.get(i).get(j).roomState();
                System.out.println("\t");
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
        String enemy = arg[0];
        Weapon weapon;
        try {
            weapon = (Weapon) ItemFactory.createItem(arg[1]);
        }catch(Exception e){
            System.out.println(arg[1] + " is not a weapon");
            return;
        }
        if (currentLevel.getMap().get(pos[0]).get(pos[1]) instanceof EnemyRoom){
            if (currentLevel.getMap().get(pos[0]).get(pos[1]) instanceof BossRoom){
                BossRoom currentRoom = (BossRoom)currentLevel.getMap().get(pos[0]).get(pos[1]);
                ArrayList<Entities> bosses = currentRoom.getBosses();
                if (bosses.contains(EntitiesFactory.createEntities(enemy))){
                    Entities target = bosses.get(bosses.indexOf(EntitiesFactory.createEntities(enemy)));
                    target.setHealth(target.getHealth() - weapon.getAttackValue());
                }
            }else{
                EnemyRoom currentRoom = (EnemyRoom)currentLevel.getMap().get(pos[0]).get(pos[1]);
                ArrayList<Entities> enemies = currentRoom.getEnemies();
            }

        }else{
            System.out.println("There is no enemy to fight");
        }
    }




}
