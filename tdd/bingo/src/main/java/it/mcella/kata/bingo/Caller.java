package it.mcella.kata.bingo;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Caller {

    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 75;
    private static final int MAX_INDEX = MAX_NUMBER - 1;

    private final Random random;
    private final List<Integer> numbers;

    private int calledNumbers;

    public Caller() {
        this.random = new Random();
        this.numbers = initNumbers();
        this.calledNumbers = 0;
    }

    public int call() throws CallerException {
        if (calledNumbers > MAX_INDEX) {
            throw new CallerException("Box is empty");
        }
        int index = getIndex();
        calledNumbers++;
        return removeNumber(index);
    }

    List<Integer> getNumbers() {
        return numbers;
    }

    private List<Integer> initNumbers() {
        return IntStream.rangeClosed(MIN_NUMBER, MAX_NUMBER).boxed().collect(Collectors.toList());
    }

    private int getIndex() {
        if (calledNumbers == MAX_INDEX) {
            return 0;
        }
        return random.nextInt(MAX_INDEX - calledNumbers);
    }

    private int removeNumber(int index) {
        return numbers.remove(index);
    }

}
