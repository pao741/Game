package Item.Weapon;

public class RealKnife extends Weapon{
    public static int attack;
    private String name;

    public RealKnife(){
        attack = 99999;
        name = "Real knife";
    }
    @Override
    public void setAttack(int attack) {
        this.attack = attack;
    }

    @Override
    public int getAttackValue() {
        return attack;
    }

    @Override
    public String getName() {
        return name;
    }
}
