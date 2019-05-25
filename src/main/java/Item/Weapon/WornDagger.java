package Item.Weapon;


public class WornDagger implements Weapon {
    public final double RARITY = 0.30;
    public final int ATTACK = 70;

    @Override
    public int getAttackValue() {
        return ATTACK;
    }

    @Override
    public double getRarity() {
        return RARITY;
    }
}
