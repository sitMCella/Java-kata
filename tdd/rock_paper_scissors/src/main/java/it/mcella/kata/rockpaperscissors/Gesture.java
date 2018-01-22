package it.mcella.kata.rockpaperscissors;

import java.util.function.Consumer;

public interface Gesture {

    void winOver(Gesture opponentGesture, Consumer<Winner> callback);

    Winner winOverRock();

    Winner winOverScissors();

    Winner winOverPaper();

}
