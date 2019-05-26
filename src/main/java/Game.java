import Item.ItemFactory;

import javax.xml.bind.SchemaOutputResolver;
import java.io.InputStream;
import java.util.Scanner;

public class Game {

    public static boolean figthing;
    private Scanner scanner;
    private String userInput;

    Game(){
        scanner = new Scanner(System.in);
        userInput = "";
    }

    public void run(){
        Player player = new Player();
//        InputStream command = System.in;
        String command = scanner.nextLine();
        String[] userArgs = command.split(" ");
        while(true){
            if (command.equals("quit")){
                break;
            }else if (command.equals("help")){
                printHelp();
            }else if (command.equals("attack")){
                if (!figthing){
                    System.out.println("There is no enemy around to attack");
                }else{
                    System.out.println("you fight");
                }

            }else if (command.equals("take")){

            }else if (command.equals("drop")) {

            }else if (command.equals("Roses are red, where is my wife")){
                System.out.println("IDK why but here is your precious knife");
                player.give(ItemFactory.createItem("Real Knife"));
            }else{
                System.out.println("Type \'help\' for list of command");
            }
            command = scanner.nextLine();
        }
        System.out.println("Quiting the game...");
    }

    void printStartingMessage(){
        System.out.println("Welcome to ....");
        System.out.println("In this game, you need to find a way out of this place?");
        System.out.println("Defeat all enemies to move on to the next level");
        System.out.println("There will be items drop though out the dungeon");
    }

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
