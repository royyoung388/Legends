package state;

import bean.Armor;
import bean.Potion;
import bean.Spell;
import bean.Weapon;
import controller.MarketController;
import controller.TeamController;
import game.LegendsGame;
import text.text;

public class MarketState extends BaseState {
    @Override
    public void doAction(Context context, String action) {
        super.doAction(context, action);

        action = action.toUpperCase();
        String[] strings = action.split("\s+");
        LegendsGame legendsGame = (LegendsGame) context.getRpgGame();
        MarketController marketController = legendsGame.getMarketController();
        TeamController teamController = legendsGame.getTeamController();

        if (!strings[0].equals("0") && strings.length < 2)
            return;

        int index = Integer.parseInt(strings[1]);
        switch (strings[0]) {
            case "1" -> {
                if (teamController.getMoney() >= marketController.getWeaponList().get(index).getCost()) {
                    Weapon weapon = marketController.buyWeapon(index);
                    legendsGame.getTeamController().buyWeapon(weapon);
                }
            }
            case "2" -> {
                if (teamController.getMoney() >= marketController.getArmorList().get(index).getCost()) {
                    Armor armor = marketController.buyArmor(index);
                    legendsGame.getTeamController().buyArmor(armor);
                }
            }
            case "3" -> {
                if (teamController.getMoney() >= marketController.getPotionList().get(index).getCost()) {
                    Potion potion = marketController.buyPotion(index);
                    legendsGame.getTeamController().buyPotion(potion);
                }
            }
            case "4" -> {
                if (teamController.getMoney() >= marketController.getSpellList().get(index).getCost()) {
                    Spell spell = marketController.buySpell(index);
                    legendsGame.getTeamController().buySpell(spell);
                }
            }
            case "0" -> context.setState(new WalkState());
        }
    }

    @Override
    public void showPrompt(Context context) {
        System.out.println(text.MARKET_TITLE);
        System.out.println(text.MARKET_TYPE);
        ((LegendsGame)context.getRpgGame()).getMarketController().showAll();
        System.out.println("Choose the item: (input TYPE ID)");
    }
}
