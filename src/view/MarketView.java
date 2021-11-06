package view;

import bean.Armor;
import bean.Potion;
import bean.Spell;
import bean.Weapon;

import java.util.List;

public class MarketView {

    public MarketView() {
    }

    public void showArmorList(List<Armor> armorList) {
        System.out.println("=========== ARMOR ==============");
        System.out.println("  " + Armor.header());
        for (int i = 0; i < armorList.size(); i++) {
            System.out.printf("%3d%s\n", i + 1, armorList.get(i));
        }
    }

    public void showWeaponList(List<Weapon> weaponList) {
        System.out.println("=========== WEAPON ==============");
        System.out.println("  " + Weapon.header());
        for (int i = 0; i < weaponList.size(); i++) {
            System.out.printf("%3d%s\n", i + 1, weaponList.get(i));
        }
    }

    public void showPotionList(List<Potion> potionList) {
        System.out.println("=========== POTION ==============");
        System.out.println("  " + Potion.header());
        for (int i = 0; i < potionList.size(); i++) {
            System.out.printf("%3d%s\n", i + 1, potionList.get(i));
        }
    }


    public void showSpellList(List<Spell> spellList) {
        System.out.println("=========== SPELL ==============");
        System.out.println("  " + Spell.header());
        for (int i = 0; i < spellList.size(); i++) {
            System.out.printf("%3d%s\n", i + 1, spellList.get(i));
        }
    }
}
