package it.mcella.kata.rockpaperscissors;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class WinnerTest {

    @Test
    public void shouldReturnLoseIfWin() throws Exception {
        assertThat(Winner.WIN.opposite(), is(Winner.LOSE));
    }

    @Test
    public void shouldReturnWinIfLose() throws Exception {
        assertThat(Winner.LOSE.opposite(), is(Winner.WIN));
    }

    @Test
    public void shouldReturnDrawIfDraw() throws Exception {
        assertThat(Winner.DRAW.opposite(), is(Winner.DRAW));
    }

}