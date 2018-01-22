package it.mcella.kata.rockpaperscissors;

import java.util.HashMap;
import java.util.Map;

public class Gestures {

    private final Map<String, Gesture> gestures;

    public Gestures() {
        Map<String, Gesture> gestures = new HashMap<>();
        gestures.put("rock", new Rock());
        gestures.put("scissors", new Scissors());
        gestures.put("paper", new Paper());
        this.gestures = gestures;
    }

    public Gesture fromName(String name) {
        return gestures.get(name);
    }

}
