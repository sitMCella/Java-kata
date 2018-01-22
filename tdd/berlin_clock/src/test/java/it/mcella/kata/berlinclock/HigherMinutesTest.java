package it.mcella.kata.berlinclock;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class HigherMinutesTest {

    private HigherMinutes higherMinutes;

    @Before
    public void setUp() throws Exception {
        this.higherMinutes = new HigherMinutes();
    }

    @Test
    public void shouldReturnOOOOOOOOOOOWhenTimeIs000000() throws Exception {
        String actual = higherMinutes.from("00:00:00");

        assertEquals("OOOOOOOOOOO", actual);
    }

    @Test
    public void shouldReturnYYRYYRYYRYYWhenTimeIs235959() throws Exception {
        String actual = higherMinutes.from("23:59:59");

        assertEquals("YYRYYRYYRYY", actual);
    }

    @Test
    public void shouldReturnOOOOOOOOOOOWhenTimeIs120400() throws Exception {
        String actual = higherMinutes.from("12:04:00");

        assertEquals("OOOOOOOOOOO", actual);
    }

    @Test
    public void shouldReturnYYRYOOOOOOOWhenTimeIs122300() throws Exception {
        String actual = higherMinutes.from("12:23:00");

        assertEquals("YYRYOOOOOOO", actual);
    }

    @Test
    public void shouldReturnYYRYYRYOOOOWhenTimeIs123500() throws Exception {
        String actual = higherMinutes.from("12:35:00");

        assertEquals("YYRYYRYOOOO", actual);
    }

    @Test
    public void shouldReturn0WhenBerlinClockLampsRowIsOOOOOOOOOOO() throws Exception {
        int actual = higherMinutes.toDigital("OOOOOOOOOOO");

        assertEquals(0, actual);
    }

    @Test
    public void shouldReturn55WhenBerlinClockLampsRowIsYYRYYRYYRYY() throws Exception {
        int actual = higherMinutes.toDigital("YYRYYRYYRYY");

        assertEquals(55, actual);
    }

    @Test
    public void shouldReturn50WhenBerlinClockLampsRowIsYYRYYRYYRYO() throws Exception {
        int actual = higherMinutes.toDigital("YYRYYRYYRYO");

        assertEquals(50, actual);
    }

    @Test
    public void shouldReturn35WhenBerlinClockLampsRowIsYYRYYRYOOOO() throws Exception {
        int actual = higherMinutes.toDigital("YYRYYRYOOOO");

        assertEquals(35, actual);
    }

}