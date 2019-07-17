package Item.Weapon;

public class TornNotebook extends Weapon{
    public static int attack;
    private String name ;

    public TornNotebook(){
        attack = 15;
        this.name = "Torn notebook";
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
