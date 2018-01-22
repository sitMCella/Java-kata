package it.mcella.kata.rockpaperscissors;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ScissorsTest {

    @Test
    public void shouldReturnLoseIfOpponentPlayRock() throws Exception {
        Scissors scissors = new Scissors();

        Winner winner = scissors.winOverRock();

        assertThat(winner, is(Winner.LOSE));
    }

    @Test
    public void shouldReturnDrawIfBothPlayersPlayScissors() throws Exception {
        Scissors scissors = new Scissors();

        Winner winner = scissors.winOverScissors();

        assertThat(winner, is(Winner.DRAW));
    }

    @Test
    public void shouldReturnWinIfOpponentPlayPaper() throws Exception {
        Scissors scissors = new Scissors();

        Winner winner = scissors.winOverPaper();

        assertThat(winner, is(Winner.WIN));
    }

}