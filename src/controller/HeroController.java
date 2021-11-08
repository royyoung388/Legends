package controller;

import bean.*;
import bean.hero.Hero;

public interface HeroController extends CharacterController {

    @Override
    Hero getCharacter();

    void gainExp(int exp);

    int hpRegain();

    int mpRegain();

    boolean levelUp();

    void gainMoney(int money);

    int useSpell(Spell spell, CharacterController enemy);

    void usePotion(Potion potion);

    void equipArmor(Armor armor);

    void equipWeapon(Weapon weapon);
}
