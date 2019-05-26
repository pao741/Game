import Entities.*;

import java.util.ArrayList;
import java.util.Random;

public class BossRoom {
    private static ArrayList<Entities> bosses = new ArrayList<Entities>();

    private final double animatedGolemSpawn = 0.33;

    private final double bigSlime = 0.66;

    private final double giantRat = 0.99;

    private Random rand = new Random();

    BossRoom(){
        spawnEnemy();
    }

    public void spawnEnemy(){
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
}
