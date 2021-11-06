package controller;

import bean.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TeamControllerImpl implements TeamController {
    private int money;
    private List<Hero> heroList;
    private Backpack backpack;

    public TeamControllerImpl() {
        heroList = new ArrayList<>();
        backpack = new Backpack();
        money = 0;
    }

    @Override
    public void addHero(Hero hero) {
        money += hero.getMoney();
        hero.setMoney(money);
        heroList.add(hero);
    }

    @Override
    public void addHeroList(List<Hero> heroList) {
        this.heroList.addAll(heroList);
    }

    @Override
    public int size() {
        return heroList.size();
    }

    @Override
    public int getMoney() {
        return money;
    }

    @Override
    public void buyArmor(Armor armor) {
        backpack.addArmor(armor);
    }

    @Override
    public void buyWeapon(Weapon weapon) {
        backpack.addWeapon(weapon);
    }

    @Override
    public void buyPotion(Potion potion) {
        backpack.addPotion(potion);
    }

    @Override
    public void buySpell(Spell spell) {
        backpack.addSpell(spell);
    }

    @Override
    public Hero getHero() {
        return null;
    }

    @Override
    public void showTeam() {
        System.out.println("===== Your Team =====");
        System.out.println("   " + Hero.header());
        for (int i = 0; i < heroList.size(); i++) {
            System.out.printf("%3d%s\n", i + 1, heroList.get(i));
        }
        System.out.println("======================\n");
    }

    @Override
    public void showEquipment() {

    }

    @Override
    public void showItem() {
        System.out.println("============== Your Items ================");
        showWeaponList(backpack.getWeaponList());
        showArmorList(backpack.getArmorList());
        showPotionList(backpack.getPotionList());
        showSpellList(backpack.getSpellList());
        // wait for 2 seconds
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void showArmorList(List<Armor> armorList) {
        System.out.println("=========== ARMOR ==============");
        System.out.println("  " + Armor.header());
        for (int i = 1; i <= armorList.size(); i++) {
            System.out.printf("%3d%s\n", i, armorList.get(i));
        }
    }

    private void showWeaponList(List<Weapon> weaponList) {
        System.out.println("=========== WEAPON ==============");
        System.out.println("  " + Weapon.header());
        for (int i = 1; i <= weaponList.size(); i++) {
            System.out.printf("%3d%s\n", i, weaponList.get(i));
        }
    }

    private void showPotionList(List<Potion> potionList) {
        System.out.println("=========== POTION ==============");
        System.out.println("  " + Potion.header());
        for (int i = 1; i <= potionList.size(); i++) {
            System.out.printf("%3d%s\n", i, potionList.get(i));
        }
    }


    private void showSpellList(List<Spell> spellList) {
        System.out.println("=========== SPELL ==============");
        System.out.println("  " + Spell.header());
        for (int i = 1; i <= spellList.size(); i++) {
            System.out.printf("%3d%s\n", i, spellList.get(i));
        }
    }
}
