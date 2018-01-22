package it.mcella.kata.rockpaperscissors;

public class Engine {

    private final EngineListener engineListener;

    private Gesture playerOneGesture;
    private Gesture playerTwoGesture;

    public Engine(EngineListener engineListener) {
        this.engineListener = engineListener;
    }

    public void saveGesture(Gesture gesture, Player player) {
        switch (player) {
            case PLAYER_ONE:
                playerOneGesture = gesture;
                break;
            case PLAYER_TWO:
                playerTwoGesture = gesture;
                break;
        }
    }

    public void play() {
        playerOneGesture.winOver(playerTwoGesture, winner -> {
            switch(winner) {
                case WIN:
                    engineListener.win(Player.PLAYER_ONE);
                    break;
                case LOSE:
                    engineListener.win(Player.PLAYER_TWO);
                    break;
                default:
                    engineListener.win(Player.BOTH);
            }
        });
    }

    Gesture getPlayerOneGesture() {
        return playerOneGesture;
    }

    Gesture getPlayerTwoGesture() {
        return playerTwoGesture;
    }
}
