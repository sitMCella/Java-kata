package it.mcella.kata.bingo;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CardGenerator {

    private final Random random;
    private final List<Integer> firstColumnBoxNumbers;
    private final List<Integer> secondColumnBoxNumbers;
    private final List<Integer> thirdColumnBoxNumbers;
    private final List<Integer> fourthColumnBoxNumbers;
    private final List<Integer> fifthColumnBoxNumbers;

    public CardGenerator() {
        this.random = new Random();
        this.firstColumnBoxNumbers = initFirstColumnBoxNumbers();
        this.secondColumnBoxNumbers = initSecondColumnBoxNumbers();
        this.thirdColumnBoxNumbers = initThirdColumnBoxNumbers();
        this.fourthColumnBoxNumbers = initFourthColumnBoxNumbers();
        this.fifthColumnBoxNumbers = initFifthColumnBoxNumbers();
    }

    public Card create() {
        Column firstColumn = createColumn(firstColumnBoxNumbers);
        Column secondColumn = createColumn(secondColumnBoxNumbers);
        Column thirdColumn = createColumn(thirdColumnBoxNumbers);
        Column fourthColumn = createColumn(fourthColumnBoxNumbers);
        Column fifthColumn = createColumn(fifthColumnBoxNumbers);
        return new Card(firstColumn, secondColumn, thirdColumn, fourthColumn, fifthColumn);
    }

    List<Integer> getFirstColumnBoxNumbers() {
        return firstColumnBoxNumbers;
    }

    List<Integer> getSecondColumnBoxNumbers() {
        return secondColumnBoxNumbers;
    }

    List<Integer> getThirdColumnBoxNumbers() {
        return thirdColumnBoxNumbers;
    }

    List<Integer> getFourthColumnBoxNumbers() {
        return fourthColumnBoxNumbers;
    }

    List<Integer> getFifthColumnBoxNumbers() {
        return fifthColumnBoxNumbers;
    }

    private List<Integer> initFirstColumnBoxNumbers() {
        return createBoxNumber(1, 15);
    }

    private List<Integer> initSecondColumnBoxNumbers() {
        return createBoxNumber(16, 30);
    }

    private List<Integer> initThirdColumnBoxNumbers() {
        return createBoxNumber(31, 45);
    }

    private List<Integer> initFourthColumnBoxNumbers() {
        return createBoxNumber(46, 60);
    }

    private List<Integer> initFifthColumnBoxNumbers() {
        return createBoxNumber(61, 75);
    }

    private List<Integer> createBoxNumber(int minNumber, int maxNumber) {
        return IntStream.rangeClosed(minNumber, maxNumber).boxed().collect(Collectors.toList());
    }

    private Column createColumn(List<Integer> boxNumbers) {
        Integer[] numbers = createColumnRows(boxNumbers);
        return new Column(numbers);
    }

    private Integer[] createColumnRows(List<Integer> columnBoxNumbers) {
        Integer[] numbers = new Integer[Column.ROW_NUMBER];
        for (int row = 0; row < Column.ROW_NUMBER; row++) {
            int index = getIndex(0, 14 - row);
            numbers[row] = removeNumber(columnBoxNumbers, index);
        }
        return numbers;
    }

    private int getIndex(int minNumber, int maxNumber) {
        return random.nextInt(maxNumber - minNumber) + minNumber;
    }

    private int removeNumber(List<Integer> columnBoxNumbers, int index) {
        return columnBoxNumbers.remove(index);
    }

}
