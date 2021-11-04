package controller;

import bean.Spell;

public interface MonsterController {
    void damageDealt(int damage);

    void spellDealt(Spell spell);

    void isDied();
}
