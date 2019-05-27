package Level;

import Entities.*;

import java.util.ArrayList;
import java.util.Random;

public class BossRoom extends Room {
    private static ArrayList<Entities> bosses = new ArrayList<Entities>();

    private final double animatedGolemSpawn = 0.33;

    private final double bigSlime = 0.66;

    private final double giantRat = 0.99;

    private Random rand = new Random();

    private static boolean isCleared;

    private final String NAME = "Boss room";

    BossRoom(){
        spawnEnemy();
    }

    public void spawnEnemy(){
        isCleared = false;
        double num = rand.nextDouble();
        if (num <= animatedGolemSpawn){
            Entities animatedGolem = EntitiesFactory.createEntities("Animated Golem");
            bosses.add(animatedGolem);
        }else if(num <= bigSlime){
            Entities bigSlime = EntitiesFactory.createEntities("Big Slime");
            bosses.add(bigSlime);
        }else if(num <= giantRat) {
            Entities giantRat = EntitiesFactory.createEntities("Giant Rat");
            bosses.add(giantRat);
        }

    }

    @Override
    public String getName() {
        return NAME;
    }

    public void getRoomInfo(){
        for (int i = 0; i < bosses.size(); i++){
            Entities boss = bosses.get(i);
            boss.getInfo();
        }
    }
    public boolean getRoomState(){
        return isCleared;
    }
}
