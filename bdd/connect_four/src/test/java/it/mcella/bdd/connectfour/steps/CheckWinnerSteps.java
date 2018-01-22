package it.mcella.bdd.connectfour.steps;

import cucumber.api.DataTable;
import cucumber.api.java8.En;
import it.mcella.bdd.connectfour.Grid;
import it.mcella.bdd.connectfour.GridOperations;
import it.mcella.bdd.connectfour.Player;
import sun.security.util.PendingException;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class CheckWinnerSteps implements En {

    private Grid grid;
    private GridOperations gridOperations;
    private Player winner;

    public CheckWinnerSteps() throws Throwable {

        Given("I have a grid like", (DataTable table) -> {
            this.grid = convertTableToGrid(table);
            this.gridOperations = new GridOperations(grid);
        });

        When("I check for winners", () -> {
            this.winner = gridOperations.checkWinner();
        });

        Then("the winner should be (.*)", (String winnerName) -> {
            Player player = Player.fromName(winnerName);
            assertThat(winner, is(player));
        });

    }

    private Grid convertTableToGrid(DataTable dataTable) {
        List<List<Integer>> table = dataTable.asLists(Integer.class);
        int[][] gridValues = new int[Grid.ROWS_COUNT][Grid.COLUMNS_COUNT];
        for (int row = Grid.ROWS_COUNT - 1; row >= 0; row--) {
            gridValues[row] = table.get(Grid.ROWS_COUNT - 1 - row).stream().mapToInt(value -> value).toArray();
        }
        return new Grid(gridValues);
    }

}
