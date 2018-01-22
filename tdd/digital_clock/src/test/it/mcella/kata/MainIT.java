package it.mcella.kata;

import java.net.URL;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainIT {

    @Test
    public void shouldParseFile() throws Exception {
        URL url = MainIT.class.getResource("digits.dat");
        DigitsReader digitsReader = new DigitsReader();
        DigitsParser digitsParser = new DigitsParser();
        Main main = new Main(digitsReader, digitsParser);

        int actual = main.parse(url.toURI());

        assertEquals(123456789, actual);
    }

}