package Item.Consumable;

public class Bandage extends Consumable{
    public final int RESTORES = 15;
    private final String NAME = "Bandage";


    @Override
    public int getRestores() {
        return RESTORES;
    }

    @Override
    public String getName() {
        return NAME;
    }
}
