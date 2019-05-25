package Item.Consumable;

public class Bread implements Consumable{
    public final double RARITY = 0.80;
    public final int RESTORES = 25;
    @Override
    public int getRestores() {
        return RESTORES;
    }

    @Override
    public double getRarity() {
        return RARITY;
    }
}
