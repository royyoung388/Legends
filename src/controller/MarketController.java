package controller;

import model.Item.Armor;
import model.Item.Potion;
import model.Item.Spell;
import model.Item.Weapon;

import java.util.List;

public interface MarketController {

    Armor buyArmor(int index);

    Weapon buyWeapon(int index);

    Potion buyPotion(int index);

    Spell buySpell(int index);

    void showAll();

    void showArmorList();

    void showWeaponList();

    void showPotionList();

    void showSpellList();

    List<Armor> getArmorList();

    List<Weapon> getWeaponList();

    List<Potion> getPotionList();

    List<Spell> getSpellList();
}
