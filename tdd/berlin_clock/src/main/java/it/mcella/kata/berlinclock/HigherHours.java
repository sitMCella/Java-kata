package it.mcella.kata.berlinclock;

import java.time.LocalTime;

public class HigherHours {

    public static final int LAMPS_NUMBER = 4;

    private static final int FIVE_HOURS = 5;

    private final TimeParse timeParse;

    public HigherHours() {
        this.timeParse = new TimeParse();
    }

    public String from(String time) throws BerlinClockException {
        LocalTime parsedTime = timeParse.from(time);

        int numberOfIlluminatedLamps = getNumberOfIlluminatedLampsFrom(parsedTime.getHour());

        return createRowFrom(numberOfIlluminatedLamps);
    }

    public int toDigital(String higherHoursLamps) {
        return higherHoursLamps.replace("O", "").length() * FIVE_HOURS;
    }

    private int getNumberOfIlluminatedLampsFrom(int minutes) {
        return minutes / FIVE_HOURS;
    }

    private String createRowFrom(int numberOfIlluminatedLamps) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int lampIndex = 1; lampIndex <= LAMPS_NUMBER; lampIndex++) {
            if (lampIndex <= numberOfIlluminatedLamps) {
                stringBuilder.append("R");
            } else {
                stringBuilder.append("O");
            }
        }
        return stringBuilder.toString();
    }

}
