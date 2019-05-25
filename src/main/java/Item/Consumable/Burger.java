package Item.Consumable;

public class Burger implements Consumable{
    public final double RARITY = 0.70;
    public final int RESTORES = 35;

    @Override
    public int getRestores() {
        return RESTORES;
    }

    @Override
    public double getRarity() {
        return RARITY;
    }
}