package state;

public abstract class BaseState implements State {
    @Override
    public void doAction(Context context, String action) {
        action = action.toUpperCase();
        switch (action) {
            case "I" -> {
                context.getRpgGame().getTeamController().showTeam();
            }
            case "E" -> {
                context.getRpgGame().getTeamController().showEquipment();
            }
            case "Q" -> context.getRpgGame().quit();
            case "M" -> context.getRpgGame().getBoardController().show();
        }
    }
}
