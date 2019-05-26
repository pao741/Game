package Item.Consumable;

public class Burger implements Consumable{
    public final double RARITY = 0.70;
    public final int RESTORES = 35;
    private final String NAME = "Burger";


    @Override
    public int getRestores() {
        return RESTORES;
    }

    @Override
    public double getRarity() {
        return RARITY;
    }

    @Override
    public String getName() {
        return NAME;
    }
}
