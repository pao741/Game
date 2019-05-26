package Item.Weapon;

public class Stick implements Weapon{
    public final int ATTACK = 10;
    private String name = "Stick";


    @Override
    public int getAttackValue() {
        return ATTACK;
    }


    @Override
    public String getName() {
        return name;
    }
}
