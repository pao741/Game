public class Command {

    Traverser traverser;
    Player player;

    Command(){
        traverser = new Traverser();
        player = new Player();
    }

    public boolean doCommand(String command, String[] arhs){
        switch (command){
            case "info":
                traverser.info();
            case "quit":
                return true;
            case "help":
                printHelp();
            case "drop":

            default:
                System.out.println("Type \'help\' for list of command");
        }
        return false;
    }

    void move(String direction){
        traverser.move(direction);
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
