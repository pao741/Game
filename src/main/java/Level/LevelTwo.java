package Level;

import java.util.ArrayList;

public class LevelTwo extends Map{
    private static int[][] blueprint = {{1,2,3,2},{1,2,2,1},{3,1,0,1},{2,1,2,2}};
    private static ArrayList<ArrayList<Room>> map;

    public LevelTwo(){
        createMap();
    }

    public void createMap(){
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                int[] pos = new int[]{i,j};
                if (blueprint[i][j] == 1){
                    EnemyRoom enemyRoom = new EnemyRoom(2);
                    map.get(i).add(enemyRoom);
                }else if (blueprint[i][j] == 2){
                    LootRoom lootRoom = new LootRoom(2);
                    map.get(i).add(lootRoom);
                }else{
                    BossRoom bossRoom = new BossRoom();
                    map.get(i).add(bossRoom);
                }
            }
        }
    }

    @Override
    public ArrayList<ArrayList<Room>> getMap() {
        return map;
    }
}
