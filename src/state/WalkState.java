package state;

import controller.BoardController;
import game.RPGGame;
import model.Marker;
import utils.Dice;
import utils.LegendMarker;

public class WalkState extends BaseState {
    @Override
    public void doAction(Context context, String action) {
        super.doAction(context, action);
        action = action.toUpperCase();
        RPGGame rpgGame = context.getRpgGame();
        BoardController boardController = rpgGame.getBoardController();
        int row = boardController.getPRow();
        int column = boardController.getPColumn();

        switch (action) {
            // move
            case "W" -> row--;
            case "A" -> column--;
            case "S" -> row++;
            case "D" -> column++;
        }

        Marker marker = boardController.moveTo(row, column);
        if (marker != null) {
            switch (marker.getMark()) {
                // market cell
                case LegendMarker.MARKET -> context.setState(new MarketState());
                // common cell
                case "" -> {
                    // 10% probability to encounter a monster
                    int prob = Dice.roll(10);
                    if (prob < 1)
                        context.setState(new FightState());
                }
            }
        }
    }

}
