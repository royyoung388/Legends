package state;

import game.RPGGame;

public class Context {
    private State state;
    private RPGGame rpgGame;

    public Context(RPGGame rpgGame) {
        this.rpgGame = rpgGame;
        state = null;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setRpgGame(RPGGame rpgGame) {
        this.rpgGame = rpgGame;
    }

    public RPGGame getRpgGame() {
        return rpgGame;
    }
}