package controller;

public interface MarketController {
    void init();

    void buyArmor(int index);

    void buyWeapon(int index);

    void buyPotion(int index);

    void buySpell(int index);

    void getArmorList();

    void getWeaponList();

    void getPotionList();

    void getSpellList();
}
