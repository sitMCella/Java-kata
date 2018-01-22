package it.mcella.kata.berlinclock;

import java.time.LocalTime;

public class LowerMinutes {

    public static final int LAMPS_NUMBER = 4;

    private final TimeParse timeParse;

    public LowerMinutes() {
        this.timeParse = new TimeParse();
    }

    public String from(String time) throws BerlinClockException {
        LocalTime parsedTime = timeParse.from(time);

        int numberOfIlluminatedLamps = getNumberOfIlluminatedLampsFrom(parsedTime.getMinute());

        return createRowFrom(numberOfIlluminatedLamps);
    }

    public int toDigital(String lowerMinutesLamps) {
        return lowerMinutesLamps.replace("O", "").length();
    }

    private int getNumberOfIlluminatedLampsFrom(int minutes) {
        return minutes % (LAMPS_NUMBER + 1);
    }

    private String createRowFrom(int numberOfIlluminatedLamps) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int lampIndex = 1; lampIndex <= LAMPS_NUMBER; lampIndex++) {
            if (lampIndex <= numberOfIlluminatedLamps) {
                stringBuilder.append("Y");
            } else {
                stringBuilder.append("O");
            }
        }
        return stringBuilder.toString();
    }

}
