package controller;

import bean.*;

import java.util.List;

public interface TeamController {

    void addHero(Hero hero);

    void addHeroList(List<Hero> heroList);

    int size();

    int getMoney();

    void buyArmor(Armor armor);

    void buyWeapon(Weapon weapon);

    void buyPotion(Potion potion);

    void buySpell(Spell spell);

    Hero getHero();

    void showTeam();

    void showEquipment();

    void showItem();
}
