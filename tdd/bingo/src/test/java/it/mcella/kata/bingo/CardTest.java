package it.mcella.kata.bingo;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CardTest {

    private Card card;

    @Before
    public void setUp() throws Exception {
        Column firstColumn = new Column(1, 2, 3, 4, 5);
        Column secondColumn = new Column(6, 7, 8, 9, 10);
        Column thirdColumn = new Column(11, 12, 13, 14, 15);
        Column fourthColumn = new Column(16, 17, 18, 19, 20);
        Column fifthColumn = new Column(21, 22, 23, 24, 25);
        this.card = new Card(firstColumn, secondColumn, thirdColumn, fourthColumn, fifthColumn);
    }

    @Test
    public void shouldSetCardColumns() throws Exception {
        Column firstColumn = new Column(1, 2, 3, 4, 5);
        Column secondColumn = new Column(6, 7, 8, 9, 10);
        Column thirdColumn = new Column(11, 12, 0, 14, 15);
        Column fourthColumn = new Column(16, 17, 18, 19, 20);
        Column fifthColumn = new Column(21, 22, 23, 24, 25);

        assertThat(card.getFirstColumn(), is(firstColumn));
        assertThat(card.getSecondColumn(), is(secondColumn));
        assertThat(card.getThirdColumn(), is(thirdColumn));
        assertThat(card.getFourthColumn(), is(fourthColumn));
        assertThat(card.getFifthColumn(), is(fifthColumn));
    }

    @Test
    public void shouldReturnTrueIfNumberIsPresentIntoTheFirstColumn() throws Exception {
        assertThat(card.checkIfNumberIsPresent(2), is(true));
    }

    @Test
    public void shouldReturnTrueIfNumberIsPresentIntoTheSecondColumn() throws Exception {
        assertThat(card.checkIfNumberIsPresent(9), is(true));
    }

    @Test
    public void shouldReturnTrueIfNumberIsPresentIntoTheThirdColumn() throws Exception {
        assertThat(card.checkIfNumberIsPresent(11), is(true));
    }

    @Test
    public void shouldReturnTrueIfNumberIsPresentIntoTheFourthColumn() throws Exception {
        assertThat(card.checkIfNumberIsPresent(17), is(true));
    }

    @Test
    public void shouldReturnTrueIfNumberIsPresentIntoTheFifthColumn() throws Exception {
        assertThat(card.checkIfNumberIsPresent(25), is(true));
    }

    @Test
    public void shouldReturnFalseIfNumberIsNotPresent() throws Exception {
        assertThat(card.checkIfNumberIsPresent(75), is(false));
    }

    @Test
    public void shouldReturnTrueIfCardContainsAllNumbers() throws Exception {
        List<Integer> numbers = new ArrayList<>();
        for(int number=1; number<=25; number++) {
            numbers.add(number);
        }

        assertThat(card.containsAll(numbers), is(true));
    }

    @Test
    public void shouldReturnFalseIfCardDoesNotContainAllNumbers() throws Exception {
        List<Integer> numbers = new ArrayList<>();
        for(int number=1; number<=24; number++) {
            numbers.add(number);
        }
        numbers.add(75);

        assertThat(card.containsAll(numbers), is(false));
    }

}