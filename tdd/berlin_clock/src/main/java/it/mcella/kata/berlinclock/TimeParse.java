package it.mcella.kata.berlinclock;

import java.time.LocalTime;
import java.time.format.DateTimeParseException;

public class TimeParse {

    public TimeParse() {
    }

    public LocalTime from(String time) throws BerlinClockException {
        try {
            return LocalTime.parse(time);
        } catch (DateTimeParseException ex) {
            String errorMessage = String.format("Cannot parse time %s", time);
            throw new BerlinClockException(errorMessage, ex);
        }
    }

}
