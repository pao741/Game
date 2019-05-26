package Item.Weapon;


public class WornDagger implements Weapon {
    private final int ATTACK = 70;
    private String name = "Worn dagger";

    @Override
    public int getAttackValue() {
        return ATTACK;
    }

    @Override
    public String getName() {
        return name;
    }
}
