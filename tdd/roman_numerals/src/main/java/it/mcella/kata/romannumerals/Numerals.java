package it.mcella.kata.romannumerals;

public enum Numerals {

    ONE(1, "I"),
    FIVE(5, "V"),
    TEN(10, "X"),
    FIFTY(50, "L"),
    ONE_HUNDRED(100, "C"),
    FIVE_HUNDRED(500, "D"),
    ONE_THOUSAND(1000, "M");

    private final int value;
    private final String symbol;

    private Numerals(int value, String symbol) {
        this.value = value;
        this.symbol = symbol;
    }

    public int getValue() {
        return value;
    }

    public String getSymbol() {
        return symbol;
    }

    public Numerals getFollowingTenNumeral() {
        switch (this) {
            case ONE:
                return TEN;
            case TEN:
                return ONE_HUNDRED;
            case ONE_HUNDRED:
                return ONE_THOUSAND;
        }
        String error = String.format("Cannot retrieve following ten numeral from %s", this.name());
        throw new IllegalArgumentException(error);
    }

    public Numerals getFollowingQuintineNumeral() {
        switch (this) {
            case ONE:
                return FIVE;
            case TEN:
                return FIFTY;
            case ONE_HUNDRED:
                return FIVE_HUNDRED;
        }
        String error = String.format("Cannot retrieve following quintine numeral from %s", this.name());
        throw new IllegalArgumentException(error);
    }

}
