import Level.*;

import java.util.ArrayList;

public class Tranverser {
    private Player player;
    private Map currentLevel;
//    private ArrayList<Room> grid;

    public Tranverser(){
        currentLevel = new LevelOne();
        player = new Player();
    }

    public void move(String direction){
        int[] newPos = player.getPosition();
        try {
            if (direction.equals("north")) {
                newPos[0] -= 1;
                player.setPosition(newPos);
            } else if (direction.equals("south")) {
                newPos[0] += 1;
                player.setPosition(newPos);
            } else if (direction.equals("east")) {
                newPos[1] += 1;
                player.setPosition(newPos);
            } else if (direction.equals("west")) {
                newPos[1] -= 1;
                player.setPosition(newPos);
            } else{
                System.out.println("Direction choices: north/south/east/west");
            }
        }catch (IndexOutOfBoundsException e){
            System.out.println("You can't go there");
        }
    }


}
