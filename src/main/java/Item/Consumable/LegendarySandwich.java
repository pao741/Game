package Item.Consumable;

public class LegendarySandwich implements Consumable{
    public final double RARITY = 0.09;
    public final int RESTORES = 10;
    private final String NAME = "Legendary Sandwich";


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
