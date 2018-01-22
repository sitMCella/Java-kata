package it.mcella.kata.connectfour;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.lib.legacy.ClassImposteriser;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

public class GridOperationsTest {

    private Mockery context = new Mockery() {{
        setImposteriser(ClassImposteriser.INSTANCE);
    }};

    private final Grid grid = context.mock(Grid.class);

    private GridOperations gridOperations;

    @Before
    public void setUp() throws Exception {
        int[][] gridValues1 = {
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 1, 1, 1},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0}
        };
        Grid winningCombination1 = new Grid(gridValues1);
        List<Grid> winningCombinations = new ArrayList<Grid>() {{
            add(winningCombination1);
        }};

        context.checking(new Expectations() {{
            oneOf(grid).createWinningCombinations();
            will(returnValue(winningCombinations));
        }});

        this.gridOperations = new GridOperations(grid);
    }

    @Test
    public void shouldCreateWinningCombinations() throws Exception {
        assertNotNull(gridOperations.getWinningCombinations());
        assertFalse(gridOperations.getWinningCombinations().isEmpty());
    }

    @Test
    public void shouldPlayerInsertTokenIntoGrid() throws Exception {
        context.checking(new Expectations() {{
            oneOf(grid).insertInto(Column.A, Player.YELLOW);
        }});

        gridOperations.insertInto(Column.A, Player.YELLOW);
    }

    @Test
    public void shouldReturnPlayerUndefinedIfThereAreNoWinner() throws Exception {
        Grid parsedGridPlayerYellow = new Grid(new int[][]{
                {0, 1, 0, 0, 0, 1, 0},
                {1, 0, 0, 1, 1, 0, 0},
                {1, 1, 0, 0, 0, 1, 0},
                {0, 1, 1, 0, 1, 0, 0},
                {1, 1, 0, 1, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0}
        });
        Grid andGridPlayerYellow = new Grid(new int[][]{
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0}
        });
        Grid parsedGridPlayerRed = new Grid(new int[][]{
                {1, 0, 1, 1, 1, 0, 1},
                {0, 1, 1, 0, 0, 0, 0},
                {0, 0, 1, 1, 1, 0, 1},
                {0, 0, 0, 1, 0, 1, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0, 0}
        });
        Grid andGridPlayerRed = new Grid(new int[][]{
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0}
        });
        context.checking(new Expectations() {{
            oneOf(grid).parseGrid(Player.YELLOW);
            will(returnValue(parsedGridPlayerYellow));
            oneOf(grid).and(parsedGridPlayerYellow, gridOperations.getWinningCombinations().get(0));
            will(returnValue(andGridPlayerYellow));
            oneOf(grid).parseGrid(Player.RED);
            will(returnValue(parsedGridPlayerRed));
            oneOf(grid).and(parsedGridPlayerRed, gridOperations.getWinningCombinations().get(0));
            will(returnValue(andGridPlayerRed));
        }});

        Player actual = gridOperations.checkWinner();

        assertThat(actual, is(Player.UNDEFINED));
    }

    @Test
    public void shouldReturnPlayerYellowIfHisGridHasAWinningCombination() throws Exception {
        Grid parsedGridPlayerYellow = new Grid(new int[][]{
                {0, 1, 0, 0, 0, 1, 0},
                {1, 0, 0, 1, 1, 1, 1},
                {1, 1, 0, 0, 0, 1, 0},
                {0, 1, 1, 0, 1, 0, 0},
                {1, 1, 0, 1, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0}
        });
        Grid andGridPlayerYellow = new Grid(new int[][]{
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 1, 1, 1},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0}
        });
        Grid parsedGridPlayerRed = new Grid(new int[][]{
                {1, 0, 1, 1, 1, 0, 1},
                {0, 1, 1, 0, 0, 0, 0},
                {0, 0, 1, 1, 1, 0, 1},
                {0, 0, 0, 1, 0, 1, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0, 0}
        });
        Grid andGridPlayerRed = new Grid(new int[][]{
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0}
        });
        context.checking(new Expectations() {{
            oneOf(grid).parseGrid(Player.YELLOW);
            will(returnValue(parsedGridPlayerYellow));
            oneOf(grid).and(parsedGridPlayerYellow, gridOperations.getWinningCombinations().get(0));
            will(returnValue(andGridPlayerYellow));
            oneOf(grid).parseGrid(Player.RED);
            will(returnValue(parsedGridPlayerRed));
            oneOf(grid).and(parsedGridPlayerRed, gridOperations.getWinningCombinations().get(0));
            will(returnValue(andGridPlayerRed));
        }});

        Player actual = gridOperations.checkWinner();

        assertThat(actual, is(Player.YELLOW));
    }

    @Test
    public void shouldReturnPlayerRedIfHisGridHasAWinningCombination() throws Exception {
        Grid parsedGridPlayerYellow = new Grid(new int[][]{
                {1, 0, 1, 1, 1, 0, 1},
                {0, 1, 1, 0, 0, 0, 0},
                {0, 0, 1, 1, 1, 0, 1},
                {0, 0, 0, 1, 0, 1, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0, 0}
        });
        Grid andGridPlayerYellow = new Grid(new int[][]{
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0}
        });
        Grid parsedGridPlayerRed = new Grid(new int[][]{
                {0, 1, 0, 0, 0, 1, 0},
                {1, 0, 0, 1, 1, 1, 1},
                {1, 1, 0, 0, 0, 1, 0},
                {0, 1, 1, 0, 1, 0, 0},
                {1, 1, 0, 1, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0}
        });
        Grid andGridPlayerRed = new Grid(new int[][]{
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 1, 1, 1},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0}
        });
        context.checking(new Expectations() {{
            oneOf(grid).parseGrid(Player.YELLOW);
            will(returnValue(parsedGridPlayerYellow));
            oneOf(grid).and(parsedGridPlayerYellow, gridOperations.getWinningCombinations().get(0));
            will(returnValue(andGridPlayerYellow));
            oneOf(grid).parseGrid(Player.RED);
            will(returnValue(parsedGridPlayerRed));
            oneOf(grid).and(parsedGridPlayerRed, gridOperations.getWinningCombinations().get(0));
            will(returnValue(andGridPlayerRed));
        }});

        Player actual = gridOperations.checkWinner();

        assertThat(actual, is(Player.RED));
    }

}