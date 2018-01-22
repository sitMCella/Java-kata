package it.mcella.kata.berlinclock;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.lib.legacy.ClassImposteriser;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalTime;

import static junit.framework.TestCase.assertEquals;

public class BerlinClockTest {
    private Mockery context = new Mockery() {{
        setImposteriser(ClassImposteriser.INSTANCE);
    }};

    private final LowerMinutes lowerMinutes = context.mock(LowerMinutes.class);
    private final HigherMinutes higherMinutes = context.mock(HigherMinutes.class);
    private final LowerHours lowerHours = context.mock(LowerHours.class);
    private final HigherHours higherHours = context.mock(HigherHours.class);
    private final Seconds seconds = context.mock(Seconds.class);

    private BerlinClock berlinClock;

    @Before
    public void setUp() throws Exception {
        this.berlinClock = new BerlinClock(lowerMinutes, higherMinutes, lowerHours, higherHours, seconds);
    }

    @Test
    public void shouldCreateLowerMinutesRow() throws Exception {
        context.checking(new Expectations() {{
            ignoring(higherMinutes);
            ignoring(lowerHours);
            ignoring(higherHours);
            ignoring(seconds);

            oneOf(lowerMinutes).from("00:00:00");
        }});

        berlinClock.fromDigitalTime("00:00:00");
    }

    @Test
    public void shouldCreateHigherMinutesRow() throws Exception {
        context.checking(new Expectations() {{
            ignoring(lowerMinutes);
            ignoring(lowerHours);
            ignoring(higherHours);
            ignoring(seconds);

            oneOf(higherMinutes).from("00:00:00");
        }});

        berlinClock.fromDigitalTime("00:00:00");
    }

    @Test
    public void shouldCreateLowerHoursRow() throws Exception {
        context.checking(new Expectations() {{
            ignoring(lowerMinutes);
            ignoring(higherMinutes);
            ignoring(higherHours);
            ignoring(seconds);

            oneOf(lowerHours).from("00:00:00");
        }});

        berlinClock.fromDigitalTime("00:00:00");
    }

    @Test
    public void shouldCreateHigherHoursRow() throws Exception {
        context.checking(new Expectations() {{
            ignoring(lowerMinutes);
            ignoring(higherMinutes);
            ignoring(lowerHours);
            ignoring(seconds);

            oneOf(higherHours).from("00:00:00");
        }});

        berlinClock.fromDigitalTime("00:00:00");
    }

    @Test
    public void shouldCreateSecondsRow() throws Exception {
        context.checking(new Expectations() {{
            ignoring(lowerMinutes);
            ignoring(higherMinutes);
            ignoring(lowerHours);
            ignoring(higherHours);

            oneOf(seconds).from("00:00:00");
        }});

        berlinClock.fromDigitalTime("00:00:00");
    }

    @Test
    public void shouldReturnYOOOOOOOOOOOOOOOOOOOOOOOWhenTimeIs000000() throws Exception {
        context.checking(new Expectations() {{
            oneOf(lowerMinutes).from("00:00:00");
            will(returnValue("OOOO"));
            oneOf(higherMinutes).from("00:00:00");
            will(returnValue("OOOOOOOOOOO"));
            oneOf(lowerHours).from("00:00:00");
            will(returnValue("OOOO"));
            oneOf(higherHours).from("00:00:00");
            will(returnValue("OOOO"));
            oneOf(seconds).from("00:00:00");
            will(returnValue("Y"));
        }});

        String actual = berlinClock.fromDigitalTime("00:00:00");

        assertEquals("YOOOOOOOOOOOOOOOOOOOOOOO", actual);
    }

    @Test
    public void shouldReturnORRRRRRROYYRYYRYYRYYYYYYWhenTimeIs235959() throws Exception {
        context.checking(new Expectations() {{
            oneOf(lowerMinutes).from("23:59:59");
            will(returnValue("YYYY"));
            oneOf(higherMinutes).from("23:59:59");
            will(returnValue("YYRYYRYYRYY"));
            oneOf(lowerHours).from("23:59:59");
            will(returnValue("RRRO"));
            oneOf(higherHours).from("23:59:59");
            will(returnValue("RRRR"));
            oneOf(seconds).from("23:59:59");
            will(returnValue("O"));
        }});

        String actual = berlinClock.fromDigitalTime("23:59:59");

        assertEquals("ORRRRRRROYYRYYRYYRYYYYYY", actual);
    }

    @Test
    public void shouldReturnYRRROROOOYYRYYRYYRYOOOOOWhenTimeIs165006() throws Exception {
        context.checking(new Expectations() {{
            oneOf(lowerMinutes).from("16:50:06");
            will(returnValue("OOOO"));
            oneOf(higherMinutes).from("16:50:06");
            will(returnValue("YYRYYRYYRYO"));
            oneOf(lowerHours).from("16:50:06");
            will(returnValue("ROOO"));
            oneOf(higherHours).from("16:50:06");
            will(returnValue("RRRO"));
            oneOf(seconds).from("16:50:06");
            will(returnValue("Y"));
        }});

        String actual = berlinClock.fromDigitalTime("16:50:06");

        assertEquals("YRRROROOOYYRYYRYYRYOOOOO", actual);
    }

    @Test
    public void shouldReturnORROOROOOYYRYYRYOOOOYYOOWhenTimeIs113701() throws Exception {
        context.checking(new Expectations() {{
            oneOf(lowerMinutes).from("11:37:01");
            will(returnValue("YYOO"));
            oneOf(higherMinutes).from("11:37:01");
            will(returnValue("YYRYYRYOOOO"));
            oneOf(lowerHours).from("11:37:01");
            will(returnValue("ROOO"));
            oneOf(higherHours).from("11:37:01");
            will(returnValue("RROO"));
            oneOf(seconds).from("11:37:01");
            will(returnValue("O"));
        }});

        String actual = berlinClock.fromDigitalTime("11:37:01");

        assertEquals("ORROOROOOYYRYYRYOOOOYYOO", actual);
    }

