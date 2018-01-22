package it.mcella.kata.berlinclock;

import java.time.LocalTime;

public class BerlinClock {

    private final LowerMinutes lowerMinutes;
    private final HigherMinutes higherMinutes;
    private final LowerHours lowerHours;
    private final HigherHours higherHours;
    private final Seconds seconds;

    public BerlinClock(LowerMinutes lowerMinutes,
                       HigherMinutes higherMinutes,
                       LowerHours lowerHours,
                       HigherHours higherHours,
                       Seconds seconds) {
        this.lowerMinutes = lowerMinutes;
        this.higherMinutes = higherMinutes;
        this.lowerHours = lowerHours;
        this.higherHours = higherHours;
        this.seconds = seconds;
    }

    public String fromDigitalTime(String time) throws BerlinClockException {
        String lowerMinutesLamps = lowerMinutes.from(time);
        String higherMinutesLamps = higherMinutes.from(time);
        String lowerHoursLamps = lowerHours.from(time);
        String higherHoursLamps = higherHours.from(time);
        String secondsLamp = seconds.from(time);
        return composeLamps(lowerMinutesLamps, higherMinutesLamps, lowerHoursLamps, higherHoursLamps, secondsLamp);
    }

    public LocalTime toDigitalTime(String berlinClockTime) throws BerlinClockException {
        String lowerMinutesLamps = getLowerMinutesFrom(berlinClockTime);
        int lowerMinutesDigitalTime = lowerMinutes.toDigital(lowerMinutesLamps);
        String higherMinutesLamps = getHigherMinutesFrom(berlinClockTime);
        int higherMinutesDigitalTime = higherMinutes.toDigital(higherMinutesLamps);
        int minutesDigitalTime = higherMinutesDigitalTime + lowerMinutesDigitalTime;
        String lowerHoursLamps = getLowerHoursFrom(berlinClockTime);
        int lowerHoursDigitalTime = lowerHours.toDigital(lowerHoursLamps);
        String higherHoursLamps = getHigherHoursFrom(berlinClockTime);
        int higherHoursDigitalTime = higherHours.toDigital(higherHoursLamps);
        int hoursDigitalTime = higherHoursDigitalTime + lowerHoursDigitalTime;
        String secondsLamp = getSecondsFrom(berlinClockTime);
        int secondsDigitalTime = seconds.toDigital(secondsLamp);
        return LocalTime.of(hoursDigitalTime, minutesDigitalTime, secondsDigitalTime);
    }

    private String composeLamps(String lowerMinutesLamps,
                                String higherMinutesLamps,
                                String lowerHoursLamps,
                                String higherHoursLamps,
                                String secondsLamp) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(secondsLamp);
        stringBuilder.append(higherHoursLamps);
        stringBuilder.append(lowerHoursLamps);
        stringBuilder.append(higherMinutesLamps);
        stringBuilder.append(lowerMinutesLamps);
        return stringBuilder.toString();
    }

    private String getLowerMinutesFrom(String berlinClockTime) {
        int startIndex = berlinClockTime.length() - LowerMinutes.LAMPS_NUMBER;
        return berlinClockTime.substring(startIndex);
    }

    private String getHigherMinutesFrom(String berlinClockTime) {
        int endIndex = berlinClockTime.length() - LowerMinutes.LAMPS_NUMBER;
        int startIndex = endIndex - HigherMinutes.LAMPS_NUMBER;
        return berlinClockTime.substring(startIndex, endIndex);
    }

    private String getLowerHoursFrom(String berlinClockTime) {
        int endIndex = berlinClockTime.length() - LowerMinutes.LAMPS_NUMBER - HigherMinutes.LAMPS_NUMBER;
        int startIndex = endIndex - LowerHours.LAMPS_NUMBER;
        return berlinClockTime.substring(startIndex, endIndex);
    }

    private String getHigherHoursFrom(String berlinClockTime) {
        int endIndex = berlinClockTime.length() - LowerMinutes.LAMPS_NUMBER - HigherMinutes.LAMPS_NUMBER - LowerHours.LAMPS_NUMBER;
        int startIndex = endIndex - HigherHours.LAMPS_NUMBER;
        return berlinClockTime.substring(startIndex, endIndex);
    }

    private String getSecondsFrom(String berlinClockTime) {
        return berlinClockTime.substring(0, 1);
    }

}
