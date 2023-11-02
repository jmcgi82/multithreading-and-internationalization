package edu.wgu.d387_sample_code.convertor;

import lombok.Data;

import java.time.LocalTime;

@Data
public class TimeConvertor {

    private LocalTime ET;
    private LocalTime MT;
    private LocalTime UTC;

    /**
     * Default times are:
     * 9:05:03 AM ET
     * 7:05:03 AM MT
     * 5:05:03 PM UTC
     * Use conversion method based on which time zone you are using:
     *  convertFromET for input eastern time
     *  convertFromMT for input mountain time
     *  convert for input from UTC
     */
    public TimeConvertor() {
        this.ET = LocalTime.of(9,5,3);
        this.MT = LocalTime.of(7,5,3);
        this.UTC = LocalTime.of(17,5,3);

    }

    /**
     * Assumes input is UTC, coordinated universal time
     * @param hour UTC hour
     * @param minute minutes
     * @param second seconds
     */
    public void convert(int hour, int minute, int second) {
        this.UTC = LocalTime.of(hour, minute, second);
        this.ET = this.UTC.minusHours(4);
        this.MT = this.ET.minusHours(2);
    }

    /**
     * Assumes input is ET, eastern time(-7:00)
     * @param hour ET hour
     * @param minute minutes
     * @param second seconds
     */
    public void convertFromET(int hour, int minute, int second) {
        this.ET = LocalTime.of(hour, minute, second);
        this.MT = this.ET.minusHours(2);
        this.UTC = this.ET.plusHours(4);
    }

    /**
     * Assumes input is MT, mountain time(-9:00)
     * @param hour MT hour
     * @param minute minutes
     * @param second seconds
     */
    public void convertFromMT(int hour, int minute, int second) {
        this.MT = LocalTime.of(hour, minute, second);
        this.ET = this.MT.plusHours(2);
        this.UTC = this.ET.plusHours(4);
    }





}
