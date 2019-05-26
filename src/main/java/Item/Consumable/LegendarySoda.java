package Item.Consumable;


public class LegendarySoda implements Consumable{
    private final double RARITY = 0.01;
    private final int RESTORES = Integer.MAX_VALUE;
    private final String NAME = "Legendary Soda";

    @Override
    public int getRestores() {
        return RESTORES;
    }

    @Override
    public String getName() {
        return NAME;
    }
}
