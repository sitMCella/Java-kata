package it.mcella.bdd.connectfour.steps;

import cucumber.api.java8.En;
import it.mcella.bdd.connectfour.Column;
import it.mcella.bdd.connectfour.Grid;
import it.mcella.bdd.connectfour.Player;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class AddTokenSteps implements En {

    private Grid grid;
    private Column column;
    private int row;

    public AddTokenSteps() throws Throwable {

        Given("a grid with (\\d+) tokens in column (.*)", (Integer tokensCount, String columnName) -> {
            this.column = Column.fromName(columnName);

            this.grid = new Grid();
            for (int i = 0; i < tokensCount; i++) {
                grid.insertInto(column, Player.YELLOW);
            }
        });

        When("I place a token in that column", () -> {
            this.row = grid.insertInto(column, Player.YELLOW);
        });

        Then("that token should be in row (\\d+)", (Integer expectedRow) -> {
            assertThat(row, is(expectedRow));
        });

    }

}
