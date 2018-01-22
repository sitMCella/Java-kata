package it.mcella.kata.rockpaperscissors;

import java.util.function.Consumer;

public class Paper implements Gesture {

    @Override
    public void winOver(Gesture opponentGesture, Consumer<Winner> callback) {
        callback.accept(opponentGesture.winOverPaper().opposite());
    }

    @Override
    public Winner winOverRock() {
        return Winner.WIN;
    }

    @Override
    public Winner winOverScissors() {
        return Winner.LOSE;
    }

    @Override
    public Winner winOverPaper() {
        return Winner.DRAW;
    }

    @Override
    public boolean equals(Object obj) {
        return obj != null ? obj instanceof Paper : this == null;
    }

}
