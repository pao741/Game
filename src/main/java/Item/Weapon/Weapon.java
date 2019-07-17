package Item.Weapon;

import Item.Item;

public abstract class Weapon extends Item {
    public abstract int getAttackValue();

    public abstract void setAttack(int attack);
}
