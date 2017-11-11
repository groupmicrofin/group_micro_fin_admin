package com.groupmicrofin.admin.service;

import com.groupmicrofin.admin.common.GroupAdminFactory;
import com.groupmicrofin.admin.model.GroupMaster;
import com.groupmicrofin.admin.common.InterestBase;
import com.groupmicrofin.admin.common.MeetingFrequency;
import com.groupmicrofin.admin.model.GroupParam;
import com.groupmicrofin.admin.model.GroupBalance;
import com.groupmicrofin.admin.model.GrpTxnLog;

import com.groupmicrofin.admin.model.rule.RuleBook;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertTrue;

public class RuleBookServiceTest {

    RuleBookServiceImpl ruleBookService;

    @Before
    public void setup()
    {
        ruleBookService = new RuleBookServiceImpl();
    }



    @Test
    public void testConvertToGroupParam() {

        RuleBook ruleBook = new RuleBook();
        GroupParam groupParam = ruleBookService.convertToGroupParam(ruleBook);
        ruleBook.setGroupMasterId(1);
        ruleBook.setGroupStartDt(LocalDate.of(2004, 11, 15));
        ruleBook.setMeetingFrequency(MeetingFrequency.MONTHLY);
        ruleBook.setMeetingSchedule("0 0 20 ? * SUNL");
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
        Assert.assertTrue(ruleBook.getGroupMasterId()>0);
    }
    @Test
    public void testConvertToGroupBalance() {

        RuleBook ruleBook = new RuleBook();
        GroupBalance groupBalance = ruleBookService.convertToGroupBalance(ruleBook);
        ruleBook.setGroupMasterId(1);
        ruleBook.setAmtShareFacBal(1000);
        ruleBook.setAmtShareFacBalOthers(1500);
        ruleBook.setAmtMiscDr(100);

        Assert.assertTrue(ruleBook.getGroupMasterId()>0);
    }

   @Test
      public void testConvertToGrpTxnLog() {
        RuleBook ruleBook = new RuleBook();
        GrpTxnLog grpTxnLog = ruleBookService.convertToGrpTxnLog(ruleBook);
        ruleBook.setGroupMasterId(1);
        ruleBook.setGroupMemberId(1);
        ruleBook.setEventName("ADD ON MY NOW");
        ruleBook.setTxnAmt(1500);
        ruleBook.setTxnAmtOther(100);
          Assert.assertTrue(ruleBook.getGroupMasterId()>0);
      }

    }



