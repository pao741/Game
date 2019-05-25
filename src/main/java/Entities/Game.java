package Entities;

import java.io.InputStream;

public class Game {



    public void run(){
        InputStream command = System.in;
        while(true){
            if (command.equals("quit")){
                break;
            }else if (command.equals("help")){
                System.out.println();
            }else if (command.equals("attack")){

            }else if (command.equals("take")){

            }else if (command.equals("drop")) {

            }
        }
        System.out.println("Quiting the game...");
    }
}
