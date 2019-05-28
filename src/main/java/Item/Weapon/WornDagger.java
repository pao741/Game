package Item.Weapon;


public class WornDagger extends Weapon {
    private static int attack;
    private String name;

     public WornDagger(){
        attack = 70;
        name = "Worn dagger";
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
