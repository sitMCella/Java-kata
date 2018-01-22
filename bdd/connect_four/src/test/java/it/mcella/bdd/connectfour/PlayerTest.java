package it.mcella.bdd.connectfour;

import it.mcella.bdd.connectfour.Player;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class PlayerTest {

    @Test
    public void shouldGetPlayers() throws Exception {
        List<Player> actual = Player.getPlayers();

        List<Player> expected = new ArrayList<Player>() {{
            add(Player.YELLOW);
            add(Player.RED);
        }};
        assertThat(actual, is(expected));
    }

}