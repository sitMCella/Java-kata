package it.mcella.kata.berlinclock;

import java.time.LocalTime;

public class Seconds {

    private final TimeParse timeParse;

    public Seconds() {
        this.timeParse = new TimeParse();
    }

    public String from(String time) throws BerlinClockException {
        LocalTime parsedTime = timeParse.from(time);

        boolean eventSecond = isEventSecond(parsedTime.getSecond());

        if (eventSecond) {
            return "Y";
        } else return "O";
    }

    public int toDigital(String secondsLamp) {
        return secondsLamp.replace("Y", "").length();
    }

    private boolean isEventSecond(int second) {
        return second % 2 == 0;
    }

}
