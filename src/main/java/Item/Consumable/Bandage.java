package Item.Consumable;

public class Bandage implements Consumable{
    public final double RARITY = 0.90;
    public final int RESTORES = 15;

    @Override
    public int getRestores() {
        return RESTORES;
    }

    @Override
    public double getRarity() {
        return RARITY;
    }
}
