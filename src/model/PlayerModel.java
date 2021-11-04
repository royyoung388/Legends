package model;

import bean.Armor;
import bean.Backpack;
import bean.Hero;
import bean.Weapon;

public class PlayerModel {
    private Hero hero;
    private Backpack backpack;
    private Weapon weapon;
    private Armor armor;

    public PlayerModel(Hero hero) {
        this.hero = hero;
        backpack = new Backpack();
        weapon = null;
        armor = null;
    }
}
