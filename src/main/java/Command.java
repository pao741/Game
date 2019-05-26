public class Command {

    Tranverser tranverser;
    Player player;

    Command(){
        tranverser = new Tranverser();
        player = new Player();
    }

    void move(String direction){
        tranverser.move(direction);
    }


}
