package it.mcella.bdd.connectfour;

import it.mcella.bdd.connectfour.Column;
import it.mcella.bdd.connectfour.Grid;
import it.mcella.bdd.connectfour.Player;

import java.util.List;

public class GridOperations {

    private final Grid grid;
    private final List<Grid> winningCombinations;

    public GridOperations(Grid grid) {
        this.grid = grid;
        this.winningCombinations = grid.createWinningCombinations();
    }

    public int insertInto(Column column, Player player) {
        return grid.insertInto(column, player);
    }

    public Player checkWinner() {
        return Player.getPlayers().stream()
                .filter((player) -> checkIfWinnerIs(player))
                .findFirst()
                .orElse(Player.UNDEFINED);
    }

    Grid getGrid() {
        return grid;
    }

    List<Grid> getWinningCombinations() {
        return winningCombinations;
    }

    private boolean checkIfWinnerIs(Player player) {
        Grid parsedGrid = grid.parseGrid(player);
        return winningCombinations.stream()
                .filter((winningCombination) -> checkIfWinningCombination(parsedGrid, winningCombination))
                .findFirst()
                .isPresent();
    }

    private boolean checkIfWinningCombination(Grid parsedGrid, Grid winningCombination) {
        Grid and = grid.and(parsedGrid, winningCombination);
        return winningCombination.equals(and);
    }

}
