package Level;

import java.util.ArrayList;

public class LevelOne extends Map{
    private int[][] blueprint = {{1,2,1,2},{2,3,1,1},{1,2,2,1},{1,2,2,1}};
//    private static Room[][] map = new Room[4][4];

    private static ArrayList<ArrayList<Room>> map;

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
//            map.add(x);
            for (int j = 0; j < 4; j++){
//                int[] pos = new int[]{i,j};
                if (blueprint[i][j] == 1){
                    EnemyRoom enemyRoom = new EnemyRoom(1);
//                    enemyRoom.getRoomInfo();
                    x.add(enemyRoom);
                }else if (blueprint[i][j] == 2){
                    LootRoom lootRoom = new LootRoom(1);
//                    lootRoom.getRoomInfo();
                    x.add(lootRoom);
                }else{
                    BossRoom bossRoom = new BossRoom();
//                    bossRoom.getRoomInfo();
                    x.add(bossRoom);
                }
            }
            map.add(x);
        }
    }
}
