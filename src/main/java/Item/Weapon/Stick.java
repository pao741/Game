package Item.Weapon;

public class Stick implements Weapon{
    public final double RARITY = 0.09;
    public final int ATTACK = 10;
    private String name = "Stick";


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
