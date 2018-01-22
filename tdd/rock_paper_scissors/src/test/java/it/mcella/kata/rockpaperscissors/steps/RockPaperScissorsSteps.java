package it.mcella.kata.rockpaperscissors.steps;

import cucumber.api.java8.En;
import it.mcella.kata.rockpaperscissors.Engine;
import it.mcella.kata.rockpaperscissors.EngineListener;
import it.mcella.kata.rockpaperscissors.Gesture;
import it.mcella.kata.rockpaperscissors.Gestures;
import it.mcella.kata.rockpaperscissors.Player;
import it.mcella.kata.rockpaperscissors.WinnerListener;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class RockPaperScissorsSteps implements En {

    private Gestures gestures;
    private EngineListener winnerListener;
    private Engine engine;

    public RockPaperScissorsSteps() throws Throwable {

        Given("(.*) have chosen (.*)", (String playerName, String gestureName) -> {
            winnerListener = new WinnerListener();
            engine = new Engine(winnerListener);
            Player player = Player.fromName(playerName);
            gestures = new Gestures();
            Gesture gesture = gestures.fromName(gestureName);

            engine.saveGesture(gesture, player);
        });

        When("(.*) chooses (.*)", (String playerName, String gestureName) -> {
            Player player = Player.fromName(playerName);
            Gesture gesture = gestures.fromName(gestureName);
            engine.saveGesture(gesture, player);
            engine.play();
        });

        Then("(.*) should win", (String playerName) -> {
            Player player = Player.fromName(playerName);
            assertThat(winnerListener.getWinner(), is(player));
        });

    }

}
