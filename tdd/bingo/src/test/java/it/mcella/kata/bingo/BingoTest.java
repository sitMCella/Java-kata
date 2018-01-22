package it.mcella.kata.bingo;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.lib.legacy.ClassImposteriser;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.both;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class BingoTest {

    private Mockery context = new Mockery() {{
        setImposteriser(ClassImposteriser.INSTANCE);
    }};

    private final Player player1 = context.mock(Player.class, "firstPlayer");
    private final Player player2 = context.mock(Player.class, "secondPlayer");
    private final Caller caller = context.mock(Caller.class);

    private Bingo bingo;
    private List<Player> players;

    @Before
    public void setUp() throws Exception {
        this.bingo = new Bingo();

        this.players = new ArrayList<Player>() {{
            add(player1);
            add(player2);
        }};
    }

    @Test
    public void shouldCreatePlayersBetween2And10() throws Exception {
        assertThat(bingo.getPlayersCount(), is(both(greaterThan(0)).and(lessThan(11))));
    }

    @Test
     public void shouldCallerCreateANumber() throws Exception {
        this.bingo = new Bingo(players, caller);

        context.checking(new Expectations() {{
            oneOf(caller).call();
            ignoring(player1);
            ignoring(player2);
        }});

        bingo.start(true);

        assertThat(bingo.getCalledNumbers().size(), is(1));
    }

    @Test
    public void shouldCheckIfOneOrMorePlayersCalledBingo() throws Exception {
        this.bingo = new Bingo(players, caller);

        context.checking(new Expectations() {{
            oneOf(caller).call();
            will(returnValue(4));
            oneOf(player1).checkBingo(4);
            will(returnValue(false));
            oneOf(player2).checkBingo(4);
            will(returnValue(false));
        }});

        bingo.start(true);
    }

    @Test
     public void shouldReturnTrueIfBingoCard() throws Exception {
        List<Integer> calledNumbers = new ArrayList<>();
        for(int number=1; number<=25; number++) {
            calledNumbers.add(number);
        }
        bingo.setCalledNumbers(calledNumbers);
        Card card = createCard();

        context.checking(new Expectations() {{
            allowing(player1).getName();
            oneOf(player1).getCard();
            will(returnValue(card));
        }});

        bingo.callBingo(player1);

        assertThat(bingo.isBingoCalled(), is(true));
    }

    @Test
    public void shouldReturnFalseIfNotBingoCard() throws Exception {
        List<Integer> calledNumbers = new ArrayList<>();
        for(int number=1; number<=24; number++) {
            calledNumbers.add(number);
        }
        calledNumbers.add(75);
        bingo.setCalledNumbers(calledNumbers);
        Card card = createCard();

        context.checking(new Expectations() {{
            allowing(player1).getName();
            oneOf(player1).getCard();
            will(returnValue(card));
        }});

        bingo.callBingo(player1);

        assertThat(bingo.isBingoCalled(), is(false));
    }

    private Card createCard() {
        Column firstColumn = new Column(1, 2, 3, 4, 5);
        Column secondColumn = new Column(6, 7, 8, 9, 10);
        Column thirdColumn = new Column(11, 12, 0, 14, 15);
        Column fourthColumn = new Column(16, 17, 18, 19, 20);
        Column fifthColumn = new Column(21, 22, 23, 24, 25);
        return new Card(firstColumn, secondColumn, thirdColumn, fourthColumn, fifthColumn);
    }

}