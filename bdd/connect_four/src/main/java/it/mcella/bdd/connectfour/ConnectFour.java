package it.mcella.bdd.connectfour;

import it.mcella.bdd.connectfour.Column;
import it.mcella.bdd.connectfour.Grid;
import it.mcella.bdd.connectfour.GridOperations;
import it.mcella.bdd.connectfour.Player;

import java.util.Collection;
import java.util.List;
import java.util.Random;

public class ConnectFour {
    private static final int MAX_MOVES = 42;

    private final GridOperations gridOperations;

    private Random random;
    private List<Column> availableColumns;
    private int movesCount;
    private Player player;
    private Player winner;

    public ConnectFour(GridOperations gridOperations, Random random) {
        this.gridOperations = gridOperations;
        this.random = random;
        this.availableColumns = Column.getAll();
        this.movesCount = 0;
        this.player = Player.YELLOW;
        this.winner = Player.UNDEFINED;
    }

    public void start() {
        while (winner == Player.UNDEFINED && movesCount <= MAX_MOVES) {
            winner = move(player);
            movesCount++;
            player = switchPlayer(player);
        }
        if (winner != Player.UNDEFINED) {
            System.out.println("Winner: " + winner.name());
        } else {
            System.out.println("Game over. No winners");
        }
        System.out.println("Moves count: " + movesCount);
    }

    Player getPlayer() {
        return player;
    }

    Player getWinner() {
        return winner;
    }

    Collection<Column> getAvailableColumns() {
        return availableColumns;
    }

    int getMovesCount() {
        return movesCount;
    }

    Player move(Player player) {
        int row = Grid.UNDEFINED_ROW;
        Column column = null;
        while (row == Grid.UNDEFINED_ROW) {
            int index = random.nextInt(availableColumns.size());
            column = availableColumns.get(index);

            row = gridOperations.insertInto(column, player);
            if (row == Grid.UNDEFINED_ROW) {
                availableColumns.remove(column);
            }
        }
        showMoveInfo(column, row);
        return gridOperations.checkWinner();
    }

    private void showMoveInfo(Column column, int row) {
        System.out.println("Player: " + player.name());
        System.out.println("Column: " + column.name());
        System.out.println("Row: " + row);
        System.out.println(gridOperations.getGrid());
    }

    private Player switchPlayer(Player player) {
        if (Player.YELLOW == player) {
            return Player.RED;
        }
        return Player.YELLOW;
    }

}
