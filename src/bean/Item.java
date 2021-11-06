package bean;

import interfaces.Merchantable;

public abstract class Item implements Merchantable {
    private final String name;
    private final int cost;
    private final int level;

    public Item(String name, int cost, int level) {
        this.name = name;
        this.cost = cost;
        this.level = level;
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

    @Override
    public int buyPrice() {
        return cost;
    }

    @Override
    public int sellPrice() {
        return cost / 2;
    }
}
