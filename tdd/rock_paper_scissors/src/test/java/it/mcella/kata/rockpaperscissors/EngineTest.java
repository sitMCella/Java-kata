package it.mcella.kata.rockpaperscissors;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class EngineTest {

    private Mockery context = new Mockery();

    private final EngineListener engineListener = context.mock(EngineListener.class);

    @Test
    public void shouldSavePlayerOneGesture() throws Exception {
        Engine engine = new Engine(engineListener);

        engine.saveGesture(new Rock(), Player.PLAYER_ONE);

        assertThat(engine.getPlayerOneGesture(), is(new Rock()));
    }

    @Test
    public void shouldSavePlayerTwoGesture() throws Exception {
        Engine engine = new Engine(engineListener);

        engine.saveGesture(new Scissors(), Player.PLAYER_TWO);

        assertThat(engine.getPlayerTwoGesture(), is(new Scissors()));
    }

    @Test
    public void shouldWinPlayerOne() throws Exception {
        Engine engine = new Engine(engineListener);
        engine.saveGesture(new Rock(), Player.PLAYER_ONE);
        engine.saveGesture(new Scissors(), Player.PLAYER_TWO);

        context.checking(new Expectations() {{
            oneOf(engineListener).win(Player.PLAYER_ONE);
        }});

        engine.play();
    }

    @Test
    public void shouldWinPlayerTwo() throws Exception {
        Engine engine = new Engine(engineListener);
        engine.saveGesture(new Scissors(), Player.PLAYER_ONE);
        engine.saveGesture(new Rock(), Player.PLAYER_TWO);

        context.checking(new Expectations() {{
            oneOf(engineListener).win(Player.PLAYER_TWO);
        }});

        engine.play();
    }

    @Test
    public void shouldWinBothPlayers() throws Exception {
        Engine engine = new Engine(engineListener);
        engine.saveGesture(new Rock(), Player.PLAYER_ONE);
        engine.saveGesture(new Rock(), Player.PLAYER_TWO);

        context.checking(new Expectations() {{
            oneOf(engineListener).win(Player.BOTH);
        }});

        engine.play();
    }

}