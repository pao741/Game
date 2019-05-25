package Item.Consumable;

public class LegendarySoda implements Consumable{
    public final double RARITY = 0.01;
    public final int RESTORES = Integer.MAX_VALUE;

    @Override
    public int getRestores() {
        return RESTORES;
    }

    @Override
    public double getRarity() {
        return RARITY;
    }
}
