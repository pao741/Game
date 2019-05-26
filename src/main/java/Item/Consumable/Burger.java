package Item.Consumable;

public class Burger implements Consumable{
    public final int RESTORES = 35;
    private final String NAME = "Burger";


    @Override
    public int getRestores() {
        return RESTORES;
    }

    @Override
    public String getName() {
        return NAME;
    }
}
