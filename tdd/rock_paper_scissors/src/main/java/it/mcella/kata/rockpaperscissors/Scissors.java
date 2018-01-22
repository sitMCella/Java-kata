package it.mcella.kata.rockpaperscissors;

import java.util.function.Consumer;

public class Scissors implements Gesture {

    @Override
    public void winOver(Gesture opponentGesture, Consumer<Winner> callback) {
        callback.accept(opponentGesture.winOverScissors().opposite());
    }

    @Override
    public Winner winOverRock() {
        return Winner.LOSE;
    }

    @Override
    public Winner winOverScissors() {
        return Winner.DRAW;
    }

    @Override
    public Winner winOverPaper() {
        return Winner.WIN;
    }

    @Override
    public boolean equals(Object obj) {
        return obj != null ? obj instanceof Scissors : this == null;
    }

}
