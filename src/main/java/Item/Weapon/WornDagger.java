package Item.Weapon;


public class WornDagger implements Weapon {
    private final double RARITY = 0.30;
    private final int ATTACK = 70;
    private String name = "Worn dagger";

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
