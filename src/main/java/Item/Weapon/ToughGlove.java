package Item.Weapon;

public class ToughGlove implements Weapon {
    public final double RARITY = 0.70;
    public final int ATTACK = 35;
    private String name = "Tough glove";

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
