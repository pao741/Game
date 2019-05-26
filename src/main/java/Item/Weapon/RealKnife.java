package Item.Weapon;

public class RealKnife implements Weapon{
    public final int ATTACK = Integer.MAX_VALUE;
    private String name = "Real knife";

    @Override
    public int getAttackValue() {
        System.out.println("This is not for children");
        return ATTACK;

    }

    @Override
    public String getName() {
        return name;
    }
}
