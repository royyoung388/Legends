import bean.Armor;
import bean.Potion;
import bean.Spell;
import bean.Weapon;

public interface CharacterController {
    int attack();

    void damageDealt(int damage);

    void gainExp();

    void levelUp();

    void gainMoney();


    void useSpell(Spell spell);

    void usePotion(Potion potion);

    void equipArmor(Armor armor);

    void equipWeapon(Weapon weapon);
}
