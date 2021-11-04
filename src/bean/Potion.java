package bean;

import interfaces.Changeable;
import interfaces.Usable;

public class Potion extends Item implements Usable {
    private final int increase;
    private final String attribute;

    public Potion(String[] args) {
        this(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]), args[4]);
    }

    public Potion(String name, int cost, int level, int increase, String attribute) {
        super(name, cost, level);
        this.increase = increase;
        this.attribute = attribute;
    }

    public int getIncrease() {
        return increase;
    }

    public String getAttribute() {
        return attribute;
    }

    @Override
    public void use(Changeable subject) {

    }

    @Override
    public String toString() {
        return String.format("%20s%10d%10d%10s%10d", getName(), getCost(), getLevel(), attribute, increase);
    }
}
