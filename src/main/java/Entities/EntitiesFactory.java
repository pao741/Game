package Entities;

import Entities.Boss.*;

public class EntitiesFactory {
    public static Entities createEntities(String name){
        switch (name){
            case "Rat":
                Rat rat = new Rat();
                return rat;
            case "Small Slime":
                SmallSlime smallSlime = new SmallSlime();
                return smallSlime;
            case "Theif":
                Theif theif = new Theif();
                return theif;
            case "Skeleton":
                Skeleton skeleton = new Skeleton();
                return skeleton;
            case "Animated Golem":
                AnimatedGolem animatedGolem = new AnimatedGolem();
                return animatedGolem;
            case "Big Slime":
                BigSlime bigSlime = new BigSlime();
                return bigSlime;
            case "Giant Rat":
                GiantRat giantRat = new GiantRat();
                return giantRat;
            default:
                return null;

        }
    }
}
