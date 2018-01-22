package it.mcella.kata;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Optional;
import java.lang.StringBuilder;

public class DigitsParser {

    public static final String ZERO =   " _ " +
                                        "| |" +
                                        "|_|";
    public static final String ONE =    "   " +
                                        "  |" +
                                        "  |";
    public static final String TWO =    " _ " +
                                        " _|" +
                                        "|_ ";
    public static final String THREE =  " _ " +
                                        " _|" +
                                        " _|";
    public static final String FOUR =   "   " +
                                        "|_|" +
                                        "  |";
    public static final String FIVE =   " _ " +
                                        "|_ " +
                                        " _|";
    public static final String SIX =    " _ " +
                                        "|_ " +
                                        "|_|";
    public static final String SEVEN =  " _ " +
                                        "  |" +
                                        "  |";
    public static final String EIGHT =  " _ " +
                                        "|_|" +
                                        "|_|";
    public static final String NINE =   " _ " +
                                        "|_|" +
                                        "  |";

    private final Map<String, String> digits;

    public DigitsParser() {
        this.digits = new HashMap();
        digits.put(ZERO, "0");
        digits.put(ONE, "1");
        digits.put(TWO, "2");
        digits.put(THREE, "3");
        digits.put(FOUR, "4");
        digits.put(FIVE, "5");
        digits.put(SIX, "6");
        digits.put(SEVEN, "7");
        digits.put(EIGHT, "8");
        digits.put(NINE, "9");
    }

    public int parse(List<String> digits) throws DigitsParserException {
        StringBuilder stringBuilder = new StringBuilder();
        for(String digit: digits) {
            stringBuilder.append(parse(digit));
        }
        return Integer.parseInt(stringBuilder.toString());
    }

    public String parse(String digit) throws DigitsParserException {
        Optional<String> foundDigit = digits.keySet().stream()
            .filter(currentDigit -> currentDigit.equals(digit))
            .findFirst();
        if(foundDigit.isPresent()) {
            return digits.get(foundDigit.get());
        }
        throw new DigitsParserException("Cannot parse digit \"" + digit + "\"");
    }

}