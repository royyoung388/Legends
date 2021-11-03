package bean;

public class Monster {
    private final String type;
    private final String name;
    private final int level;
    private final int damage;
    private final int defense;
    private final int dodge;

    public Monster(String[] args) {
        this(args[0], args[1], Integer.parseInt(args[2]), Integer.parseInt(args[3]),
                Integer.parseInt(args[4]), Integer.parseInt(args[5]));
    }

    public Monster(String type, String name, int leve, int damage, int defense, int dodge) {
        this.type = type;
        this.name = name;
        this.level = leve;
        this.damage = damage;
        this.defense = defense;
        this.dodge = dodge;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getDamage() {
        return damage;
    }

    public int getDefense() {
        return defense;
    }

    public int getDodge() {
        return dodge;
    }

    @Override
    public String toString() {
        return String.format("%20s%10s%10d%10d%10d", name, type, damage, defense, dodge);
    }
}
