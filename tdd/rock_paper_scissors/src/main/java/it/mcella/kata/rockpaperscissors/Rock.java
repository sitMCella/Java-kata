package it.mcella.kata.rockpaperscissors;

import java.util.function.Consumer;

public class Rock implements Gesture {

    @Override
    public void winOver(Gesture opponentGesture, Consumer<Winner> callback) {
        callback.accept(opponentGesture.winOverRock().opposite());
    }

    @Override
    public Winner winOverRock() {
        return Winner.DRAW;
    }

    @Override
    public Winner winOverScissors() {
        return Winner.WIN;
    }

    @Override
    public Winner winOverPaper() {
        return Winner.LOSE;
    }

    @Override
    public boolean equals(Object obj) {
        return obj != null ? obj instanceof Rock : this == null;
    }

}
