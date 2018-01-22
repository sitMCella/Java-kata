package it.mcella.kata.bingo;

import java.util.Arrays;

public class Column {

    public static final int ROW_NUMBER = 5;

    private final Integer[] rows;

    public Column(Integer... rows) {
        this.rows = rows;
    }

    public Integer[] getRows() {
        return rows;
    }

    public int getFirstCell() {
        return rows[0];
    }

    public void setFirstCell(int number) {
        rows[0] = number;
    }

    public int getSecondCell() {
        return rows[1];
    }

    public void setSecondCell(int number) {
        rows[1] = number;
    }

    public int getThirdCell() {
        return rows[2];
    }

    public void setThirdCell(int number) {
        rows[2] = number;
    }

    public int getFourthCell() {
        return rows[3];
    }

    public void setFourthCell(int number) {
        rows[3] = number;
    }

    public int getFifthCell() {
        return rows[4];
    }

    public void setFifthCell(int number) {
        rows[4] = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Column)) return false;

        Column column = (Column) o;

        if (!Arrays.equals(rows, column.rows)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return rows != null ? Arrays.hashCode(rows) : 0;
    }
}
