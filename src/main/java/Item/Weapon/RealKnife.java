package Item.Weapon;

public class RealKnife implements Weapon{
    public final double RARITY = 0.05;
    public final int ATTACK = Integer.MAX_VALUE;

    @Override
    public int getAttackValue() {
        return ATTACK;
    }

    @Override
    public double getRarity() {
        return RARITY;
    }
}
