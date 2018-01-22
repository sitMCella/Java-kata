package it.mcella.kata;

import java.util.List;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class DigitsReaderTest {

    private List<String> rows;

    @Before
    public void init() {
        this.rows = new ArrayList<String>() {{
            add(" _           _     _           _     _     _     _     _ ");
            add("| |     |    _|    _|   |_|   |_    |_      |   |_|   |_|");
            add("|_|     |   |_     _|     |    _|   |_|     |   |_|     |");
        }};
    }

    @Test
    public void shouldReadFirstDigitFromBlock() throws Exception {
        DigitsReader digitsReader = new DigitsReader();

        List<String> actual = digitsReader.readDigitsFrom(rows);

        String expected =   " _ " +
                            "| |" +
                            "|_|";
        assertEquals(expected, actual.get(0));
    }

    @Test
    public void shouldReadSecondDigitFromBlock() throws Exception {
        DigitsReader digitsReader = new DigitsReader();

        List<String> actual = digitsReader.readDigitsFrom(rows);

        String expected =   "   " +
                            "  |" +
                            "  |";
        assertEquals(expected, actual.get(1));
    }

    @Test
    public void shouldReadThirdDigitFromBlock() throws Exception {
        DigitsReader digitsReader = new DigitsReader();

        List<String> actual = digitsReader.readDigitsFrom(rows);

        String expected =   " _ " +
                            " _|" +
                            "|_ ";
        assertEquals(expected, actual.get(2));
    }

    @Test
    public void shouldReadFourthDigitFromBlock() throws Exception {
        DigitsReader digitsReader = new DigitsReader();

        List<String> actual = digitsReader.readDigitsFrom(rows);

        String expected =   " _ " +
                            " _|" +
                            " _|";
        assertEquals(expected, actual.get(3));
    }

    @Test
    public void shouldReadFifthDigitFromBlock() throws Exception {
        DigitsReader digitsReader = new DigitsReader();

        List<String> actual = digitsReader.readDigitsFrom(rows);

        String expected =   "   " +
                            "|_|" +
                            "  |";
        assertEquals(expected, actual.get(4));
    }

    @Test
    public void shouldReadSixthDigitFromBlock() throws Exception {
        DigitsReader digitsReader = new DigitsReader();

        List<String> actual = digitsReader.readDigitsFrom(rows);

        String expected =   " _ " +
                            "|_ " +
                            " _|";
        assertEquals(expected, actual.get(5));
    }

    @Test
    public void shouldReadSeventhDigitFromBlock() throws Exception {
        DigitsReader digitsReader = new DigitsReader();

        List<String> actual = digitsReader.readDigitsFrom(rows);

        String expected =   " _ " +
                            "|_ " +
                            "|_|";
        assertEquals(expected, actual.get(6));
    }

    @Test
    public void shouldReadEightDigitFromBlock() throws Exception {
        DigitsReader digitsReader = new DigitsReader();

        List<String> actual = digitsReader.readDigitsFrom(rows);

        String expected =   " _ " +
                            "  |" +
                            "  |";
        assertEquals(expected, actual.get(7));
    }

    @Test
    public void shouldReadNinthDigitFromBlock() throws Exception {
        DigitsReader digitsReader = new DigitsReader();

        List<String> actual = digitsReader.readDigitsFrom(rows);

        String expected =   " _ " +
                            "|_|" +
                            "|_|";
        assertEquals(expected, actual.get(8));
    }

    @Test
    public void shouldReadTenthDigitFromBlock() throws Exception {
        DigitsReader digitsReader = new DigitsReader();

        List<String> actual = digitsReader.readDigitsFrom(rows);

        String expected =   " _ " +
                            "|_|" +
                            "  |";
        assertEquals(expected, actual.get(9));
    }

}