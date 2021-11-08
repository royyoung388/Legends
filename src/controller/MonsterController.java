package controller;

import bean.monster.Monster;

public interface MonsterController extends CharacterController {
    @Override
    Monster getCharacter();
}
