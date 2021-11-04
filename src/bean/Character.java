package bean;

import interfaces.Changeable;

public class Character implements Changeable {
    private String name;
    private int level;
    private int hp;
    private int damage;
    private int defense;
    private int dodge;

    public Character(String name, int level, int hp, int damage, int defense, int dodge) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.damage = damage;
        this.defense = defense;
        this.dodge = dodge;
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
    public void change(int attribute, int value) {
        switch (attribute) {
            case HP -> hp += value;
            case LEVEL -> level += value;
            case DAMAGE -> damage += value;
            case DEFENSE -> defense += value;
            case DODGE -> dodge += value;
        }
    }
}
