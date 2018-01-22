package it.mcella.kata.berlinclock;

import java.time.LocalTime;

public class HigherMinutes {

    public static final int LAMPS_NUMBER = 11;

    private static final int FIVE_MINUTES = 5;
    private static final int FIFTEEN_MINUTES_LAMP_INDEX = 3;

    private final TimeParse timeParse;

    public HigherMinutes() {
        this.timeParse = new TimeParse();
    }

    public String from(String time) throws BerlinClockException {
        LocalTime parsedTime = timeParse.from(time);

        int numberOfIlluminatedLamps = getNumberOfIlluminatedLampsFrom(parsedTime.getMinute());

        return createRowFrom(numberOfIlluminatedLamps);
    }

    public int toDigital(String higherMinutesLamps) {
        return higherMinutesLamps.replace("O", "").length() * FIVE_MINUTES;
    }

    private int getNumberOfIlluminatedLampsFrom(int minutes) {
        return minutes / FIVE_MINUTES;
    }

    private String createRowFrom(int numberOfIlluminatedLamps) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int lampIndex = 1; lampIndex <= LAMPS_NUMBER; lampIndex++) {
            if (lampIndex <= numberOfIlluminatedLamps) {
                if (isQuarterLamp(lampIndex)) {
                    stringBuilder.append("R");
                } else {
                    stringBuilder.append("Y");
                }
            } else {
                stringBuilder.append("O");
            }
        }
        return stringBuilder.toString();
    }

    private boolean isQuarterLamp(int lampIndex) {
        return lampIndex % FIFTEEN_MINUTES_LAMP_INDEX == 0;
    }

}
