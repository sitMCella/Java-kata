package it.mcella.kata.rockpaperscissors;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class PaperTest {

    @Test
    public void shouldReturnWinIfOpponentPlayRock() throws Exception {
        Paper paper = new Paper();

        Winner winner = paper.winOverRock();

        assertThat(winner, is(Winner.WIN));
    }

    @Test
    public void shouldReturnLoseIfOpponentPlayScissors() throws Exception {
        Paper paper = new Paper();

        Winner winner = paper.winOverScissors();

        assertThat(winner, is(Winner.LOSE));
    }

    @Test
    public void shouldReturnDrawIfBothPlayersPlayPaper() throws Exception {
        Paper paper = new Paper();

        Winner winner = paper.winOverPaper();

        assertThat(winner, is(Winner.DRAW));
    }

}