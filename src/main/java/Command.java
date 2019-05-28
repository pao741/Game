import Item.Item;
import Item.ItemFactory;

import java.util.ArrayList;
import java.util.Arrays;

public class Command {

    Traverser traverser;
    Player player;

    Command(){
        traverser = new Traverser();
        player = new Player();
    }

    public boolean doCommand(String command, String[] args){
        switch (command){
            case "take":
                traverser.take(args);
                return false;
            case "info":
                traverser.info(args);
                return false;
            case "quit":
                return true;
            case "help":
                printHelp();
                return false;
            case "drop":
                traverser.drop(args);
                return false;
            case "Roses":
                if (args[0].equals("are red, where is my wife?")){
                    System.out.println("I don't know why but here is your precious knife");
                    player.give(ItemFactory.createItem("Real Knife"));
                    return false;
                }
            case "move":
                traverser.move(args);
                return false;
            case "attack":
                traverser.attack(args);
                return false;
            case "clear":
                traverser.clearRoom();
                return false;
            case "use":
                traverser.use(args);
                return false;

            default:
                System.out.println("Type \'help\' for list of command");
                return false;
        }
    }

//    void move(String direction){
//        traverser.move(direction);
//    }

    void printHelp(){
        System.out.println("help – print all commands\n"+
                "info - print out information of the player and the room that the player is currently\n"+
                "take – take command is used to pick up the item in the current room\n" +
                "drop – drop item of choice that the player currently carries.\n" +
                "attack – attack a monster in the current room.\n" +
                "quit – quit the game\n"+
                "north - move to the north\n" +
                "south - move to the south\n" +
                "east - move to the east\n" +
                "west - move to the west\n");
    }



}
