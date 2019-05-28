package Item.Weapon;

public class Stick extends Weapon{
    public static int attack;
    private String name;

    public Stick(){
        attack = 10;
        name = "Stick";
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
