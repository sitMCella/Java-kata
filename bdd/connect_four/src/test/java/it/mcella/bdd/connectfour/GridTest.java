package it.mcella.bdd.connectfour;

import it.mcella.bdd.connectfour.Column;
import it.mcella.bdd.connectfour.Grid;
import it.mcella.bdd.connectfour.Player;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class GridTest {

    private Grid grid;

    @Before
    public void setUp() throws Exception {
        this.grid = new Grid();

    }

    @Test
    public void shouldCreateAnEmptyGridWith7ColumnsAnd6Rows() throws Exception {
        int[][] actual = grid.getGrid();

        assertThat(grid.getGridColumnsCount(), is(7));
        assertThat(grid.getGridRowsCount(), is(6));
        int[][] expected = new int[Grid.ROWS_COUNT][Grid.COLUMNS_COUNT];
        assertThat(actual, is(expected));
    }

    @Test
    public void shouldInsertATokenIntoColumnBAndRow1IfThereAreNoTokensInColumnB() throws Exception {
        int row = grid.insertInto(Column.A, Player.YELLOW);

        assertThat(row, is(1));
    }

    @Test
    public void shouldInsertATokenIntoColumnDAndRow3IfThereAreAlready2Tokens() throws Exception {
        grid.insertInto(Column.D, Player.YELLOW);
        grid.insertInto(Column.D, Player.YELLOW);

        int row = grid.insertInto(Column.D, Player.YELLOW);

        assertThat(row, is(3));
    }

    @Test
    public void shouldInsertATokenIntoColumnFAndRow6IfThereAreAlready5Tokens() throws Exception {
        grid.insertInto(Column.F, Player.YELLOW);
        grid.insertInto(Column.F, Player.YELLOW);
        grid.insertInto(Column.F, Player.YELLOW);
        grid.insertInto(Column.F, Player.YELLOW);
        grid.insertInto(Column.F, Player.YELLOW);

        int row = grid.insertInto(Column.F, Player.YELLOW);

        assertThat(row, is(6));
    }

    @Test
    public void shouldReturnZeroIfCannotInsertATokenIntoColumnA() throws Exception {
        grid.insertInto(Column.A, Player.YELLOW);
        grid.insertInto(Column.A, Player.RED);
        grid.insertInto(Column.A, Player.YELLOW);
        grid.insertInto(Column.A, Player.RED);
        grid.insertInto(Column.A, Player.YELLOW);
        grid.insertInto(Column.A, Player.RED);

        int row = grid.insertInto(Column.A, Player.YELLOW);

        assertThat(row, is(0));
    }

    @Test
    public void shouldParseGridIfPlayerIsYellow() throws Exception {
        int[][] gridValues = {
                {1, 1, 1, 1, 1, 1, 2},
                {2, 1, 2, 2, 1, 1, 1},
                {1, 1, 2, 1, 2, 2, 2},
                {1, 2, 1, 1, 1, 2, 1},
                {1, 2, 1, 1, 2, 0, 1},
                {0, 0, 0, 2, 0, 0, 2}
        };
        Grid grid = new Grid(gridValues);

        Grid parsedGrid = grid.parseGrid(Player.YELLOW);

        int[][] expectedGridValues = {
                {1, 1, 1, 1, 1, 1, 0},
                {0, 1, 0, 0, 1, 1, 1},
                {1, 1, 0, 1, 0, 0, 0},
                {1, 0, 1, 1, 1, 0, 1},
                {1, 0, 1, 1, 0, 0, 1},
                {0, 0, 0, 0, 0, 0, 0}
        };
        assertArrayEquals(expectedGridValues, parsedGrid.getGrid());
    }

    @Test
    public void shouldParseGridIfPlayerIsRed() throws Exception {
        int[][] gridValues = {
                {2, 1, 2, 2, 2, 1, 2},
                {1, 2, 2, 1, 1, 1, 1},
                {1, 1, 2, 2, 2, 1, 2},
                {1, 1, 1, 2, 1, 2, 0},
                {1, 1, 0, 1, 0, 0, 0},
                {2, 0, 0, 1, 0, 0, 0}
        };
        Grid grid = new Grid(gridValues);

        Grid parsedGrid = grid.parseGrid(Player.RED);

        int[][] expectedGridValues = {
                {1, 0, 1, 1, 1, 0, 1},
                {0, 1, 1, 0, 0, 0, 0},
                {0, 0, 1, 1, 1, 0, 1},
                {0, 0, 0, 1, 0, 1, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0, 0}
        };
        assertArrayEquals(expectedGridValues, parsedGrid.getGrid());
    }

    @Test
    public void shouldReturnAndOperationGridGivenTwoGrids() throws Exception {
        int[][] gridValues1 = {
                {1, 0, 1, 1, 1, 0, 1},
                {0, 1, 1, 0, 0, 0, 0},
                {0, 0, 1, 1, 1, 0, 1},
                {0, 0, 0, 1, 0, 1, 0},
                {0, 0, 1, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0, 0}
        };
        Grid grid1 = new Grid(gridValues1);

        int[][] gridValues2 = {
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 1, 0, 0, 0},
                {0, 0, 1, 0, 0, 0, 0},
                {0, 1, 0, 0, 0, 0, 0}
        };
        Grid grid2 = new Grid(gridValues2);

        Grid actual = grid.and(grid1, grid2);

        int[][] expectedGridValues = {
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 1, 0, 0, 0},
                {0, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0}
        };
        Grid expected = new Grid(expectedGridValues);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnTrueIfGridsAreEqual() throws Exception {
        int[][] gridValues = {
                {2, 1, 2, 2, 2, 1, 2},
                {1, 2, 2, 1, 1, 1, 1},
                {1, 1, 2, 2, 2, 1, 2},
                {1, 1, 1, 2, 1, 2, 0},
                {1, 1, 0, 1, 0, 0, 0},
                {2, 0, 0, 1, 0, 0, 0}
        };
        Grid firstGrid = new Grid(gridValues);
        Grid secondGrid = new Grid(gridValues);

        assertEquals(firstGrid, secondGrid);
    }

    @Test
    public void shouldReturnFalseIfFirstGridIsNull() throws Exception {
        int[][] gridValues = {
                {2, 1, 2, 2, 2, 1, 2},
                {1, 2, 2, 1, 1, 1, 1},
                {1, 1, 2, 2, 2, 1, 2},
                {1, 1, 1, 2, 1, 2, 0},
                {1, 1, 0, 1, 0, 0, 0},
                {2, 0, 0, 1, 0, 0, 0}
        };
        Grid firstGrid = new Grid(null);
        Grid secondGrid = new Grid(gridValues);

        assertNotEquals(firstGrid, secondGrid);
    }

    @Test
    public void shouldReturnFalseIfSecondGridIsNull() throws Exception {
        int[][] gridValues = {
                {2, 1, 2, 2, 2, 1, 2},
                {1, 2, 2, 1, 1, 1, 1},
                {1, 1, 2, 2, 2, 1, 2},
                {1, 1, 1, 2, 1, 2, 0},
                {1, 1, 0, 1, 0, 0, 0},
                {2, 0, 0, 1, 0, 0, 0}
        };
        Grid firstGrid = new Grid(gridValues);
        Grid secondGrid = new Grid(null);

        assertNotEquals(firstGrid, secondGrid);
    }

    @Test
    public void shouldReturnFalseIfGridsAreDifferent() throws Exception {
        int[][] firstGridValues = {
                {2, 1, 2, 2, 2, 1, 2},
                {1, 2, 2, 1, 1, 1, 1},
                {1, 1, 2, 2, 2, 1, 2},
                {1, 1, 1, 2, 1, 2, 0},
                {1, 1, 0, 1, 0, 0, 0},
                {2, 0, 0, 1, 0, 0, 0}
        };
        Grid firstGrid = new Grid(firstGridValues);
        int[][] secondGridValues = {
                {1, 1, 1, 1, 1, 1, 2},
                {2, 1, 2, 2, 1, 1, 1},
                {1, 1, 2, 1, 2, 2, 2},
                {1, 2, 1, 1, 1, 2, 1},
                {1, 2, 1, 1, 2, 0, 1},
                {0, 0, 0, 2, 0, 0, 2}
        };
        Grid secondGrid = new Grid(secondGridValues);

        assertNotEquals(firstGrid, secondGrid);
    }

    @Test
    public void shouldCreateOrrizontalWinningCombinations() throws Exception {
        List<Grid> expected = new ArrayList<>();
        int[][] winningCombination1 = {
                {1, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0}
        };
        Grid grid1 = new Grid(winningCombination1);
        expected.add(grid1);
        int[][] winningCombination2 = {
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 1, 1, 1},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0}
        };
        Grid grid2 = new Grid(winningCombination2);
        expected.add(grid2);
        int[][] winningCombination3 = {
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 1, 1, 1}
        };
        Grid grid3 = new Grid(winningCombination3);
        expected.add(grid3);

        List<Grid> winningCombinations = grid.createWinningCombinations();

        assertTrue(winningCombinations.containsAll(expected));
    }

    @Test
    public void shouldCreateVerticalWinningCombinations() throws Exception {
        List<Grid> expected = new ArrayList<>();
        int[][] winningCombination1 = {
                {1, 0, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0}
        };
        Grid grid1 = new Grid(winningCombination1);
        expected.add(grid1);
        int[][] winningCombination2 = {
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 0, 0}
        };
        Grid grid2 = new Grid(winningCombination2);
        expected.add(grid2);
        int[][] winningCombination3 = {
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 0, 1}
        };
        Grid grid3 = new Grid(winningCombination3);
        expected.add(grid3);

        List<Grid> winningCombinations = grid.createWinningCombinations();

        assertTrue(winningCombinations.containsAll(expected));
    }

    @Test
    public void shouldCreateDiagonalRightWinningCombinations() throws Exception {
        List<Grid> expected = new ArrayList<>();
        int[][] winningCombination1 = {
                {1, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0}
        };
        Grid grid1 = new Grid(winningCombination1);
        expected.add(grid1);
        int[][] winningCombination2 = {
                {0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0}
        };
        Grid grid2 = new Grid(winningCombination2);
        expected.add(grid2);
        int[][] winningCombination3 = {
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 0, 1}
        };
        Grid grid3 = new Grid(winningCombination3);
        expected.add(grid3);

        List<Grid> winningCombinations = grid.createWinningCombinations();

        assertTrue(winningCombinations.containsAll(expected));
    }

    @Test
    public void shouldCreateDiagonalLeftWinningCombinations() throws Exception {
        List<Grid> expected = new ArrayList<>();
        int[][] winningCombination1 = {
                {0, 0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0}
        };
        Grid grid1 = new Grid(winningCombination1);
        expected.add(grid1);
        int[][] winningCombination2 = {
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 1, 0, 0, 0}
        };
        Grid grid2 = new Grid(winningCombination2);
        expected.add(grid2);
        int[][] winningCombination3 = {
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0},
                {0, 0, 1, 0, 0, 0, 0},
                {0, 1, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0, 0}
        };
        Grid grid3 = new Grid(winningCombination3);
        expected.add(grid3);

        List<Grid> winningCombinations = grid.createWinningCombinations();

        assertTrue(winningCombinations.containsAll(expected));
    }

}