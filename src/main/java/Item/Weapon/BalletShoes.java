package Item.Weapon;

public class BalletShoes implements Weapon {
    public final double RARITY = 0.70;
    public final int ATTACK = 35;
    private String name = "Ballet shoes";

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
