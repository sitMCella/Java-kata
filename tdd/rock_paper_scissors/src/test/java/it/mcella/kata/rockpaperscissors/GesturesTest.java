package it.mcella.kata.rockpaperscissors;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GesturesTest {

    @Test
    public void shouldReturnRockIfNameIsRock() throws Exception {
        Gestures gestures = new Gestures();

        Gesture actual = gestures.fromName("rock");

        assertThat(actual, is(new Rock()));
    }

    @Test
     public void shouldReturnScissorsIfNameIsScissors() throws Exception {
        Gestures gestures = new Gestures();

        Gesture actual = gestures.fromName("scissors");

        assertThat(actual, is(new Scissors()));
    }

    @Test
    public void shouldReturnPaperIfNameIsPaper() throws Exception {
        Gestures gestures = new Gestures();

        Gesture actual = gestures.fromName("paper");

        assertThat(actual, is(new Paper()));
    }

}