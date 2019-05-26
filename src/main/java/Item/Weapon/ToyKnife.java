package Item.Weapon;

public class ToyKnife implements Weapon {
    public final int ATTACK = 40;
    private String name = "Toy knife";

    @Override
    public int getAttackValue() {
        return ATTACK;
    }

    @Override
    public String getName() {
        return name;
    }
}
