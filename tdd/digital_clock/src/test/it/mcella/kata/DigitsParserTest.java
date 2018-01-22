package it.mcella.kata;

import java.util.List;
import java.util.ArrayList;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class DigitsParserTest {

    @Test
    public void shouldParseDigits0123456789() throws Exception {
        DigitsParser digitsParser = new DigitsParser();
        List<String> digits = new ArrayList<String>() {{
            add(DigitsParser.ZERO);
            add(DigitsParser.ONE);
            add(DigitsParser.TWO);
            add(DigitsParser.THREE);
            add(DigitsParser.FOUR);
            add(DigitsParser.FIVE);
            add(DigitsParser.SIX);
            add(DigitsParser.SEVEN);
            add(DigitsParser.EIGHT);
            add(DigitsParser.NINE);
        }};

        int actual = digitsParser.parse(digits);

        assertEquals(123456789, actual);
    }

    @Test
    public void shouldParseDigits0005200168() throws Exception {
        DigitsParser digitsParser = new DigitsParser();
        List<String> digits = new ArrayList<String>() {{
            add(DigitsParser.ZERO);
            add(DigitsParser.ZERO);
            add(DigitsParser.ZERO);
            add(DigitsParser.FIVE);
            add(DigitsParser.TWO);
            add(DigitsParser.ZERO);
            add(DigitsParser.ZERO);
            add(DigitsParser.ONE);
            add(DigitsParser.SIX);
            add(DigitsParser.EIGHT);
        }};

        int actual = digitsParser.parse(digits);

        assertEquals(5200168, actual);
    }

    @Test
    public void shouldParseZeroDigit() throws Exception {
        DigitsParser digitsParser = new DigitsParser();

        String digit =  " _ " +
                        "| |" +
                        "|_|";
        String actual = digitsParser.parse(digit);

        assertEquals("0", actual);
    }

    @Test
    public void shouldParseOneDigit() throws Exception {
        DigitsParser digitsParser = new DigitsParser();

        String digit =  "   " +
                        "  |" +
                        "  |";
        String actual = digitsParser.parse(digit);

        assertEquals("1", actual);
    }

    @Test
    public void shouldParseTwoDigit() throws Exception {
        DigitsParser digitsParser = new DigitsParser();

        String digit =  " _ " +
                        " _|" +
                        "|_ ";
        String actual = digitsParser.parse(digit);

        assertEquals("2", actual);
    }

    @Test
    public void shouldParseThreeDigit() throws Exception {
        DigitsParser digitsParser = new DigitsParser();

        String digit =  " _ " +
                        " _|" +
                        " _|";
        String actual = digitsParser.parse(digit);

        assertEquals("3", actual);
    }

    @Test
    public void shouldParseFourDigit() throws Exception {
        DigitsParser digitsParser = new DigitsParser();

        String digit =  "   " +
                        "|_|" +
                        "  |";
        String actual = digitsParser.parse(digit);

        assertEquals("4", actual);
    }

    @Test
    public void shouldParseFiveDigit() throws Exception {
        DigitsParser digitsParser = new DigitsParser();

        String digit =  " _ " +
                        "|_ " +
                        " _|";
        String actual = digitsParser.parse(digit);

        assertEquals("5", actual);
    }

    @Test
    public void shouldParseSixDigit() throws Exception {
        DigitsParser digitsParser = new DigitsParser();

        String digit =  " _ " +
                        "|_ " +
                        "|_|";
        String actual = digitsParser.parse(digit);

        assertEquals("6", actual);
    }

    @Test
    public void shouldParseSevenDigit() throws Exception {
        DigitsParser digitsParser = new DigitsParser();

        String digit =  " _ " +
                        "  |" +
                        "  |";
        String actual = digitsParser.parse(digit);

        assertEquals("7", actual);
    }

    @Test
    public void shouldParseEightDigit() throws Exception {
        DigitsParser digitsParser = new DigitsParser();

        String digit =  " _ " +
                        "|_|" +
                        "|_|";
        String actual = digitsParser.parse(digit);

        assertEquals("8", actual);
    }

    @Test
    public void shouldParseNineDigit() throws Exception {
        DigitsParser digitsParser = new DigitsParser();

        String digit =  " _ " +
                        "|_|" +
                        "  |";
        String actual = digitsParser.parse(digit);

        assertEquals("9", actual);
    }

}