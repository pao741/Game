package Level;

import Entities.*;

import java.util.ArrayList;
import java.util.Random;

public class BossRoom extends Room {
    private static ArrayList<Entities> bosses;

    private final double animatedGolemSpawn = 0.33;

    private final double bigSlime = 0.66;

    private final double giantRat = 0.99;

    private Random rand = new Random();

    private static boolean isCleared;

    private final String NAME = "Boss room";

    BossRoom(){
        bosses = new ArrayList<Entities>();
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
        if (!isCleared){
            System.out.print(NAME + ": \n\t");
            System.out.print("You are seeing ");
            for (int i = 0; i < bosses.size(); i++) {
                Entities boss = bosses.get(i);
                boss.getInfo();
            }
        }else{
            System.out.println("The room is cleared");
        }
    }
    public boolean getRoomState(){
        return isCleared;
    }

    public ArrayList<Entities> getBosses() {
        return bosses;
    }

    public void setBosses(ArrayList<Entities> bosses) {
        this.bosses = bosses;
    }

    @Override
    public void checkIfCleared() {
        if (bosses.size() == 0){
            setIsCleared();
        }
    }
    @Override
    public void setIsCleared() {
        isCleared = true;
    }
}
