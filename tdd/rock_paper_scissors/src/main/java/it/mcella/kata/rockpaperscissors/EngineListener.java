package it.mcella.kata.rockpaperscissors;

public interface EngineListener {

    void win(Player player);

    Player getWinner();

}
