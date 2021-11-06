package game;

import bean.Hero;
import controller.MarketController;
import controller.MarketControllerImpl;
import factory.HeroFactory;
import model.Marker;
import model.MarketModel;
import state.WalkState;
import text.text;
import utils.Dice;
import utils.LegendMarker;
import view.MarketView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class LegendsGame extends RPGGame {
    private Scanner scanner;
    private MarketController marketController;

    public LegendsGame() {
        this(8, 8);
    }

    public LegendsGame(int row, int column) {
        super(row, column);
        scanner = new Scanner(System.in);
        marketController = new MarketControllerImpl(new MarketView(), new MarketModel());
    }

    private void initBoard() {
        int row = boardController.getRow();
        int column = boardController.getColumn();
        Marker[][] markers = new Marker[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                markers[i][j] = Dice.rollMarker(true);
            }
        }

        // Player start at (0,0)
        markers[0][0].setMark(LegendMarker.PLAYER);
        boardController.setPlayer(0, 0);

        // no block for player
        if (markers[0][1].getMark().isEmpty()
                && markers[1][0].getMark().isEmpty()) {
            markers[0][1].setMark("");
        }

        boardController.fill(markers);
    }

    private void chooseHero() {
        HeroFactory factory = new HeroFactory();
        List<Hero> heroList = new ArrayList<>();
        int index = 1;

        System.out.println("====== PALADIN ======");
        List<Hero> paladin = factory.readAll(factory.paladin);
        System.out.println("   " + Hero.header());
        for (Hero hero : paladin) {
            System.out.printf("%3d%s\n", index, hero);
            index++;
        }
        heroList.addAll(paladin);

        System.out.println("====== WARRIOR ======");
        System.out.println("   " + Hero.header());
        List<Hero> warrior = factory.readAll(factory.paladin);
        for (Hero hero : warrior) {
            System.out.printf("%3d%s\n", index, hero);
            index++;
        }
        heroList.addAll(warrior);

        System.out.println("====== SORCERER ======");
        System.out.println("   " + Hero.header());
        List<Hero> sorcerer = factory.readAll(factory.paladin);
        for (Hero hero : sorcerer) {
            System.out.printf("%3d%s\n", index, hero);
            index++;
        }
        heroList.addAll(sorcerer);

        String id = null;
        do {
            System.out.println("\nInput number to choose your legend: (press Q to stop choosing)");
            id = scanner.next();
            if (!id.equals("Q") && !id.equals("q") && Integer.parseInt(id) >= 0 && Integer.parseInt(id) < heroList.size()) {
                teamController.addHero(heroList.get(Integer.parseInt(id) - 1));
                teamController.showTeam();
            }
        } while (!id.equals("Q") && !id.equals("q") || teamController.size() == 0);
    }

    public MarketController getMarketController() {
        return marketController;
    }

    @Override
    public void start() {
        System.out.println(text.WELCOM);
        System.out.println(text.INSTRUCTION);
        // wait for 2 seconds
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        chooseHero();
        context.setState(new WalkState());

        while (!isEnd()) {
            context.getState().showPrompt(context);
            String action = scanner.next();
            context.getState().doAction(context, action);
        }
    }

    @Override
    protected void initGame() {
        initBoard();
    }

    @Override
    protected boolean isEnd() {
        return false;
    }

    @Override
    public void quit() {

    }
}
