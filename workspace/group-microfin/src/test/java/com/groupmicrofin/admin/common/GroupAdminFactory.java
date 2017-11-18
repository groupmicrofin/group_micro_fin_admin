package com.groupmicrofin.admin.common;

import com.groupmicrofin.admin.model.*;
import com.groupmicrofin.admin.model.rule.RuleBook;
import com.groupmicrofin.util.GroupCalculator;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;


public class GroupAdminFactory {


    public static GroupMaster getGroupMasterDummy() {
        GroupMaster groupMaster = new GroupMaster();
        groupMaster.setCountry("India");
        groupMaster.setEmail("omar@groupfin.com");
        groupMaster.setLoginId("omar" + new Random().nextInt());
        groupMaster.setName("omar");
        groupMaster.setPassword("password");
        groupMaster.setPincode("38933933");
        groupMaster.setTown("Delhi");

        return groupMaster;
    }

    public static GroupParam getGroupParamDummy(int groupMasterId) {


        GroupParam groupParam = new GroupParam();
        groupParam.setGroupMasterId(groupMasterId);
        groupParam.setGroupStartDt(LocalDate.of(2010, 1, 1));
        groupParam.setMeetingFrequency(MeetingFrequency.MONTHLY);
        String assessmentYear = String.valueOf(GroupCalculator.getAssessmentYears(LocalDate.of(2010, 1, 31), LocalDate.of(2017, 2, 28), 12));
        groupParam.setAssessmentYear(assessmentYear);
        groupParam.setMeetingSchedule("0 0 20 ? * SUNL");
        groupParam.setYearEndMonth(12);
        groupParam.setShareFaceValue(100);
        groupParam.setLnIntRate(12);
        groupParam.setLnIntBase(InterestBase.BIMONTHLY);
        groupParam.setLnDisbAmtMaxLimPercent(300);
        groupParam.setLnMaxActiveLoanCount(10);
        groupParam.setLnGaurantersCount(2);
        groupParam.setLnMaxInstallmentCount(50);
        groupParam.setFeeAmtNoSharePayout(200);
        groupParam.setFeeWaiverNoCycles(3);
        groupParam.setAmtRoundingDecDigits(2);

        return groupParam;
    }


    public static GroupBalance getGroupBalanceDummy(int groupMasterId) {


        // String assessmentYear = "" + LocalDate.now().getYear() + "-" + (LocalDate.now().getYear() + 1);


        GroupBalance groupBalance = new GroupBalance();
        groupBalance.setGroupMasterId(groupMasterId);
        String assessmentYear = String.valueOf(GroupCalculator.getAssessmentYears(LocalDate.of(2010, 1, 31), LocalDate.of(2017, 2, 28), 12));
        groupBalance.setAssessmentYear(assessmentYear);
        groupBalance.setAmtShareFacBal(2000);
        int cycleNo = GroupCalculator.calculateNoOfCycles(LocalDate.of(2010, 1, 1), LocalDate.of(2017, 10, 1), MeetingFrequency.MONTHLY);
        groupBalance.setCycleNo(cycleNo);
        groupBalance.setAmtShareFacBalOthers(100);
        groupBalance.setAmtMiscDr(100);
        groupBalance.setDatLastMeeting(LocalDate.of(2017, 10, 29));
        LocalDate datNextMeeting = GroupCalculator.getNextMeetingDateForWeekDay(LocalDate.of(2017, 10, 29), 1);
        groupBalance.setDatNextMeeting(datNextMeeting);
        groupBalance.setLastActivityStatus("Value new");


        return groupBalance;
    }

