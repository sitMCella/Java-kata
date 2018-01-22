package it.mcella.kata.berlinclock;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.time.LocalTime;

import static junit.framework.TestCase.assertEquals;

public class TimeParseTest {

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    private TimeParse timeParse;

    @Before
    public void setUp() throws Exception {
        this.timeParse = new TimeParse();
    }

    @Test
    public void shouldParse000000() throws Exception {
        LocalTime actual = timeParse.from("00:00:00");

        assertEquals(LocalTime.MIDNIGHT, actual);
    }

    @Test
    public void shouldThrowBerlinClockExceptionIfCannotParseTime() throws Exception {
        exception.expect(BerlinClockException.class);
        exception.expectMessage(Matchers.equalTo("Cannot parse time 12:43:21abc"));

        timeParse.from("12:43:21abc");
    }

}