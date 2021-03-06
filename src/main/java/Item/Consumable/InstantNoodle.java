package Item.Consumable;

import java.util.Random;

public class InstantNoodle extends Consumable{
    public int restores;
    private final String NAME = "Instant noodle";
    public Random rand = new Random();

    public InstantNoodle(){
        int value = rand.nextInt(100);
        if(value < 33){
            restores = 50;
        }else if (value < 66){
            restores = 30;
        }else{
            restores = 15;
        }
    }

    @Override
    public int getRestores() {
        return restores;
    }

    @Override
    public String getName() {
        return NAME;
    }
}

