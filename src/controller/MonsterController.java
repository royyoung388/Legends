package controller;

import model.monster.Monster;

public interface MonsterController extends CharacterController {
    @Override
    Monster getCharacter();
}
