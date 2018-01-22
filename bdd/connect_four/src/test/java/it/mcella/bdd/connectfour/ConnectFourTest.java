package it.mcella.bdd.connectfour;

import it.mcella.bdd.connectfour.Column;
import it.mcella.bdd.connectfour.ConnectFour;
import it.mcella.bdd.connectfour.Grid;
import it.mcella.bdd.connectfour.GridOperations;
import it.mcella.bdd.connectfour.Player;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.lib.legacy.ClassImposteriser;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;
import java.util.Random;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

public class ConnectFourTest {

    private Mockery context = new Mockery() {{
        setImposteriser(ClassImposteriser.INSTANCE);
    }};

    private final GridOperations gridOperations = context.mock(GridOperations.class);
    private final Random random = context.mock(Random.class);

    private ConnectFour connectFour;

    @Before
    public void setUp() throws Exception {
        this.connectFour = new ConnectFour(gridOperations, random);
    }

    @Test
    public void shouldInitAvailableColumnsWithAllColumns() throws Exception {
        assertThat(connectFour.getAvailableColumns(), is(Column.getAll()));
    }

    @Test
    public void shouldInitMovesCountToZero() throws Exception {
        assertThat(connectFour.getMovesCount(), is(0));
    }

    @Test
    public void shouldInitPlayerAsPlayerYellow() throws Exception {
        assertThat(connectFour.getPlayer(), is(Player.YELLOW));
    }

    @Test
    public void shouldInitWinnerAsNull() throws Exception {
        assertThat(connectFour.getWinner(), is(Player.UNDEFINED));
    }

    @Test
    public void shouldPlayerYellowInsertATokenIntoTheGrid() throws Exception {
        context.checking(new Expectations() {{
            allowing(random).nextInt(with(any(Integer.class)));
            allowing(gridOperations).insertInto(with(any(Column.class)), with(equal(Player.YELLOW)));
            will(returnValue(1));

            ignoring(gridOperations).getGrid();
            ignoring(gridOperations).checkWinner();
        }});

        connectFour.move(Player.YELLOW);
    }

    @Test
    public void shouldPlayerRedInsertATokenIntoTheGrid() throws Exception {
        context.checking(new Expectations() {{
            allowing(random).nextInt(with(any(Integer.class)));
            allowing(gridOperations).insertInto(with(any(Column.class)), with(equal(Player.RED)));
            will(returnValue(1));

            ignoring(gridOperations).getGrid();
            ignoring(gridOperations).checkWinner();
        }});

        connectFour.move(Player.RED);
    }

    @Test
    public void shouldCheckWinnerPlayer() throws Exception {
        context.checking(new Expectations() {{
            allowing(random).nextInt(with(any(Integer.class)));
            allowing(gridOperations).insertInto(with(any(Column.class)), with(any(Player.class)));
            will(returnValue(1));

            allowing(gridOperations).checkWinner();
            will(returnValue(Player.UNDEFINED));

            ignoring(gridOperations).getGrid();
        }});

        connectFour.move(Player.YELLOW);
    }

    @Test
    public void shouldRemoveColumnFromAvailableColumnsIfRowIsUndefined() throws Exception {
        context.checking(new Expectations() {{
            oneOf(random).nextInt(Column.getMaxNumber() - Column.getMinNumber() + 1);
            will(returnValue(0));
            oneOf(gridOperations).insertInto(Column.A, Player.YELLOW);
            will(returnValue(Grid.UNDEFINED_ROW));
            oneOf(random).nextInt(Column.getMaxNumber() - Column.getMinNumber());
            will(returnValue(1));
            oneOf(gridOperations).insertInto(Column.C, Player.YELLOW);
            will(returnValue(1));

            ignoring(gridOperations).checkWinner();
            ignoring(gridOperations).getGrid();
        }});

        connectFour.move(Player.YELLOW);

        Collection<Column> expected = Column.getAll();
        expected.remove(Column.A);
        assertThat(connectFour.getAvailableColumns(), is(expected));
    }

}