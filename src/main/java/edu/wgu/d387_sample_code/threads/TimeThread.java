package edu.wgu.d387_sample_code.threads;

import edu.wgu.d387_sample_code.convertor.TimeConvertor;

public class TimeThread extends Thread {

    public void run() {
        TimeConvertor timeConvertor = new TimeConvertor();

        System.out.println("-----------------------------------------");
        System.out.println("Multithreaded Time conversion output: ");
        System.out.println("-----------------------------------------");

        /*
        Change the integers to change the starting time
        Default selected time: 13:30
         */
        int[] time = this.getTime(13,30);
        System.out.println("Time input is: " + time[0] + ":" + time[1] + "\n\n");

        //Assume time is UTC
        timeConvertor.convert(time[0], time[1], 0);
        System.out.println("Assuming initial time is UTC,\nthe online, live presentation at landon hotel is at: ");
        System.out.println("\tUTC: " + timeConvertor.getUTC() + "\n\tET: " + timeConvertor.getET() + "\n\tMT: " + timeConvertor.getMT());

        //Assume time is ET
        timeConvertor.convertFromET(time[0], time[1], 0);
        System.out.println("\nAssuming initial time is ET,\nthe online, live presentation at landon hotel is at: ");
        System.out.println("\tUTC: " + timeConvertor.getUTC() + "\n\tET: " + timeConvertor.getET() + "\n\tMT: " + timeConvertor.getMT());
        //Assume time is MT
        timeConvertor.convertFromMT(time[0], time[1], 0);
        System.out.println("\nAssuming initial time is MT,\nthe online, live presentation at landon hotel is at: ");
        System.out.println("\tUTC: " + timeConvertor.getUTC() + "\n\tET: " + timeConvertor.getET() + "\n\tMT: " + timeConvertor.getMT());


        System.out.println("-----------------------------------------");
        System.out.println("End time conversion ");
        System.out.println("-----------------------------------------");
    }

    /**
     * Get the array of integers to passed into time convertor based on input*
     * NOTE: DOES NOT CALCULATE SECONDS, SECONDS WILL BE 0 ALWAYS.
     *
     * @param hour hour to be passed into time convertor
     * @param minute minutes to be passed into time convertor
     * @return array of integers hour @ index 0 and minutes at index 1
     */

    private int[] getTime(int hour, int minute){
        return new int[]{hour, minute};
    }

}
