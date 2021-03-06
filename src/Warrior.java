/**
 * One type of warrior
 */
public class Warrior extends Hero {
    public Warrior(String[] args) {
        super(WARRIOR, args);
    }

    @Override
    public void levelUp() {
        super.levelUp();
        setStrength((int) (getStrength() * 1.1));
        setAgility((int) (getAgility() * 1.1));
        setDexterity((int) (getDexterity() * 1.05));
    }
}
