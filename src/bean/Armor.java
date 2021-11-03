package bean;

public class Armor {
    private final String name;
    private final int cost;
    private final int level;
    private final int reduction;

    public Armor(String[] args) {
        this(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]));
    }

    public Armor(String name, int cost, int requiredLevel, int damageReduction) {
        this.name = name;
        this.cost = cost;
        this.level = requiredLevel;
        this.reduction = damageReduction;
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

    public int getReduction() {
        return reduction;
    }

    @Override
    public String toString() {
        return String.format("%20s%10d%10d%10d", name, cost, level, reduction);
    }
}
