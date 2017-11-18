package com.groupmicrofin.util;

import com.groupmicrofin.admin.common.MeetingFrequency;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertTrue;

public class GroupCalculatorTest {

    @Test
    public void testAssessmentYear() {
        LocalDate grpStartDate = LocalDate.of(2016, 1, 1);
        LocalDate datLastMeeting = LocalDate.of(2016, 1, 1);
        int yearEndMonth = 12;
        int assYears = GroupCalculator.getAssessmentYears(grpStartDate, datLastMeeting, yearEndMonth);
        assertTrue(assYears == 1);

        grpStartDate = LocalDate.of(2010, 1, 1);
        datLastMeeting = LocalDate.of(2014, 1, 1);
        assYears = GroupCalculator.getAssessmentYears(grpStartDate, datLastMeeting, yearEndMonth);
        assertTrue(assYears == 5);

        grpStartDate = LocalDate.of(2010, 1, 1);
        datLastMeeting = LocalDate.of(2011, 6, 1);
        yearEndMonth = 5;
        assYears = GroupCalculator.getAssessmentYears(grpStartDate, datLastMeeting, yearEndMonth);
        assertTrue(assYears == 3);
    }

    @Test
    public void testNoOfCycles() {

        LocalDate groupStartDt = LocalDate.of(2010, 1, 11);
        LocalDate lastMeetingDate = LocalDate.of(2010, 1, 21);
        int noOfCycles = GroupCalculator.calculateNoOfCycles(groupStartDt, lastMeetingDate, MeetingFrequency.MONTHLY);
        System.out.println(noOfCycles);
        assertTrue(noOfCycles == 1);

        groupStartDt = LocalDate.of(2010, 1, 1);
        lastMeetingDate = LocalDate.of(2010, 2, 1);
        noOfCycles = GroupCalculator.calculateNoOfCycles(groupStartDt, lastMeetingDate, MeetingFrequency.MONTHLY);
        System.out.println(noOfCycles);
        assertTrue(noOfCycles == 2);

        groupStartDt = LocalDate.of(2010, 1, 10);
        lastMeetingDate = LocalDate.of(2015, 1, 29);
        noOfCycles = GroupCalculator.calculateNoOfCycles(groupStartDt, lastMeetingDate, MeetingFrequency.MONTHLY);
        System.out.println(noOfCycles);
        assertTrue(noOfCycles == 61);

        groupStartDt = LocalDate.of(2010, 1, 1);
        lastMeetingDate = LocalDate.of(2017, 10, 1);
        noOfCycles = GroupCalculator.calculateNoOfCycles(groupStartDt, lastMeetingDate, MeetingFrequency.MONTHLY);
        System.out.println(noOfCycles);
        assertTrue(noOfCycles == 94);

    }

    @Test
    public void testAmtShareFaceBal() {
        int totalNoOfCycles = 15;
        float shareFaceValue = 100.05F;
        int amtShareFacBal = GroupCalculator.calculateAmtShareFaceBal(totalNoOfCycles, shareFaceValue);
        System.out.println(amtShareFacBal);
        assertTrue(amtShareFacBal == 1500);

        totalNoOfCycles = 20;
        shareFaceValue = 200;
        amtShareFacBal = GroupCalculator.calculateAmtShareFaceBal(totalNoOfCycles, shareFaceValue);
        System.out.println(amtShareFacBal);
        assertTrue(amtShareFacBal == 4000);

        totalNoOfCycles = 25;
        shareFaceValue = 300;
        amtShareFacBal = GroupCalculator.calculateAmtShareFaceBal(totalNoOfCycles, shareFaceValue);
        System.out.println(amtShareFacBal);
        assertTrue(amtShareFacBal == 7500);
    }


    @Test
    public void testNextMeetingDateForWeekDay() {//Last Sunday Of Every Month.
        LocalDate datLastMeeting = LocalDate.of(2017, 10, 1);//
        LocalDate datNextMeeting = GroupCalculator.getNextMeetingDateForWeekDay(datLastMeeting, 2);//
        System.out.println(datNextMeeting);
        assertTrue(datNextMeeting.compareTo(LocalDate.of(2017, 11, 27)) == 0);

        datLastMeeting = LocalDate.of(2017, 4, 15);
        datNextMeeting = GroupCalculator.getNextMeetingDateForWeekDay(datLastMeeting, 1);
        System.out.println(datNextMeeting);
        assertTrue(datNextMeeting.compareTo(LocalDate.of(2017, 5, 28)) == 0);

        datLastMeeting = LocalDate.of(2019, 12, 28);
        datNextMeeting = GroupCalculator.getNextMeetingDateForWeekDay(datLastMeeting, 1);
        System.out.println(datNextMeeting);
        assertTrue(datNextMeeting.compareTo(LocalDate.of(2020, 01, 26)) == 0);
    }


}
