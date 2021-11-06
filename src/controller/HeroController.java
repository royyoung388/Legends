package controller;

import bean.Armor;
import bean.Potion;
import bean.Spell;
import bean.Weapon;

public interface HeroController {


    int attack();

    void damageDealt(int damage);

    void gainExp();

    void levelUp();

    void gainMoney();

    void getMoney();


    void useSpell(Spell spell);

    void usePotion(Potion potion);

    void equipArmor(Armor armor);

    void equipWeapon(Weapon weapon);
}
