package Item.Weapon;

public class ToyKnife implements Weapon {
    public final double RARITY = 0.50;
    public final int ATTACK = 40;
    @Override
    public int getAttackValue() {
        return ATTACK;
    }

    @Override
    public double getRarity() {
        return RARITY;
    }
}
