package it.mcella.kata.rockpaperscissors;

public enum Winner {
    WIN,
    LOSE,
    DRAW;

    public Winner opposite() {
        switch(this) {
            case WIN:
                return LOSE;
            case LOSE:
                return WIN;
            default:
                return DRAW;
        }
    }
}
