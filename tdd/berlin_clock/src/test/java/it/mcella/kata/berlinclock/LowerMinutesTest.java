package it.mcella.kata.berlinclock;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class LowerMinutesTest {

    private LowerMinutes lowerMinutes;

    @Before
    public void setUp() throws Exception {
        lowerMinutes = new LowerMinutes();
    }

    @Test
    public void shouldReturnOOOOWhenTimeIs000000() throws Exception {
        String actual = lowerMinutes.from("00:00:00");

        assertEquals("OOOO", actual);
    }

    @Test
    public void shouldReturnYYYYWhenTimeIs235959() throws Exception {
        String actual = lowerMinutes.from("23:59:59");

        assertEquals("YYYY", actual);
    }

    @Test
    public void shouldReturnYYOOWhenTimeIs123200() throws Exception {
        String actual = lowerMinutes.from("12:32:00");

        assertEquals("YYOO", actual);
    }

    @Test
    public void shouldReturnYYYYWhenTimeIs123400() throws Exception {
        String actual = lowerMinutes.from("12:34:00");

        assertEquals("YYYY", actual);
    }

    @Test
    public void shouldReturnOOOOWhenTimeIs123500() throws Exception {
        String actual = lowerMinutes.from("12:35:00");

        assertEquals("OOOO", actual);
    }

    @Test
    public void shouldReturn0WhenBerlinClockLampsRowIsOOOO() throws Exception {
        int actual = lowerMinutes.toDigital("OOOO");

        assertEquals(0, actual);
    }

    @Test
    public void shouldReturn4WhenBerlinClockLampsRowIsYYYY() throws Exception {
        int actual = lowerMinutes.toDigital("YYYY");

        assertEquals(4, actual);
    }

}