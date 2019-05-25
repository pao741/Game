package Item.Weapon;

public class EmptyGun implements Weapon{
    public final double RARITY = 0.15;
    public final int ATTACK = 60;
    private String name = "Empty gun";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAttackValue() {
        return ATTACK;
    }

    @Override
    public double getRarity() {
        return RARITY;
    }
}
