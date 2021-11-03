package bean;

public class Weapon {
    private final String name;
    private final int cost;
    private final int level;
    private final int damage;
    private final int hands;

    public Weapon(String[] args) {
        this(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]),
                Integer.parseInt(args[3]), Integer.parseInt(args[4]));
    }

    public Weapon(String name, int cost, int level, int damage, int hands) {
        this.name = name;
        this.cost = cost;
        this.level = level;
        this.damage = damage;
        this.hands = hands;
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

    public int getHands() {
        return hands;
    }
}
