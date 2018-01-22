package it.mcella.kata.connectfour;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum Player {

    UNDEFINED(0),
    YELLOW(1),
    RED(2);

    private final int number;

    private Player(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public static List<Player> getPlayers() {
        return Arrays.stream(values())
                .skip(1)
                .collect(Collectors.toList());
    }

}
