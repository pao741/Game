package Item.Weapon;

public class BurntPan implements Weapon{
    public final double RARITY = 0.40;
    public final int ATTACK = 50;

    @Override
    public int getAttackValue() {
        return ATTACK;
    }

    @Override
    public double getRarity() {
        return RARITY;
    }
}
