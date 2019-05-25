import java.io.InputStream;

public class Game {

    public static boolean figthing;

    Game(){
        run();
    }

    public void run(){
        Player player = new Player();
        InputStream command = System.in;
        while(true){
            if (command.equals("quit")){
                break;
            }else if (command.equals("help")){
                System.out.println("help – print all commands\n"+
                        "info - print out information of the player and the room that the player is currently\n"+
                        "take – take command is used to pick up the item in the current room\n" +
                        "drop – drop item of choice that the player currently carries.\n" +
                        "attack – attack a monster in the current room.\n" +
                        "quit – quit the game");
            }else if (command.equals("attack")){
                if (!figthing){
                    System.out.println("There is no enemy around to attack");
                }else{
                    System.out.println("you fight");
                }

            }else if (command.equals("take")){

            }else if (command.equals("drop")) {

            }
        }
        System.out.println("Quiting the game...");
    }
}
