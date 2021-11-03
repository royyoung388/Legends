package bean;

public class Potion {
    private final String name;
    private final int cost;
    private final int level;
    private final int increase;
    private final String attribute;

    public Potion(String[] args) {
        this(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]), args[4]);
    }

    public Potion(String name, int cost, int requiredLevel, int increase, String attribute) {
        this.name = name;
        this.cost = cost;
        this.level = requiredLevel;
        this.increase = increase;
        this.attribute = attribute;
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

    public int getIncrease() {
        return increase;
    }

    public String getAttribute() {
        return attribute;
    }
}
