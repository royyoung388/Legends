package controller;

import bean.Character;
import interfaces.Castable;

public interface CharacterController {

    int getLevel();

    int getDamage();

    int damageDealt(int damage);

    void spellDealt(Castable spell);

    boolean isDied();

    boolean isDodge();

    void revive();

    Character getCharacter();

    void show();
}
