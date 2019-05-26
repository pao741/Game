package Item.Consumable;

public class Bread implements Consumable{
    public final double RARITY = 0.80;
    public final int RESTORES = 25;
    private final String NAME = "Bread";

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
