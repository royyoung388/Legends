package controller;

import bean.Armor;
import bean.Potion;
import bean.Spell;
import bean.Weapon;
import model.MarketModel;
import view.MarketView;

import java.util.List;

public class MarketControllerImpl implements MarketController {

    private MarketView marketView;
    private MarketModel marketModel;

    public MarketControllerImpl(MarketView marketView, MarketModel marketModel) {
        this.marketView = marketView;
        this.marketModel = marketModel;
    }

    @Override
    public Armor buyArmor(int index) {
        if (index < 0 || index >= marketModel.getArmorList().size())
            return null;
        Armor armor = marketModel.getArmorList().get(index);
        marketModel.buy(marketModel.getArmorList(), index);
        return armor;
    }

    @Override
    public Weapon buyWeapon(int index) {
        if (index < 0 || index >= marketModel.getWeaponList().size())
            return null;
        Weapon weapon = marketModel.getWeaponList().get(index);
        marketModel.buy(marketModel.getWeaponList(), index);
        return weapon;
    }

    @Override
    public Potion buyPotion(int index) {
        if (index < 0 || index >= marketModel.getPotionList().size())
            return null;
        Potion potion = marketModel.getPotionList().get(index);
        marketModel.buy(marketModel.getPotionList(), index);
        return potion;
    }

    @Override
    public Spell buySpell(int index) {
        if (index < 0 || index >= marketModel.getSpellList().size())
            return null;
        Spell spell = marketModel.getSpellList().get(index);
        marketModel.buy(marketModel.getSpellList(), index);
        return spell;
    }

    @Override
    public void showAll() {
        showWeaponList();
        showArmorList();
        showPotionList();
        showSpellList();
    }

    @Override
    public void showArmorList() {
        marketView.showArmorList(marketModel.getArmorList());
    }

    @Override
    public void showWeaponList() {
        marketView.showWeaponList(marketModel.getWeaponList());
    }

    @Override
    public void showPotionList() {
        marketView.showPotionList(marketModel.getPotionList());
    }

    @Override
    public void showSpellList() {
        marketView.showSpellList(marketModel.getSpellList());
    }

    @Override
    public List<Armor> getArmorList() {
        return marketModel.getArmorList();
    }

    @Override
    public List<Weapon> getWeaponList() {
        return marketModel.getWeaponList();
    }

    @Override
    public List<Potion> getPotionList() {
        return marketModel.getPotionList();
    }

    @Override
    public List<Spell> getSpellList() {
        return marketModel.getSpellList();
    }
}
