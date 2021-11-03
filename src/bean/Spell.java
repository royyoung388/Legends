package bean;

public class Spell {
    private final String type;
    private final String name;
    private final int cost;
    private final int level;
    private final int damage;
    private final int mana;

    public Spell(String[] args) {
        this(args[0], args[1], Integer.parseInt(args[2]), Integer.parseInt(args[3]),
                Integer.parseInt(args[4]), Integer.parseInt(args[5]));
    }

    public Spell(String type, String name, int cost, int requiredLevel, int damage, int mana) {
        this.type = type;
        this.name = name;
        this.cost = cost;
        this.level = requiredLevel;
        this.damage = damage;
        this.mana = mana;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getLevel() {
        return level;
    }

    public int getDamage() {
        return damage;
    }

    public int getMana() {
        return mana;
    }

    @Override
    public String toString() {
        return String.format("%20s%10s%10d%10d%10d", name, type, cost, level, damage, mana);
    }
}
