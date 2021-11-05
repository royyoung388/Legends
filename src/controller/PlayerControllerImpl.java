package controller;

import bean.*;
import model.PlayerModel;
import view.PlayerView;

public class PlayerControllerImpl implements PlayerController {

    private PlayerView playerView;
    private PlayerModel playerModel;

    public PlayerControllerImpl(PlayerView playerView, PlayerModel playerModel) {
        this.playerView = playerView;
        this.playerModel = playerModel;
    }

    @Override
    public Hero getHero() {
        return playerModel.getHero();
    }

    @Override
    public void move() {

    }

    @Override
    public int attack() {
        return 0;
    }

    @Override
    public void damageDealt(int damage) {

    }

    @Override
    public void gainExp() {

    }

    @Override
    public void levelUp() {

    }

    @Override
    public void gainMoney() {

    }

    @Override
    public void getMoney() {

    }

    @Override
    public void buyArmor() {

    }

    @Override
    public void buyWeapon() {

    }

    @Override
    public void buyPotion() {

    }

    @Override
    public void buySpell() {

    }

    @Override
    public void useSpell(Spell spell) {

    }

    @Override
    public void usePotion(Potion potion) {

    }

    @Override
    public void equipArmor(Armor armor) {

    }

    @Override
    public void equipWeapon(Weapon weapon) {

    }

    @Override
    public void showInformation() {

    }

    @Override
    public void showEquipment() {

    }
}
