package com.groupmicrofin.admin.common;

import com.groupmicrofin.admin.model.GroupBalance;
import com.groupmicrofin.admin.model.GroupMaster;
import com.groupmicrofin.admin.model.GroupParam;
import com.groupmicrofin.admin.model.GrpTxnLog;
import com.groupmicrofin.admin.model.rule.RuleBook;

import java.time.LocalDate;
import java.time.LocalDateTime;


public class GroupAdminFactory {

    public static GroupMaster getGroupMasterDummy() {
        GroupMaster groupMaster = new GroupMaster();
        groupMaster.setCountry("India");
        groupMaster.setEmail("omar@groupfin.com");
        groupMaster.setLoginId("omar");
        groupMaster.setName("omar");
        groupMaster.setPassword("password");
        groupMaster.setPincode("38933933");
        groupMaster.setTown("sringar");
        //groupMaster.setId(398);
        return groupMaster;
    }

    public static GroupParam getGroupParamDummy(int groupMasterId) {

        GroupParam groupParam = new GroupParam();
        groupParam.setGroupMasterId(groupMasterId);
        groupParam.setGroupStartDt(LocalDate.of(2004, 11, 15));
        groupParam.setMeetingFrequency(MeetingFrequency.MONTHLY);
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
        groupParam.setAssessmentYear("1");
        groupParam.setAmtRoundingDecDigits(2);

        return groupParam;
    }

    public static GroupBalance getGroupBalanceDummy(int groupMasterId) {

        GroupBalance groupBalance = new GroupBalance();
        groupBalance.setGroupMasterId(groupMasterId);
        String assessmentYear = "" + LocalDate.now().getYear() + "-" + (LocalDate.now().getYear() + 1);
        groupBalance.setAssessmentYear(assessmentYear);
        groupBalance.setAmtShareFacBal(1000);
        groupBalance.setAmtShareFacBalOthers(1500);
        groupBalance.setCycleNo(2);
        groupBalance.setAmtMiscDr(100);
        groupBalance.setDatLastMeeting(LocalDate.of(2005, 11, 15));
        groupBalance.setDatNextMeeting(LocalDate.of(2005, 12, 15));
        groupBalance.setLastActivityStatus("value changed");


        return groupBalance;
    }

    public static GrpTxnLog getGrpTxnLogDummy(int groupMasterId) {

        GrpTxnLog grpTxnLog = new GrpTxnLog();
        grpTxnLog.setGroupMasterId(groupMasterId);
        grpTxnLog.setCycleNo(2);
        grpTxnLog.setEventName("ADD ON MY NOW");
        grpTxnLog.setGroupMemberId(21);
        grpTxnLog.setMntChngDetails("CHANGED VALUE OF");
        grpTxnLog.setTxnAmt(1500);
        grpTxnLog.setTxnAmtOther(100);
        grpTxnLog.setDatTxn(LocalDateTime.of(2010, 04, 11, 11, 40));
        grpTxnLog.setFucolmn1("Future");
        return grpTxnLog;
    }

    public static RuleBook getRuleBookDummy(int groupMasterId) {
        RuleBook ruleBook = new RuleBook();
        ruleBook.setGroupMasterId(groupMasterId);
        //TODO set test case specific data in object
        return ruleBook;
    }

}
