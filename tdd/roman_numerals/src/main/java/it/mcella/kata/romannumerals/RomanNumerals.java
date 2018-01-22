package it.mcella.kata.romannumerals;

public class RomanNumerals {

    public static final int ONE_THOUSAND = Numerals.ONE_THOUSAND.getValue();
    public static final int ONE_HUNDRED = Numerals.ONE_HUNDRED.getValue();
    public static final int TEN = Numerals.TEN.getValue();
    public static final int NINE = 9;
    public static final int FIVE = Numerals.FIVE.getValue();
    public static final int FOUR = 4;

    private StringBuilder stringBuilder;

    public RomanNumerals() {
    }

    public String convert(int number) {
        int thousands = thousandsPlaceOf(number);

        int hundreds = hundredsPlaceOf(number, thousands);

        int tens = tensPlaceOf(number, thousands, hundreds);

        int units = unitsPlaceOf(number);

        this.stringBuilder = new StringBuilder();

        appendThousands(thousands);

        appendHundreds(hundreds);

        appendTens(tens);

        appendUnits(units);

        return stringBuilder.toString();
    }

    private int thousandsPlaceOf(int number) {
        return number / ONE_THOUSAND;
    }

    private int hundredsPlaceOf(int number, int thousands) {
        return (number - ONE_THOUSAND * thousands) / ONE_HUNDRED;
    }

    private int tensPlaceOf(int number, int thousands, int hundreds) {
        return (number - ONE_THOUSAND * thousands - ONE_HUNDRED * hundreds) / TEN;
    }

    private int unitsPlaceOf(int number) {
        return number % TEN;
    }

    private void appendThousands(int thousands) {
        addition(Numerals.ONE_THOUSAND, thousands);
    }

    private void appendHundreds(int hundreds) {
        hundreds = subtraction(Numerals.ONE_HUNDRED, hundreds);

        addition(Numerals.ONE_HUNDRED, hundreds);
    }

    private void appendTens(int tens) {
        tens = subtraction(Numerals.TEN, tens);

        addition(Numerals.TEN, tens);
    }

    private void appendUnits(int units) {
        units = subtraction(Numerals.ONE, units);

        addition(Numerals.ONE, units);
    }

    private void addition(Numerals numeral, int placeNumber) {
        for (int i = 0; i < placeNumber; i++) {
            stringBuilder.append(numeral.getSymbol());
        }
    }

    private int subtraction(Numerals tenNumeral, int placeNumber) {
        if (placeNumber == NINE || placeNumber == FOUR) {
            stringBuilder.append(tenNumeral.getSymbol());
        }

        if (placeNumber == NINE) {
            stringBuilder.append(tenNumeral.getFollowingTenNumeral().getSymbol());
            return 0;
        }

        if (placeNumber == FOUR || placeNumber / FIVE == 1) {
            stringBuilder.append(tenNumeral.getFollowingQuintineNumeral().getSymbol());
            if (placeNumber / FIVE == 1) {
                return placeNumber % FIVE;
            }
            return 0;
        }
        return placeNumber;
    }

}
