import Item.Item;
import Level.*;

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

    void info(){
        int[] playerPos = player.getPosition();
        currentLevel.getMap().get(playerPos[0]).get(playerPos[1]).getRoomInfo();
    }

    void take(String arg){
        int[] playerPos = player.getPosition();
        if (currentLevel.getMap().get(playerPos[0]).get(playerPos[1]) instanceof LootRoom) {
            currentLevel.getMap().get(playerPos[0]).get(playerPos[1]).setRoomClear();
            ArrayList<Item> loot = ((LootRoom) currentLevel.getMap().
                    get(playerPos[0]).get(playerPos[1])).takeItems();
            for (Item item : loot) {
                player.give(item);
            }
        } else {
            System.out.println("\tThis is now a loot room. There is nothing to take");
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




}
