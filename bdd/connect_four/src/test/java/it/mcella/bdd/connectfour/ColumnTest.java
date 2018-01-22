package it.mcella.bdd.connectfour;

import it.mcella.bdd.connectfour.Column;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ColumnTest {

    @Test
    public void shouldGetColumnAFromNumber1() throws Exception {
        Column column = Column.fromNumber(1);
        assertEquals(Column.A, column);
    }

    @Test
    public void shouldGetColumnBFromNumber2() throws Exception {
        Column column = Column.fromNumber(2);
        assertEquals(Column.B, column);
    }

    @Test
    public void shouldGetColumnCFromNumber3() throws Exception {
        Column column = Column.fromNumber(3);
        assertEquals(Column.C, column);
    }

    @Test
    public void shouldGetColumnDFromNumber4() throws Exception {
        Column column = Column.fromNumber(4);
        assertEquals(Column.D, column);
    }

    @Test
    public void shouldGetColumnEFromNumber5() throws Exception {
        Column column = Column.fromNumber(5);
        assertEquals(Column.E, column);
    }

    @Test
    public void shouldGetColumnFFromNumber6() throws Exception {
        Column column = Column.fromNumber(6);
        assertEquals(Column.F, column);
    }

    @Test
    public void shouldGetColumnGFromNumber7() throws Exception {
        Column column = Column.fromNumber(7);
        assertEquals(Column.G, column);
    }

    @Test
    public void shouldReturnAllColumns() throws Exception {
        List<Column> actual = Column.getAll();

        List<Column> expected = new ArrayList<Column>() {{
            add(Column.A);
            add(Column.B);
            add(Column.C);
            add(Column.D);
            add(Column.E);
            add(Column.F);
            add(Column.G);
        }};

        assertEquals(expected, actual);
    }

}