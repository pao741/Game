package Item.Consumable;

public class Bread extends Consumable{
    public final int RESTORES = 25;
    private final String NAME = "Bread";

    @Override
    public int getRestores() {
        return RESTORES;
    }

    @Override
    public String getName() {
        return NAME;
    }
}
