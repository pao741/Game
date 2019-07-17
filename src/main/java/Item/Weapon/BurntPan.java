package Item.Weapon;

public class BurntPan extends Weapon{
    public static int attack;
    private String name ;

    public BurntPan(){
        attack= 50;
        this.name= "Burnt Pan";
    }
    @Override
    public void setAttack(int attack) {
        this.attack = attack;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAttackValue() {
        return attack;
    }

}
