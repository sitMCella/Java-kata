package it.mcella.kata.bingo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Stream.concat;

public class Card {

    public static final int CARD_CELLS = 24;

    private final Column firstColumn;
    private final Column secondColumn;
    private final Column thirdColumn;
    private final Column fourthColumn;
    private final Column fifthColumn;

    public Card(Column firstColumn,
                Column secondColumn,
                Column thirdColumn,
                Column fourthColumn,
                Column fifthColumn) {
        this.firstColumn = firstColumn;
        this.secondColumn = secondColumn;
        this.thirdColumn = thirdColumn;
        this.thirdColumn.setThirdCell(0);
        this.fourthColumn = fourthColumn;
        this.fifthColumn = fifthColumn;
    }

    public boolean checkIfNumberIsPresent(int number) {
        Stream<Integer> cardCells = getAllCells();
        return checkIfNumberIsPresent(cardCells, number);
    }

    public boolean containsAll(List<Integer> numbers) {
        List<Integer> foundNumbers = new ArrayList<>();
        for(Integer number: numbers) {
            Stream<Integer> cardCells = getAllCells();
            if(checkIfNumberIsPresent(cardCells, number)) {
                foundNumbers.add(number);
            }
        }
        return foundNumbers.size() == CARD_CELLS;
    }

    public Column getFirstColumn() {
        return firstColumn;
    }

    public void print() {
        for(int i = 0; i < Column.ROW_NUMBER; i++) {
            System.out.print("[\t");
            System.out.print(getFirstColumn().getRows()[i] + "\t");
            System.out.print(getSecondColumn().getRows()[i] + "\t");
            System.out.print(getThirdColumn().getRows()[i] + "\t");
            System.out.print(getFourthColumn().getRows()[i] + "\t");
            System.out.println(getFifthColumn().getRows()[i] + "\t]");
        }
        System.out.println("");
    }

    public Column getSecondColumn() {
        return secondColumn;
    }

    public Column getThirdColumn() {
        return thirdColumn;
    }

    public Column getFourthColumn() {
        return fourthColumn;
    }

    public Column getFifthColumn() {
        return fifthColumn;
    }

    private Stream<Integer> getAllCells() {
        Stream<Integer> firstColumnRows = Arrays.stream(getFirstColumn().getRows());
        Stream<Integer> secondColumnRows = Arrays.stream(getSecondColumn().getRows());
        Stream<Integer> thirdColumnRows = Arrays.stream(getThirdColumn().getRows());
        Stream<Integer> fourthColumnRows = Arrays.stream(getFourthColumn().getRows());
        Stream<Integer> fifthColumnRows = Arrays.stream(getFifthColumn().getRows());
        return concat(firstColumnRows, concat(secondColumnRows, concat(thirdColumnRows, concat(fourthColumnRows, fifthColumnRows))));
    }

    private boolean checkIfNumberIsPresent(Stream<Integer> cardCells, int number) {
        return cardCells.anyMatch(cellNumber -> cellNumber == number);
    }

}
