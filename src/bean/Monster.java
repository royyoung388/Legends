package bean;

public class Monster extends Character {
    private final String type;

    public Monster(String[] args) {
        this(args[0], args[1], Integer.parseInt(args[2]), Integer.parseInt(args[3]),
                Integer.parseInt(args[4]), Integer.parseInt(args[5]), Integer.parseInt(args[6]));
    }

    public Monster(String type, String name, int hp, int level, int damage, int defense, int dodge) {
        super(name, level, hp, damage, defense, dodge);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return String.format("%20s%10s%10d%10d%10d", getName(), type, getDamage(), getDefense(), getDodge());
    }
}
