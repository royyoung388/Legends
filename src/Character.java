import bean.Armor;
import bean.Hero;
import bean.Weapon;

import java.util.ArrayList;
import java.util.List;

public class Character {
    private Hero hero;
    private Backpack backpack;
    private Weapon weapon;
    private Armor armor;

    public Character(Hero hero) {
        this.hero = hero;
        backpack = new Backpack();
        weapon = null;
        armor = null;
    }
}
