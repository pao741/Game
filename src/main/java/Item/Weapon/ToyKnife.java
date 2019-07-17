package Item.Weapon;

public class ToyKnife extends Weapon {
    public static int attack;
    private String name ;

    public ToyKnife(){
        attack = 40;
        name = "Toy knife";
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
