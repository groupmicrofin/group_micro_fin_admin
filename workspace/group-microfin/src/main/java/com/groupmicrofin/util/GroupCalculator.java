package com.groupmicrofin.util;

import com.groupmicrofin.admin.common.MeetFrequency;

import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;


import java.time.LocalDate;
import java.util.Locale;


public class GroupCalculator {

  /* This will be used to get no of years happened with group
    /* * @param grpStartDate
     * @balance datLastMeeting
     * @param yearEndMonth
     * @return
     */

    public static int getAssessmentYears(LocalDate groupStartDt, LocalDate datLastMeeting, int yearEndMonth) {
        int assessmentYear = 0;
        int startYear = groupStartDt.getYear();
        int lastMeetingYear = datLastMeeting.getYear();
        int lastMeetingMonth = datLastMeeting.getMonthValue();
        assessmentYear = (lastMeetingYear - startYear) + 1;
        if (lastMeetingMonth > yearEndMonth) {
            assessmentYear = assessmentYear + 1;
        }
        return assessmentYear;
    }

    /**
     * This will be used to calculate number of meetings happened
     *
     * @param groupStartDt
     * @param MeetingFrequency
     * @return
     * @balancedatLastMeeting
     */

    public static int calculateNoOfCycles(LocalDate groupStartDt, LocalDate datLastMeeting, int MeetingFrequency) {
        int totalNoOfCycles = 0;
        if (groupStartDt.compareTo(datLastMeeting) > 0) {        /*groupStartDt>datLastMeeting*/
            return -1;
        } else if (MeetingFrequency == MeetFrequency.MONTHLY.getValue()) {
            int intervalMonths = (int) ChronoUnit.MONTHS.between(groupStartDt, datLastMeeting);
            totalNoOfCycles = intervalMonths + 1;

        }
        return totalNoOfCycles;


    }



     /* This will be used to calculate the total shared  amount of single share holder
     * @balance cycleNo
     * @param shareFaceValue
     * @return
     */

    public static int calculateAmtShareFaceBal(int cycleNo, float shareFaceValue) {

        int amtShareFaceBal = 0;
        if (cycleNo == 0) {
            return -1;
        } else if (cycleNo > 0) {

            amtShareFaceBal = (int) shareFaceValue * cycleNo;
        }
        return amtShareFaceBal;
    }

    /* This will be used to calculate next meeting date which will be monthly.
     * @balance datLastMeeting
     * @return
    */


   /* public static LocalDate getNextMeetingDateinNextMonth(LocalDate datLastMeeting) {


        return datLastMeeting.plusMonths(1);

    }

     /* This will be used to calculate next meeting date which will be last Sunday of every month.
     * @balance datLastMeeting
     * @return
    */

    public static LocalDate getNextMeetingDateForWeekDay(LocalDate datLastMeeting, int weekDay) {
        LocalDate datNextMeeting;

        int lastMeetingYear = datLastMeeting.getYear();
        int lastMeetingMonth = datLastMeeting.getMonthValue();
        Calendar cal = Calendar.getInstance();
        cal.set(lastMeetingYear, lastMeetingMonth + 1, 0);
        cal.add(Calendar.DAY_OF_MONTH, -(cal.get(Calendar.DAY_OF_WEEK) % 7 - weekDay));
        Date date = cal.getTime();
        datNextMeeting = new java.sql.Date(date.getTime()).toLocalDate();


        return datNextMeeting;

    }


    public static String getLastActivityStatus() {
        String lastActivityStatus = "Value new";
        return lastActivityStatus;
    }

}
