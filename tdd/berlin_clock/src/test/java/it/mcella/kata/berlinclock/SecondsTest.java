package it.mcella.kata.berlinclock;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SecondsTest {

    private Seconds seconds;

    @Before
    public void setUp() throws Exception {
        this.seconds = new Seconds();
    }

    @Test
    public void shouldReturnYWhenTimeIs000000() throws Exception {
        String actual = seconds.from("00:00:00");

        assertEquals("Y", actual);
    }

    @Test
    public void shouldReturnOWhenTimeIs235959() throws Exception {
        String actual = seconds.from("23:59:59");

        assertEquals("O", actual);
    }

    @Test
    public void shouldReturn0WhenBerlinClockLampRowIsY() throws Exception {
        int actual = seconds.toDigital("Y");

        assertEquals(0, actual);
    }

    @Test
    public void shouldReturn1WhenBerlinClockLampRowIsO() throws Exception {
        int actual = seconds.toDigital("O");

        assertEquals(1, actual);
    }

}