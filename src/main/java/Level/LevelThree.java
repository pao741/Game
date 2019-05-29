package Level;

import java.util.ArrayList;

public class LevelThree extends Map{
    private static int[][] blueprint = {{1,3,1,2},{2,1,3,2},{1,1,2,3},{2,2,1,2}};
    private static ArrayList<ArrayList<Room>> map;

    public LevelThree(){
        map = new ArrayList<>();
        createMap();
    }

    public ArrayList<ArrayList<Room>> getMap() {
        return map;
    }

    public void createMap(){
        ArrayList<Room> x;
        for (int i = 0; i < 4; i++){
            x = new ArrayList<>();
            for (int j = 0; j < 4; j++){
                if (blueprint[i][j] == 1){
                    EnemyRoom enemyRoom = new EnemyRoom(3);
                    x.add(enemyRoom);
                }else if (blueprint[i][j] == 2){
                    LootRoom lootRoom = new LootRoom(3);
                    x.add(lootRoom);
                }else{
                    BossRoom bossRoom = new BossRoom();
                    x.add(bossRoom);
                }
            }
            map.add(x);
        }
    }
}
