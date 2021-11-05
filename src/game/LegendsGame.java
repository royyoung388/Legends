package game;

import bean.Hero;
import controller.PlayerController;
import controller.PlayerControllerImpl;
import factory.HeroFactory;
import font.Font;
import model.Marker;
import model.PlayerModel;
import state.WalkState;
import utils.Dice;
import utils.LegendMarker;
import view.PlayerView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class LegendsGame extends RPGGame {
    private Scanner scanner;

    public LegendsGame() {
        this(8, 8);
    }

    public LegendsGame(int row, int column) {
        super(row, column);
        scanner = new Scanner(System.in);
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

    private void showTeam() {
        System.out.println("===== Your Team =====");
        System.out.println("   " + Hero.header());
        int index = 0;
        for (PlayerController playerController : playerControllerList) {
            System.out.printf("%3d%s\n", index, playerController.getHero());
            index++;
        }
        System.out.println("======================\n");
    }

    private void chooseHero() {
        HeroFactory factory = new HeroFactory();
        List<Hero> heroList = new ArrayList<>();
        int index = 0;

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
        heroList.addAll(factory.readAll(factory.warrior));
        List<Hero> warrior = factory.readAll(factory.paladin);
        for (Hero hero : warrior) {
            System.out.printf("%3d%s\n", index, hero);
            index++;
        }
        heroList.addAll(warrior);

        System.out.println("====== SORCERER ======");
        System.out.println("   " + Hero.header());
        heroList.addAll(factory.readAll(factory.sorcerer));
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
            if (!id.equals("Q") && !id.equals("q")) {
                playerControllerList.add(
                        new PlayerControllerImpl(new PlayerView(), new PlayerModel(heroList.get(Integer.parseInt(id)))));
                showTeam();
            }
        } while (!id.equals("Q") && !id.equals("q") || playerControllerList.size() == 0 );
    }

    @Override
    public void start() {
        System.out.println(Font.WELCOM);
        System.out.println(Font.INSTRUCTION);
        // wait for 3 seconds
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        chooseHero();
        state = new WalkState();

        while (!isEnd()) {
            System.out.println(Font.CONTROL);
            boardController.show();
            System.out.println("\nInput your action:");
            String action = scanner.next();
            state.doAction(context, action);
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
