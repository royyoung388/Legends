package model;

import bean.*;

import java.util.ArrayList;
import java.util.List;

public class MarketModel {
    private List<Armor> armorList;
    private List<Weapon> weaponList;
    private List<Potion> potionList;
    private List<Spell> spellList;

    public MarketModel() {
        armorList = new ArrayList<>();
        weaponList = new ArrayList<>();
        potionList = new ArrayList<>();
        spellList = new ArrayList<>();
    }

    public void init() {

    }

    public List<Armor> getArmorList() {
        return armorList;
    }

    public List<Weapon> getWeaponList() {
        return weaponList;
    }

    public List<Potion> getPotionList() {
        return potionList;
    }

    public List<Spell> getSpellList() {
        return spellList;
    }
}
