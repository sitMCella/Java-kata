package it.mcella.kata.connectfour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public enum Column {
    A(1),
    B(2),
    C(3),
    D(4),
    E(5),
    F(6),
    G(7);

    private final int number;

    private Column(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public static Column fromNumber(int number) {
        for(Column column: values()) {
            if(column.getNumber() == number) {
                return column;
            }
        }
        return null;
    }

    public static List<Column> getAll() {
        return new ArrayList<>(Arrays.asList(Column.values()));
    }

    public static int getMinNumber() {
        return Column.A.number;
    }

    public static int getMaxNumber() {
        return Column.G.number;
    }

}
