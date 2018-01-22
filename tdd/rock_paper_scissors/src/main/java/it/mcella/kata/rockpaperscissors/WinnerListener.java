package it.mcella.kata.rockpaperscissors;

public class WinnerListener implements EngineListener {

    private Player winner;

    public WinnerListener() {
    }

    @Override
    public void win(Player player) {
        winner = player;
    }

    @Override
    public Player getWinner() {
        return winner;
    }

}
