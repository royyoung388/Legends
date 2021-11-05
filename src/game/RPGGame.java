package game;

import controller.BoardController;
import controller.BoardControllerImpl;
import controller.PlayerController;
import controller.PlayerControllerImpl;
import model.BoardModel;
import state.Context;
import state.State;
import view.BoardView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class RPGGame {
    protected BoardController boardController;
    protected List<PlayerController> playerControllerList;

    protected Context context;
    protected State state;

    public RPGGame(int row, int column) {
        boardController = new BoardControllerImpl(new BoardView(), new BoardModel(row, column));
        playerControllerList = new ArrayList<>();

        context = new Context(this);
        initGame();
    }

    public void listenAction() {
        Scanner scanner = new Scanner(System.in);
        while (!isEnd()) {
            String action = scanner.next();
            state.doAction(context, String.valueOf(action.strip().toUpperCase().charAt(0)));
        }
    }

    public BoardController getBoardController() {
        return boardController;
    }

    public List<PlayerController> getPlayerControllerList() {
        return playerControllerList;
    }

    public abstract void start();

    protected abstract void initGame();

    protected abstract boolean isEnd();

    public abstract void quit();
}
