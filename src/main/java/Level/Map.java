package Level;

import java.util.ArrayList;
public abstract class Map {

    public abstract  ArrayList<ArrayList<Room>> getMap();

    public void printMap (){
        ArrayList<ArrayList<Room>> map = getMap();
        for (int i = 0; i < 4; i++){
            System.out.println("\t");
            for (int j = 0; j < 4; j++){
                System.out.print(map.get(i).get(j).getName() + " ");
            }
            System.out.println();
        }
    }


}
