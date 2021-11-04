package bean;

import interfaces.Castable;
import interfaces.Changeable;

public class Spell extends Item implements Castable {
    private static final int ICE = 0;
    private static final int FIRE = 1;
    private static final int LIGHTNING = 2;

    private final int type;
    private final int damage;
    private final int mana;

    public Spell(String[] args) {
        this(Integer.parseInt(args[0]), args[1], Integer.parseInt(args[2]), Integer.parseInt(args[3]),
                Integer.parseInt(args[4]), Integer.parseInt(args[5]));
    }

    public Spell(int type, String name, int cost, int level, int damage, int mana) {
        super(name, cost, level);
        this.type = type;
        this.damage = damage;
        this.mana = mana;
    }

    public int getType() {
        return type;
    }

    public int getDamage() {
        return damage;
    }

    public int getMana() {
        return mana;
    }

    @Override
    public void cast(Changeable opponent) {

    }

    @Override
    public String toString() {
        return String.format("%20s%10s%10d%10d%10d", getName(), type, getCost(), getLevel(), damage, mana);
    }
}