    @Test
    public void shouldCreateLowerMinutesDigital() throws Exception {
        context.checking(new Expectations() {{
            ignoring(higherMinutes);
            ignoring(lowerHours);
            ignoring(higherHours);
            ignoring(seconds);

            oneOf(lowerMinutes).toDigital("OOOO");
        }});

        berlinClock.toDigitalTime("YOOOOOOOOOOOOOOOOOOOOOOO");
    }

    @Test
    public void shouldCreateHigherMinutesDigital() throws Exception {
        context.checking(new Expectations() {{
            ignoring(lowerMinutes);
            ignoring(lowerHours);
            ignoring(higherHours);
            ignoring(seconds);

            oneOf(higherMinutes).toDigital("OOOOOOOOOOO");
        }});

        berlinClock.toDigitalTime("YOOOOOOOOOOOOOOOOOOOOOOO");
    }

    @Test
    public void shouldCreateLowerHoursDigital() throws Exception {
        context.checking(new Expectations() {{
            ignoring(lowerMinutes);
            ignoring(higherMinutes);
            ignoring(higherHours);
            ignoring(seconds);

            oneOf(lowerHours).toDigital("OOOO");
        }});

        berlinClock.toDigitalTime("YOOOOOOOOOOOOOOOOOOOOOOO");
    }

    @Test
    public void shouldCreateHigherHoursDigital() throws Exception {
        context.checking(new Expectations() {{
            ignoring(lowerMinutes);
            ignoring(higherMinutes);
            ignoring(lowerHours);
            ignoring(seconds);

            oneOf(higherHours).toDigital("OOOO");
        }});

        berlinClock.toDigitalTime("YOOOOOOOOOOOOOOOOOOOOOOO");
    }

    @Test
    public void shouldCreateSecondsDigital() throws Exception {
        context.checking(new Expectations() {{
            ignoring(lowerMinutes);
            ignoring(higherMinutes);
            ignoring(lowerHours);
            ignoring(higherHours);

            oneOf(seconds).toDigital("Y");
        }});

        berlinClock.toDigitalTime("YOOOOOOOOOOOOOOOOOOOOOOO");
    }

    @Test
    public void shouldReturn000000WhenBerlinClockTimeIsYOOOOOOOOOOOOOOOOOOOOOOO() throws Exception {
        context.checking(new Expectations() {{
            oneOf(lowerMinutes).toDigital("OOOO");
            will(returnValue(0));
            oneOf(higherMinutes).toDigital("OOOOOOOOOOO");
            will(returnValue(0));
            oneOf(lowerHours).toDigital("OOOO");
            will(returnValue(0));
            oneOf(higherHours).toDigital("OOOO");
            will(returnValue(0));
            oneOf(seconds).toDigital("Y");
            will(returnValue(0));
        }});

        LocalTime actual = berlinClock.toDigitalTime("YOOOOOOOOOOOOOOOOOOOOOOO");

        LocalTime expected = LocalTime.of(0, 0, 0);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn235901WhenBerlinClockTimeIsORRRRRRROYYRYYRYYRYYYYYY() throws Exception {
        context.checking(new Expectations() {{
            oneOf(lowerMinutes).toDigital("YYYY");
            will(returnValue(4));
            oneOf(higherMinutes).toDigital("YYRYYRYYRYY");
            will(returnValue(55));
            oneOf(lowerHours).toDigital("RRRO");
            will(returnValue(3));
            oneOf(higherHours).toDigital("RRRR");
            will(returnValue(20));
            oneOf(seconds).toDigital("O");
            will(returnValue(1));
        }});

        LocalTime actual = berlinClock.toDigitalTime("ORRRRRRROYYRYYRYYRYYYYYY");

        LocalTime expected = LocalTime.of(23, 59, 01);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn165000WhenBerlinClockTimeIsYRRROROOOYYRYYRYYRYOOOOO() throws Exception {
        context.checking(new Expectations() {{
            oneOf(lowerMinutes).toDigital("OOOO");
            will(returnValue(0));
            oneOf(higherMinutes).toDigital("YYRYYRYYRYO");
            will(returnValue(50));
            oneOf(lowerHours).toDigital("ROOO");
            will(returnValue(1));
            oneOf(higherHours).toDigital("RRRO");
            will(returnValue(15));
            oneOf(seconds).toDigital("Y");
            will(returnValue(0));
        }});

        LocalTime actual = berlinClock.toDigitalTime("YRRROROOOYYRYYRYYRYOOOOO");

        LocalTime expected = LocalTime.of(16, 50, 00);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn113701WhenBerlinClockTimeIsORROOROOOYYRYYRYOOOOYYOO() throws Exception {
        context.checking(new Expectations() {{
            oneOf(lowerMinutes).toDigital("YYOO");
            will(returnValue(2));
            oneOf(higherMinutes).toDigital("YYRYYRYOOOO");
            will(returnValue(35));
            oneOf(lowerHours).toDigital("ROOO");
            will(returnValue(1));
            oneOf(higherHours).toDigital("RROO");
            will(returnValue(10));
            oneOf(seconds).toDigital("O");
            will(returnValue(1));
        }});

        LocalTime actual = berlinClock.toDigitalTime("ORROOROOOYYRYYRYOOOOYYOO");

        LocalTime expected = LocalTime.of(11, 37, 01);
        assertEquals(expected, actual);
    }

}