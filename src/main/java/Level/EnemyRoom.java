package Level;

import Entities.*;

import java.util.ArrayList;
import java.util.Random;

public class EnemyRoom extends Room{

    private static ArrayList<Entities> enemies;

    private final double ratSpawn = 0.99;

    private final double skeletionSpawn = 0.75;

    private final double smallSlimeSpawn = 0.5;

    private final double theifSpawn = 0.25;

    private static boolean isCleared;

    private final String NAME = "Enemy room";


    private Random rand = new Random();

    EnemyRoom(int level){
        enemies = new ArrayList<Entities>();
        isCleared = false;
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

    @Override
    public String getName() {
        return NAME;
    }

    public ArrayList<Entities> getEnemies() {
        return enemies;
    }

    public void setEnemies(ArrayList<Entities> enemies) {
        EnemyRoom.enemies = enemies;
    }

    @Override
    public void getRoomInfo() {
        if (!isCleared) {
            System.out.print(NAME + ": \n\t");
            System.out.print("You are seeing ");
            for (int i = 0; i < enemies.size(); i++) {
//                System.out.println(enemies.size());
                Entities entity = enemies.get(i);
                entity.getInfo();
            }
        }else{
            System.out.println("The room is cleared.");
        }

    }
    public boolean getRoomState(){
        return isCleared;
    }

    @Override
    public void checkIfCleared() {
        for (int i = 0; i < enemies.size(); i++){
            if (!enemies.get(i).isAlive){
                enemies.remove(enemies.get(i));
            }
        }
        if (enemies.size() == 0){
            setIsCleared();
        }
    }
    @Override
    public void setIsCleared() {
        isCleared = true;
    }
}
