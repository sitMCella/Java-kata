package it.mcella.kata;

import java.net.URL;
import java.util.List;
import java.util.ArrayList;
import org.junit.Test;
import org.hamcrest.Matchers;
import org.mockito.ArgumentCaptor;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class MainTest {

    private final DigitsReader digitsReader = mock(DigitsReader.class);
    private final DigitsParser digitsParser = mock(DigitsParser.class);

    @Test
    public void shouldCallDigitsReaderOneTime() throws Exception {
        URL url = MainTest.class.getResource("digits.dat");
        Main main = new Main(digitsReader, digitsParser);

        main.parse(url.toURI());

        verify(digitsReader, times(1)).readDigitsFrom(anyList());
    }

    @Test
    public void shouldCallDigitsReaderWithFirstRow() throws Exception {
        URL url = MainTest.class.getResource("digits.dat");
        Main main = new Main(digitsReader, digitsParser);

        main.parse(url.toURI());

        ArgumentCaptor<List<String>> argument = ArgumentCaptor.forClass(List.class);
        verify(digitsReader, times(1)).readDigitsFrom(argument.capture());
        List<String> expected = new ArrayList<String>() {{
            add(" _           _     _           _     _     _     _     _ ");
            add("| |     |    _|    _|   |_|   |_    |_      |   |_|   |_|");
            add("|_|     |   |_     _|     |    _|   |_|     |   |_|     |");
        }};
        assertEquals(expected, argument.getValue());
    }

    @Test
    public void shouldCallDigitsParserOneTime() throws Exception {
        URL url = MainTest.class.getResource("digits.dat");
        Main main = new Main(digitsReader, digitsParser);

        main.parse(url.toURI());

        verify(digitsParser, times(1)).parse(anyList());
    }

    @Test
    public void shouldCallDigitstParserWithFirstDigitsRow() throws Exception {
        URL url = MainTest.class.getResource("digits.dat");
        Main main = new Main(digitsReader, digitsParser);
        
        List<String> digits = new ArrayList<String>() {{
            add(" _ " +
                "| |" +
                "|_|");
        }};
        when(digitsReader.readDigitsFrom(anyList())).thenReturn(digits);

        main.parse(url.toURI());

        ArgumentCaptor<List<String>> argument = ArgumentCaptor.forClass(List.class);
        verify(digitsParser, times(1)).parse(argument.capture());
        List<String> expected = new ArrayList<String>() {{
            add(" _ " +
                "| |" +
                "|_|");
        }};
        assertEquals(expected, argument.getValue());
    }

}