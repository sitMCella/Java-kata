package it.mcella.kata.rockpaperscissors;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class RockTest {

    @Test
    public void shouldReturnDrawIfBothPlayersPlayRock() throws Exception {
        Rock rock = new Rock();

        Winner winner = rock.winOverRock();

        assertThat(winner, is(Winner.DRAW));
    }

    @Test
    public void shouldReturnWinIfOpponentPlayScissors() throws Exception {
        Rock rock = new Rock();

        Winner winner = rock.winOverScissors();

        assertThat(winner, is(Winner.WIN));
    }

    @Test
    public void shouldReturnLoseIfOpponentPlayPaper() throws Exception {
        Rock rock = new Rock();

        Winner winner = rock.winOverPaper();

        assertThat(winner, is(Winner.LOSE));
    }

}