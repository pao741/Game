package Item.Weapon;

public class BurntPan implements Weapon{
    public final double RARITY = 0.40;
    public final int ATTACK = 50;
    private String name = "Burnt pan";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAttackValue() {
        return ATTACK;
    }

}
