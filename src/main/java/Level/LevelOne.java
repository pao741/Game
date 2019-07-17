package Level;

import java.util.ArrayList;

public class LevelOne extends Map{
    private int[][] blueprint = {{1,2,1,2},{2,3,1,1},{1,2,2,1},{1,2,2,1}};
//    private static Room[][] map = new Room[4][4];

    private ArrayList<ArrayList<Room>> map;

    public LevelOne(){
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
                    EnemyRoom enemyRoom = new EnemyRoom(1);
                    x.add(enemyRoom);
                }else if (blueprint[i][j] == 2){
                    LootRoom lootRoom = new LootRoom(1);
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
