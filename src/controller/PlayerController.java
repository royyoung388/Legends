package controller;

import bean.*;

public interface PlayerController {
    Hero getHero();

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

    void showInformation();

    void showEquipment();
}
