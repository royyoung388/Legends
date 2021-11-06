package bean;

import interfaces.Castable;
import interfaces.Changeable;

public class Spell extends Item implements Castable {
    public static final int ICE = 0;
    public static final int FIRE = 1;
    public static final int LIGHTNING = 2;
    private static final String[] TYPE = {"ICE", "FIRE", "LIGHTNING"};

    private final int type;
    private final int damage;
    private final int mana;

    public Spell(int type, String[] args) {
        this(type, args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]),
                Integer.parseInt(args[3]), Integer.parseInt(args[4]));
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

    public static String header() {
        return String.format("%20s%10s%10s%10s%10s%s", "Name", "Cost", "Level", "Type", "Damage", "ManaCost");
    }

    @Override
    public void cast(Changeable opponent) {

    }

    @Override
    public String toString() {
        return String.format("%20s%10s%10d%10d%10d%10d", getName(), TYPE[type], getCost(), getLevel(), damage, mana);
    }
}
