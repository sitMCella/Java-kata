package it.mcella.kata.bingo;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.hamcrest.Matchers.both;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class CallerTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    private Caller caller;

    @Before
    public void setUp() throws Exception {
        this.caller = new Caller();
    }

    @Test
    public void shouldInitTheListOfNumbers() throws Exception {
        List<Integer> actual = caller.getNumbers();

        List<Integer> expected = IntStream.rangeClosed(1, 75).boxed().collect(Collectors.toList());
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCallANumberBetween1And75() throws Exception {
        int number = caller.call();

        assertThat(number, is(both(greaterThan(0)).and(lessThan(76))));
    }

    @Test
    public void shouldRemoveTheCalledNumberFromTheListOfNumbers() throws Exception {
        int number = caller.call();
        List<Integer> actual = caller.getNumbers();

        assertThat(actual.size(), is(74));
        assertThat(actual.contains(number), is(false));
    }

    @Test
    public void shouldCallEveryNumberOneTime() throws Exception {
        List<Integer> calledNumbers = new ArrayList<>();

        for (int i = 1; i <= 75; i++) {
            int number = caller.call();
            List<Integer> actual = caller.getNumbers();

            assertThat(actual.size(), is(75 - i));
            assertThat(actual.contains(number), is(false));

            calledNumbers.add(number);
        }
    }

    @Test
    public void shouldThrowCallerExceptionIfCall76Times() throws Exception {
        expectedException.expect(CallerException.class);
        expectedException.expectMessage(Matchers.equalTo("Box is empty"));

        for (int i = 1; i <= 76; i++) {
            caller.call();
        }
    }

}