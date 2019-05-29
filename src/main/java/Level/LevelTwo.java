package Level;

import java.util.ArrayList;

public class LevelTwo extends Map{
    private static int[][] blueprint = {{1,2,3,2},{1,2,2,1},{3,1,0,1},{2,1,2,2}};
    private static ArrayList<ArrayList<Room>> map;

    public LevelTwo(){
        map = new ArrayList<>();
        createMap();
    }

    public void createMap(){
        ArrayList<Room> x;
        for (int i = 0; i < 4; i++){
            x = new ArrayList<>();
            for (int j = 0; j < 4; j++){
                if (blueprint[i][j] == 1){
                    EnemyRoom enemyRoom = new EnemyRoom(2);
                    x.add(enemyRoom);
                }else if (blueprint[i][j] == 2){
                    LootRoom lootRoom = new LootRoom(2);
                    x.add(lootRoom);
                }else{
                    BossRoom bossRoom = new BossRoom();
                    x.add(bossRoom);
                }
            }
            map.add(x);
        }
    }

    public ArrayList<ArrayList<Room>> getMap() {
        return map;
    }
}
