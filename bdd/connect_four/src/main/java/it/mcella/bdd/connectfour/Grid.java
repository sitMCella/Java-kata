package it.mcella.bdd.connectfour;

import java.util.ArrayList;
import java.util.List;

public class Grid {

    public static int COLUMNS_COUNT = 7;
    public static int ROWS_COUNT = 6;
    public static final int UNDEFINED_ROW = 0;

    private static int UNASSIGNED = 0;

    static int MASK = 1;

    private final int[][] grid;

    public Grid() {
        this.grid = new int[ROWS_COUNT][COLUMNS_COUNT];
    }

    public Grid(int[][] grid) {
        this.grid = grid;
    }

    public List<Grid> createWinningCombinations() {
        List<Grid> winningCombinations = new ArrayList<>();
        winningCombinations.addAll(createOrrizontalWinningCombinations());
        winningCombinations.addAll(createVerticalWinningCombinations());
        winningCombinations.addAll(createDiagonalRightWinningCombinations());
        winningCombinations.addAll(createDiagonalLeftWinningCombinations());
        return winningCombinations;
    }

    public int insertInto(Column column, Player player) {
        int row = UNDEFINED_ROW;
        while (row < ROWS_COUNT && grid[row][column.getNumber() - 1] != UNASSIGNED) {
            row++;
        }
        if (row >= ROWS_COUNT) {
            return UNDEFINED_ROW;
        }
        grid[row][column.getNumber() - 1] = player.getNumber();
        return row + 1;
    }

    public Grid parseGrid(Player player) {
        int[][] parsedGrid = new int[ROWS_COUNT][COLUMNS_COUNT];
        for (int row = 0; row < ROWS_COUNT; row++) {
            for (int column = 0; column < COLUMNS_COUNT; column++) {
                if (grid[row][column] == player.getNumber()) {
                    parsedGrid[row][column] = 1;
                }
            }
        }
        return new Grid(parsedGrid);
    }

    public Grid and(Grid grid1, Grid grid2) {
        int[][] andGrid = new int[ROWS_COUNT][COLUMNS_COUNT];
        for (int row = 0; row < ROWS_COUNT; row++) {
            for (int column = 0; column < COLUMNS_COUNT; column++) {
                andGrid[row][column] = grid1.getGrid()[row][column] & grid2.getGrid()[row][column];
            }
        }
        return new Grid(andGrid);
    }

    public int[][] getGrid() {
        return grid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Grid)) {
            return false;
        }

        Grid otherGrid = (Grid) o;

        return grid != null ? checkGridEquals(otherGrid.grid) : otherGrid.getGrid() == null;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        for (int row = ROWS_COUNT - 1; row >= 0; row--) {
            stringBuilder.append("[ ");
            for (int column = 0; column <= COLUMNS_COUNT - 1; column++) {
                stringBuilder.append(grid[row][column]).append(" ");
            }
            stringBuilder.append("]").append("\n");
        }
        return stringBuilder.toString();
    }

    int getGridColumnsCount() {
        return grid[0].length;
    }

    int getGridRowsCount() {
        return grid.length;
    }

    private List<Grid> createOrrizontalWinningCombinations() {
        List<Grid> winningCombinations = new ArrayList<>();
        for (int row = 0; row < ROWS_COUNT; row++) {
            for (int column = 0; column <= COLUMNS_COUNT - 4; column++) {
                int[][] winningCombination = new int[ROWS_COUNT][COLUMNS_COUNT];
                winningCombination[row][Column.fromNumber(column + 1).getNumber() - 1] = MASK;
                winningCombination[row][Column.fromNumber(column + 2).getNumber() - 1] = MASK;
                winningCombination[row][Column.fromNumber(column + 3).getNumber() - 1] = MASK;
                winningCombination[row][Column.fromNumber(column + 4).getNumber() - 1] = MASK;
                Grid winningGrid = new Grid(winningCombination);
                winningCombinations.add(winningGrid);
            }
        }
        return winningCombinations;
    }

    private List<Grid> createVerticalWinningCombinations() {
        List<Grid> winningCombinations = new ArrayList<>();
        for (int row = 0; row <= ROWS_COUNT - 4; row++) {
            for (int column = 0; column < COLUMNS_COUNT; column++) {
                int[][] winningCombination = new int[ROWS_COUNT][COLUMNS_COUNT];
                winningCombination[row][Column.fromNumber(column + 1).getNumber() - 1] = MASK;
                winningCombination[row + 1][Column.fromNumber(column + 1).getNumber() - 1] = MASK;
                winningCombination[row + 2][Column.fromNumber(column + 1).getNumber() - 1] = MASK;
                winningCombination[row + 3][Column.fromNumber(column + 1).getNumber() - 1] = MASK;
                Grid winningGrid = new Grid(winningCombination);
                winningCombinations.add(winningGrid);
            }
        }
        return winningCombinations;
    }

    private List<Grid> createDiagonalRightWinningCombinations() {
        List<Grid> winningCombinations = new ArrayList<>();
        for (int row = 0; row <= ROWS_COUNT - 4; row++) {
            for (int column = 0; column <= COLUMNS_COUNT - 4; column++) {
                int[][] winningCombination = new int[ROWS_COUNT][COLUMNS_COUNT];
                winningCombination[row][Column.fromNumber(column + 1).getNumber() - 1] = MASK;
                winningCombination[row + 1][Column.fromNumber(column + 2).getNumber() - 1] = MASK;
                winningCombination[row + 2][Column.fromNumber(column + 3).getNumber() - 1] = MASK;
                winningCombination[row + 3][Column.fromNumber(column + 4).getNumber() - 1] = MASK;
                Grid winningGrid = new Grid(winningCombination);
                winningCombinations.add(winningGrid);
            }
        }
        return winningCombinations;
    }

    private List<Grid> createDiagonalLeftWinningCombinations() {
        List<Grid> winningCombinations = new ArrayList<>();
        for (int row = 0; row <= ROWS_COUNT - 4; row++) {
            for (int column = COLUMNS_COUNT - 1; column >= 3; column--) {
                int[][] winningCombination = new int[ROWS_COUNT][COLUMNS_COUNT];
                winningCombination[row][Column.fromNumber(column + 1).getNumber() - 1] = MASK;
                winningCombination[row + 1][Column.fromNumber(column).getNumber() - 1] = MASK;
                winningCombination[row + 2][Column.fromNumber(column - 1).getNumber() - 1] = MASK;
                winningCombination[row + 3][Column.fromNumber(column - 2).getNumber() - 1] = MASK;
                Grid winningGrid = new Grid(winningCombination);
                winningCombinations.add(winningGrid);
            }
        }
        return winningCombinations;
    }

    private boolean checkGridEquals(int[][] otherGrid) {
        if (otherGrid == null) {
            return false;
        }
        for (int row = 0; row < ROWS_COUNT; row++) {
            for (int column = 0; column < COLUMNS_COUNT; column++) {
                if (grid[row][column] != otherGrid[row][column]) {
                    return false;
                }
            }
        }
        return true;
    }

}
