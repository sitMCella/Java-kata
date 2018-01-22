package it.mcella.kata.berlinclock;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class LowerHoursTest {

    private LowerHours lowerHours;

    @Before
    public void setUp() throws Exception {
        this.lowerHours = new LowerHours();
    }

    @Test
    public void shouldReturnOOOOWhenTimeIs000000() throws Exception {
        String actual = lowerHours.from("00:00:00");

        assertEquals("OOOO", actual);
    }

    @Test
    public void shouldReturnRRROWhenTimeIs235959() throws Exception {
        String actual = lowerHours.from("23:59:59");

        assertEquals("RRRO", actual);
    }

    @Test
    public void shouldReturnRROOWhenTimeIs020400() throws Exception {
        String actual = lowerHours.from("02:04:00");

        assertEquals("RROO", actual);
    }

    @Test
    public void shouldReturnRRROWhenTimeIs082300() throws Exception {
        String actual = lowerHours.from("08:23:00");

        assertEquals("RRRO", actual);
    }

    @Test
    public void shouldReturnRRRRWhenTimeIs143500() throws Exception {
        String actual = lowerHours.from("14:35:00");

        assertEquals("RRRR", actual);
    }

    @Test
    public void shouldReturn0WhenBerlinClockLampsRowIsOOOO() throws Exception {
        int actual = lowerHours.toDigital("OOOO");

        assertEquals(0, actual);
    }

    @Test
    public void shouldReturn4WhenBerlinClockLampsRowIsRRRR() throws Exception {
        int actual = lowerHours.toDigital("RRRR");

        assertEquals(4, actual);
    }

}