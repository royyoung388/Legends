package controller;

import bean.*;
import bean.hero.Hero;

import java.util.List;

public interface TeamController {

    void addHero(Hero hero);

    void addHeroList(List<Hero> heroList);

    int size();

    int getMoney();

    void setMoney(int money);

    List<Weapon> getWeaponList();

    List<Armor> getArmorList();

    List<Potion> getPotionList();

    List<Spell> getSpellList();

    void gainMoney(int money);

    void usePotion(HeroController heroController, int index);

    int useSpell(HeroController heroController, CharacterController enemy, Spell spell);

    void buyArmor(Armor armor);

    void buyWeapon(Weapon weapon);

    void buyPotion(Potion potion);

    void buySpell(Spell spell);

    HeroController getHeroController(int index);

    List<HeroController> getHeroControllerList();

    void showTeam();

    void showItem();

    void showArmorList();

    void showWeaponList();

    void showPotionList();

    void showSpellList();
}
