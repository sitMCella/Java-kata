package it.mcella.kata.bingo;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.lib.legacy.ClassImposteriser;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;

public class PlayerTest {

    private Mockery context = new Mockery() {{
        setImposteriser(ClassImposteriser.INSTANCE);
    }};

    private final CardGenerator cardGenerator = context.mock(CardGenerator.class);

    private Player player;

    @Before
    public void setUp() throws Exception {
        Column firstColumn = new Column(1, 2, 3, 4, 5);
        Column secondColumn = new Column(6, 7, 8, 9, 10);
        Column thirdColumn = new Column(11, 12, 0, 14, 15);
        Column fourthColumn = new Column(16, 17, 18, 19, 20);
        Column fifthColumn = new Column(21, 22, 23, 24, 25);
        Card card = new Card(firstColumn, secondColumn, thirdColumn, fourthColumn, fifthColumn);

        context.checking(new Expectations() {{
            allowing(cardGenerator).create();
            will(returnValue(card));
        }});

        this.player = new Player("Bob", cardGenerator);
    }

    @Test
    public void shouldCreateCard() throws Exception {
        assertThat(player.getCard(), is(notNullValue()));
    }

    @Test
    public void shouldInitCardNumbersCountTo24() throws Exception {
        assertThat(player.getCardNumbersCount(), is(24));
    }

    @Test
    public void shouldDecreaseCardNumbersCountIfCardContainsCalledNumber() throws Exception {
        player.checkBingo(3);

        assertThat(player.getCardNumbersCount(), is(23));
    }

    @Test
    public void shouldReturnFalseIfCardNumbersCountIsGreaterThanZero() throws Exception {
        boolean actual = player.checkBingo(3);

        assertThat(actual, is(false));
    }

    @Test
    public void shouldReturnTrueIfCardNumbersCountIsZero() throws Exception {
        boolean actual = false;
        for (int number = 1; number <= 25; number++) {
            actual = player.checkBingo(number);
        }

        assertThat(actual, is(true));
    }

}