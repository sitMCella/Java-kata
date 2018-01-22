package it.mcella.kata;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class DigitsReader {

    private static final int DIGITS_COUNT = 10;
    private static final int DIGIT_BLOCK_CHARS = 3;

    public DigitsReader() {
    }

    public List<String> readDigitsFrom(List<String> rows) {
        List<String> digits = new ArrayList<>();
        for(int i=1; i<=DIGITS_COUNT; i++) {
            digits.add(retrieveDigitWithIndex(i, rows));
        }
        return digits;
    }

    private String retrieveDigitWithIndex(int index, List<String> rows) {
        StringBuilder stringBuilder = new StringBuilder();
        int start = DIGIT_BLOCK_CHARS * 2 * (index -1);
        int end = start + DIGIT_BLOCK_CHARS;
        rows.stream()
            .forEach(row -> stringBuilder.append(row.substring(start, end)));
        return stringBuilder.toString();
    }

}