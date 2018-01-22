package it.mcella.kata.berlinclock;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class HigherHoursTest {

    private HigherHours higherHours;

    @Before
    public void setUp() throws Exception {
        this.higherHours = new HigherHours();
    }

    @Test
    public void shouldReturnOOOOWhenTimeIs000000() throws Exception {
        String actual = higherHours.from("00:00:00");

        assertEquals("OOOO", actual);
    }

    @Test
    public void shouldReturnRRRRWhenTimeIs235959() throws Exception {
        String actual = higherHours.from("23:59:59");

        assertEquals("RRRR", actual);
    }

    @Test
    public void shouldReturnOOOOWhenTimeIs020400() throws Exception {
        String actual = higherHours.from("02:04:00");

        assertEquals("OOOO", actual);
    }

    @Test
    public void shouldReturnROOOWhenTimeIs082300() throws Exception {
        String actual = higherHours.from("08:23:00");

        assertEquals("ROOO", actual);
    }

    @Test
    public void shouldReturnRRROWhenTimeIs163500() throws Exception {
        String actual = higherHours.from("16:35:00");

        assertEquals("RRRO", actual);
    }

    @Test
    public void shouldReturn0WhenBerlinClockLampsRowIsOOOO() throws Exception {
        int actual = higherHours.toDigital("OOOO");

        assertEquals(0, actual);
    }

    @Test
    public void shouldReturn5WhenBerlinClockLampsRowIsROOO() throws Exception {
        int actual = higherHours.toDigital("ROOO");

        assertEquals(5, actual);
    }

    @Test
    public void shouldReturn20WhenBerlinClockLampsRowIsRRRR() throws Exception {
        int actual = higherHours.toDigital("RRRR");

        assertEquals(20, actual);
    }

}