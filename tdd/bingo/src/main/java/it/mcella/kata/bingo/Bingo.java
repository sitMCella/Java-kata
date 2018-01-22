package it.mcella.kata.bingo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bingo {

    private final List<Player> players;
    private final Caller caller;

    private List<Integer> calledNumbers;
    private boolean bingoCalled;

    public Bingo() {
        this(createPlayers(), new Caller());
    }

    Bingo(List<Player> players, Caller caller) {
        this.players = players;
        this.caller = caller;
        this.calledNumbers = new ArrayList<>();
        this.bingoCalled = false;
    }

    public void start() {
        start(false);
    }

    void start(boolean test) {
        try {
            do {
                int number = caller.call();
                calledNumbers.add(number);
                System.out.println("Called number: " + number);

                players.stream()
                        .filter(player -> player.checkBingo(number))
                        .forEach(this::callBingo);
            } while (!bingoCalled && !test);
        } catch (CallerException ex) {
            System.out.println("Box is empty. Game over");
        }
    }

    void callBingo(Player player) {
        System.out.println("Player " + player.getName() + " called Bingo");
        if (calledNumbers.size() < Card.CARD_CELLS) {
            return;
        }
        Card card = player.getCard();
        if (card.containsAll(calledNumbers)) {
            bingoCalled = true;
            System.out.println("Player " + player.getName() + " win the game");
        }
    }

    int getPlayersCount() {
        return players.size();
    }

    List<Integer> getCalledNumbers() {
        return calledNumbers;
    }

    void setCalledNumbers(List<Integer> calledNumbers) {
        this.calledNumbers = calledNumbers;
    }

    boolean isBingoCalled() {
        return bingoCalled;
    }

    private static List<Player> createPlayers() {
        List<Player> players = new ArrayList<>();
        Random random = new Random();
        int numberOfPlayers = random.nextInt(10 - 2) + 2;
        for (int i = 0; i < numberOfPlayers; i++) {
            players.add(new Player(String.valueOf(i + 1), new CardGenerator()));
        }
        printPlayersCard(players);
        return players;
    }

    private static void printPlayersCard(List<Player> players) {
        players.stream()
                .forEach(player -> {
                    System.out.println("Player " + player.getName());
                    player.getCard().print();
                });
    }

}