    public static GroupParam updateGroupParamDummy(int groupMasterId) {


        GroupParam groupParam = new GroupParam();
        groupParam.setGroupMasterId(groupMasterId);
        groupParam.setGroupStartDt(LocalDate.of(2011, 1, 1));
        groupParam.setMeetingFrequency(MeetingFrequency.MONTHLY);
        String assessmentYear = String.valueOf(GroupCalculator.getAssessmentYears(LocalDate.of(2010, 1, 31), LocalDate.of(2017, 2, 28), 12));
        groupParam.setAssessmentYear(assessmentYear);
        groupParam.setMeetingSchedule("0 0 20 ? *MONL");
        groupParam.setYearEndMonth(12);
        groupParam.setShareFaceValue(200);
        groupParam.setLnIntRate(11);
        groupParam.setLnIntBase(InterestBase.BIMONTHLY);
        groupParam.setLnDisbAmtMaxLimPercent(200);
        groupParam.setLnMaxActiveLoanCount(110);
        groupParam.setLnGaurantersCount(3);
        groupParam.setLnMaxInstallmentCount(60);
        groupParam.setFeeAmtNoSharePayout(100);
        groupParam.setFeeWaiverNoCycles(4);
        groupParam.setAmtRoundingDecDigits(3);

        return groupParam;
    }

    public static GroupBalance updateGroupBalanceDummy(int groupMasterId) {
        GroupBalance groupBalance = new GroupBalance();
        groupBalance.setGroupMasterId(groupMasterId);
        String assessmentYear = String.valueOf(GroupCalculator.getAssessmentYears(LocalDate.of(2010, 3, 31), LocalDate.of(2017, 2, 28), 12));
        groupBalance.setAssessmentYear(assessmentYear);
        groupBalance.setAmtShareFacBal(3000);
        int cycleNo = GroupCalculator.calculateNoOfCycles(LocalDate.of(2010, 1, 1), LocalDate.of(2017, 10, 1), MeetingFrequency.MONTHLY);
        groupBalance.setCycleNo(cycleNo);
        groupBalance.setAmtShareFacBalOthers(50);
        groupBalance.setAmtMiscDr(200);
        groupBalance.setDatLastMeeting(LocalDate.of(2017, 10, 29));
        LocalDate datNextMeeting = GroupCalculator.getNextMeetingDateForWeekDay(LocalDate.of(2017, 10, 29), 1);
        groupBalance.setDatNextMeeting(datNextMeeting);
        groupBalance.setLastActivityStatus("aaqif");
        return groupBalance;
    }


    public static GroupBalanceHist getGroupBalanceHistDummy(int groupMasterId) {
        GroupBalanceHist groupBalanceHist = new GroupBalanceHist();
        groupBalanceHist.setGroupMasterId(groupMasterId);
        String assessmentYear = String.valueOf(GroupCalculator.getAssessmentYears(LocalDate.of(2010, 1, 31), LocalDate.of(2017, 2, 28), 12));
        groupBalanceHist.setAssessmentYear(assessmentYear);
        groupBalanceHist.setAmtShareFacBal(2000);
        groupBalanceHist.setAmtShareFacBalOthers(100);
        int cycleNo = GroupCalculator.calculateNoOfCycles(LocalDate.of(2010, 1, 1), LocalDate.of(2017, 10, 1), MeetingFrequency.MONTHLY);
        groupBalanceHist.setCycleNo(cycleNo);
        groupBalanceHist.setDatLastMeeting(LocalDate.of(2017, 10, 29));
        LocalDate datNextMeeting = GroupCalculator.getNextMeetingDateForWeekDay(LocalDate.of(2017, 10, 29), 1);
        groupBalanceHist.setDatNextMeeting(datNextMeeting);
        groupBalanceHist.setLastActivityStatus("Value new");

        return groupBalanceHist;
    }

