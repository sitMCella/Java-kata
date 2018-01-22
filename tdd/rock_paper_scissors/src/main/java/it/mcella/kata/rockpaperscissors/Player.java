package it.mcella.kata.rockpaperscissors;

public enum Player {

    PLAYER_ONE("Player One"),
    PLAYER_TWO("Player Two"),
    BOTH("Both");

    private final String name;

    Player(String name) {
        this.name = name;
    }

    public static Player fromName(String name)  {
        for(Player player: values()) {
            if(player.name.equals(name)) {
                return player;
            }
        }
        return null;
    }
}
