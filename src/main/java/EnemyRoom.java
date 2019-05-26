import Entities.*;

import java.util.ArrayList;
import java.util.Random;

public class EnemyRoom {

    private static ArrayList<Entities> enemies = new ArrayList<Entities>();

    private final double ratSpawn = 0.99;

    private final double skeletionSpawn = 0.75;

    private final double smallSlimeSpawn = 0.5;

    private final double theifSpawn = 0.25;

    private Random rand = new Random();

    EnemyRoom(int level){
        if (level == 1){
            spawnEnemy();
        }else if(level == 2){
            spawnEnemy();
            spawnEnemy();

        }else if(level == 3){
            spawnEnemy();
            spawnEnemy();
            spawnEnemy();
        }
    }

    public void spawnEnemy(){
        double num = rand.nextDouble();
        if (num <= theifSpawn){
            Theif theif = (Theif)EntitiesFactory.createEntities("Theif");
            enemies.add(theif);
        }else if(num <= smallSlimeSpawn){
            SmallSlime smallSlime = (SmallSlime)EntitiesFactory.createEntities("Small Slime");
            enemies.add(smallSlime);
        }else if(num <= skeletionSpawn){
            Skeleton skeleton = (Skeleton) EntitiesFactory.createEntities("Skeleton");
            enemies.add(skeleton);
        }else if(num <= ratSpawn){
            Rat rat = (Rat)EntitiesFactory.createEntities("Rat");
            enemies.add(rat);
        }

    }
}