    public static GroupMember getGroupMemberDummy(int groupMasterId) {
        GroupMember groupMember = new GroupMember();
        groupMember.setGroupMasterId(groupMasterId);
        String assessmentYear = String.valueOf(GroupCalculator.getAssessmentYears(LocalDate.of(2010, 1, 31), LocalDate.of(2017, 2, 28), 12));
        groupMember.setAssessmentYear(assessmentYear);
        groupMember.setName("omar");
        groupMember.setLoginId("omar" + new Random().nextInt());
        groupMember.setEmail("ok@live.com");
        groupMember.setPassword("passw0rd");
        groupMember.setMobileNo(1000);
        groupMember.setBirthDate(LocalDate.of(1993, 8, 18));
        groupMember.setKycId("12");
        int cycleNo = GroupCalculator.calculateNoOfCycles(LocalDate.of(2010, 1, 1), LocalDate.of(2017, 10, 1), MeetingFrequency.MONTHLY);
        groupMember.setCycleNo(cycleNo);
        groupMember.setAmtPendShare(1200);
        groupMember.setAmtPaidFee(1000);
        groupMember.setAmtLnDisb(1200);
        groupMember.setAmtLnBalance(100);
        groupMember.setNoActiveLn(200);
        groupMember.setAmtAccrInt(300);
        groupMember.setAmtPaidInt(400);
        groupMember.setAmtPaidPrinc(150);
        groupMember.setAmtDefInstallment(600);
        groupMember.setDatLastLnDisb(LocalDate.of(2012, 4, 15));
        return groupMember;
    }

    public static GrpTxnLog getGrpTxnLogDummy(int groupMasterId) {

        GrpTxnLog grpTxnLog = new GrpTxnLog();
        grpTxnLog.setGroupMasterId(groupMasterId);
        int cycleNo = GroupCalculator.calculateNoOfCycles(LocalDate.of(2010, 1, 1), LocalDate.of(2017, 10, 1), MeetingFrequency.MONTHLY);
        grpTxnLog.setCycleNo(cycleNo);
        grpTxnLog.setEventName("ADD ON MY NOW");
        grpTxnLog.setGroupMemberId(21);
        grpTxnLog.setMntChngDetails("New One");
        grpTxnLog.setTxnAmt(1500);
        grpTxnLog.setTxnAmtOther(100);
        grpTxnLog.setDatTxn(LocalDateTime.of(2010, 04, 11, 11, 40));
        grpTxnLog.setFucolmn1("Future");
        return grpTxnLog;
    }

    public static RuleBook getRuleBookDummy(int groupMasterId) {
        RuleBook ruleBook = new RuleBook();
        ruleBook.setGroupMasterId(groupMasterId);
        ruleBook.setGroupStartDt(LocalDate.of(2010, 1, 1));
        ruleBook.setMeetingFrequency(MeetingFrequency.MONTHLY);
        ruleBook.setMeetingSchedule("0 0 0 ? * SUNL");
        ruleBook.setYearEndMonth(12);
        ruleBook.setShareFaceValue(100);
        ruleBook.setLnIntRate(12);
        ruleBook.setLnIntBase(InterestBase.BIMONTHLY);
        ruleBook.setLnDisbAmtMaxLimPercent(300);
        ruleBook.setLnMaxActiveLoanCount(10);
        ruleBook.setLnGaurantersCount(2);
        ruleBook.setLnMaxInstallmentCount(50);
        ruleBook.setFeeAmtNoSharePayout(200);
        ruleBook.setFeeWaiverNoCycles(3);
        ruleBook.setAmtRoundingDecDigits(2);
        ruleBook.setAmtShareFacBal(2000);
        ruleBook.setAmtShareFacBalOthers(100);
        ruleBook.setAmtMiscDr(100);
        ruleBook.setDatLastMeeting(LocalDate.of(2017, 10, 29));
        LocalDate datNextMeeting = GroupCalculator.getNextMeetingDateForWeekDay(LocalDate.of(2017, 10, 29), 1);
        ruleBook.setDatNextMeeting(datNextMeeting);
        int cycleNo = GroupCalculator.calculateNoOfCycles(ruleBook.getGroupStartDt(), ruleBook.getDatLastMeeting(), ruleBook.getMeetingFrequency());
        ruleBook.setCycleNo(cycleNo);
        String lastActivityStatus = GroupCalculator.getLastActivityStatus();
        ruleBook.setLastActivityStatus(lastActivityStatus);
        return ruleBook;
    }
}