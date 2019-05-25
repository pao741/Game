package Item.Consumable;

public class LegendarySandwich implements Consumable{
    public final double RARITY = 0.09;
    public final int RESTORES = 10;

    @Override
    public int getRestores() {
        return RESTORES;
    }

    @Override
    public double getRarity() {
        return RARITY;
    }
}
