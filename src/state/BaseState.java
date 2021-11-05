package state;

import controller.PlayerController;

public abstract class BaseState implements State {
    @Override
    public void doAction(Context context, String action) {
        action = action.toUpperCase();
        switch (action) {
            case "I" -> {
                for (PlayerController playerController : context.getRpgGame().getPlayerControllerList()) {
                    playerController.showInformation();
                }
            }
            case "E" -> {
                for (PlayerController playerController : context.getRpgGame().getPlayerControllerList()) {
                    playerController.showEquipment();
                }
            }
            case "Q" -> context.getRpgGame().quit();
            case "M" -> context.getRpgGame().getBoardController().show();
        }
    }
}
