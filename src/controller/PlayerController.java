package controller;

import bean.Armor;
import bean.Potion;
import bean.Spell;
import bean.Weapon;

public interface PlayerController {
    void move();

    int attack();

    void damageDealt(int damage);

    void gainExp();

    void levelUp();

    void gainMoney();

    void getMoney();


    void buyArmor();

    void buyWeapon();

    void buyPotion();

    void buySpell();


    void useSpell(Spell spell);

    void usePotion(Potion potion);

    void equipArmor(Armor armor);

    void equipWeapon(Weapon weapon);
}
