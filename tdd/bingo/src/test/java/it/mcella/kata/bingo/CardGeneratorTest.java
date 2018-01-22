package it.mcella.kata.bingo;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.hamcrest.Matchers.both;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class CardGeneratorTest {

    private CardGenerator cardGenerator;

    @Before
    public void setUp() throws Exception {
        this.cardGenerator = new CardGenerator();
    }

    @Test
    public void shouldInitFirstColumnBoxNumbers() throws Exception {
        List<Integer> actual = cardGenerator.getFirstColumnBoxNumbers();

        List<Integer> expected = IntStream.rangeClosed(1, 15).boxed().collect(Collectors.toList());
        assertEquals(actual, expected);
    }

    @Test
    public void shouldGenerateCardWithNumbersBetween1And15IntoTheFirstColumn() throws Exception {
        Card card = cardGenerator.create();
        Column actualFirstColumn = card.getFirstColumn();

        for (int row = 0; row < actualFirstColumn.getRows().length; row++) {
            assertThat(actualFirstColumn.getRows()[row], is(both(greaterThan(0)).and(lessThan(16))));
        }
    }

    @Test
    public void shouldGenerateCardWithNotRepeatedNumbersIntoTheFirstColumn() throws Exception {
        Card card = cardGenerator.create();
        Column actualFirstColumn = card.getFirstColumn();

        int actualRepeatedNumbers = getRepeatedNumbersIn(actualFirstColumn);
        assertThat(actualRepeatedNumbers, is(0));
    }

    @Test
    public void shouldInitSecondColumnBoxNumbers() throws Exception {
        List<Integer> actual = cardGenerator.getSecondColumnBoxNumbers();

        List<Integer> expected = IntStream.rangeClosed(16, 30).boxed().collect(Collectors.toList());
        assertEquals(actual, expected);
    }

    @Test
    public void shouldGenerateCardWithNumbersBetween16And30IntoTheSecondColumn() throws Exception {
        Card card = cardGenerator.create();
        Column actualSecondColumn = card.getSecondColumn();

        for (int row = 0; row < actualSecondColumn.getRows().length; row++) {
            assertThat(actualSecondColumn.getRows()[row], is(both(greaterThan(15)).and(lessThan(31))));
        }
    }

    @Test
    public void shouldGenerateCardWithNotRepeatedNumbersIntoTheSecondColumn() throws Exception {
        Card card = cardGenerator.create();
        Column actualSecondColumn = card.getSecondColumn();

        int actualRepeatedNumbers = getRepeatedNumbersIn(actualSecondColumn);
        assertThat(actualRepeatedNumbers, is(0));
    }

    @Test
    public void shouldInitThirdColumnBoxNumbers() throws Exception {
        List<Integer> actual = cardGenerator.getThirdColumnBoxNumbers();

        List<Integer> expected = IntStream.rangeClosed(31, 45).boxed().collect(Collectors.toList());
        assertEquals(actual, expected);
    }

    @Test
    public void shouldGenerateCardWithNumbersBetween31And45IntoTheThirdColumnExceptForThirdRow() throws Exception {
        Card card = cardGenerator.create();
        Column actualThirdColumn = card.getThirdColumn();

        for (int row = 0; row < actualThirdColumn.getRows().length; row++) {
            if (row != 2) {
                assertThat(actualThirdColumn.getRows()[row], is(both(greaterThan(30)).and(lessThan(46))));
            }
        }
    }

    @Test
    public void shouldGenerateCardWithThirdColumnThirdRowNumberEqualsToZero() throws Exception {
        Card card = cardGenerator.create();
        Column actualThirdColumn = card.getThirdColumn();

        assertThat(actualThirdColumn.getThirdCell(), is(0));
    }

    @Test
    public void shouldGenerateCardWithNotRepeatedNumbersIntoTheThirdColumn() throws Exception {
        Card card = cardGenerator.create();
        Column actualThirdColumn = card.getThirdColumn();

        int actualRepeatedNumbers = getRepeatedNumbersIn(actualThirdColumn);
        assertThat(actualRepeatedNumbers, is(0));
    }

    @Test
    public void shouldInitFourthColumnBoxNumbers() throws Exception {
        List<Integer> actual = cardGenerator.getFourthColumnBoxNumbers();

        List<Integer> expected = IntStream.rangeClosed(46, 60).boxed().collect(Collectors.toList());
        assertEquals(actual, expected);
    }

    @Test
    public void shouldGenerateCardWithNumbersBetween46And60IntoTheFourthColumn() throws Exception {
        Card card = cardGenerator.create();
        Column actualFourthColumn = card.getFourthColumn();

        for (int row = 0; row < actualFourthColumn.getRows().length; row++) {
            assertThat(actualFourthColumn.getRows()[row], is(both(greaterThan(45)).and(lessThan(61))));
        }
    }

    @Test
    public void shouldGenerateCardWithNotRepeatedNumbersIntoTheFourthColumn() throws Exception {
        Card card = cardGenerator.create();
        Column actualFourthColumn = card.getFourthColumn();

        int actualRepeatedNumbers = getRepeatedNumbersIn(actualFourthColumn);
        assertThat(actualRepeatedNumbers, is(0));
    }

    @Test
    public void shouldInitFifthColumnBoxNumbers() throws Exception {
        List<Integer> actual = cardGenerator.getFifthColumnBoxNumbers();

        List<Integer> expected = IntStream.rangeClosed(61, 75).boxed().collect(Collectors.toList());
        assertEquals(actual, expected);
    }

    @Test
    public void shouldGenerateCardWithNumbersBetween61And75IntoTheFifthColumn() throws Exception {
        Card card = cardGenerator.create();
        Column actualFifthColumn = card.getFifthColumn();

        for (int row = 0; row < actualFifthColumn.getRows().length; row++) {
            assertThat(actualFifthColumn.getRows()[row], is(both(greaterThan(60)).and(lessThan(76))));
        }
    }

    @Test
    public void shouldGenerateCardWithNotRepeatedNumbersIntoTheFifthColumn() throws Exception {
        Card card = cardGenerator.create();
        Column actualFifthColumn = card.getFifthColumn();

        int actualRepeatedNumbers = getRepeatedNumbersIn(actualFifthColumn);
        assertThat(actualRepeatedNumbers, is(0));
    }

    private int getRepeatedNumbersIn(Column column) {
        List<Integer> rows = Arrays.asList(column.getRows());

        int repeatedNumbers = rows.stream()
                .filter(row -> Collections.frequency(rows, row) > 1)
                .collect(Collectors.toList()).size();
        return repeatedNumbers;
    }

}