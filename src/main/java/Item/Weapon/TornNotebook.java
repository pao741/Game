package Item.Weapon;

public class TornNotebook implements Weapon{
    public final double RARITY = 0.75;
    public final int ATTACK = 15;
    private String name = "Torn notebook";

    @Override
    public int getAttackValue() {
        return ATTACK;
    }

    @Override
    public double getRarity() {
        return RARITY;
    }

    @Override
    public String getName() {
        return name;
    }
}
