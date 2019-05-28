package Level;

import java.util.ArrayList;
public abstract class Map {

    public abstract ArrayList<ArrayList<Room>> getMap();

    public boolean checkAllCleared(){
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                if (!getMap().get(i).get(j).getRoomState()){
                    return false;
                }
            }
        }
        System.out.println("The floor is clear!");
        return true;
    }

}
