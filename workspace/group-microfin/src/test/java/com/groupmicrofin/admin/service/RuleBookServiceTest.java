package com.groupmicrofin.admin.service;

import com.groupmicrofin.admin.common.GroupAdminFactory;
import com.groupmicrofin.admin.common.InterestBase;
import com.groupmicrofin.admin.common.MeetingFrequency;
import com.groupmicrofin.admin.model.GroupBalance;
import com.groupmicrofin.admin.model.GroupMaster;
import com.groupmicrofin.admin.model.GroupParam;
import com.groupmicrofin.admin.model.GrpTxnLog;
import com.groupmicrofin.admin.model.rule.RuleBook;
import com.groupmicrofin.admin.repository.GroupMasterRepository;
import com.groupmicrofin.admin.repository.GroupMasterRepositoryMSImpl;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertTrue;

public class RuleBookServiceTest {

    RuleBookServiceImpl ruleBookService;
    GroupMasterRepository groupMasterRepository;

    @Before
    public void setup() {
        this.ruleBookService = new RuleBookServiceImpl();
        this.groupMasterRepository = new GroupMasterRepositoryMSImpl();
    }

    @Test
    public void testAssessmentYear() {
        LocalDate grpStartDate = LocalDate.of(2016, 1, 1);
        LocalDate lstMeetingDate = LocalDate.of(2016, 1, 1);
        int yearEndMonth = 12;
        int assYears = this.ruleBookService.getAssessmentYears(grpStartDate, lstMeetingDate, yearEndMonth);
        assertTrue(assYears == 1);

        grpStartDate = LocalDate.of(2010, 1, 1);
        lstMeetingDate = LocalDate.of(2014, 1, 1);
        assYears = this.ruleBookService.getAssessmentYears(grpStartDate, lstMeetingDate, yearEndMonth);
        assertTrue(assYears == 5);

        grpStartDate = LocalDate.of(2010, 1, 1);
        lstMeetingDate = LocalDate.of(2011, 6, 1);
        yearEndMonth = 5;
        assYears = this.ruleBookService.getAssessmentYears(grpStartDate, lstMeetingDate, yearEndMonth);
        assertTrue(assYears == 3);

    }

    @Test
    public void addRulBookToGroupTest() {
        GroupMaster groupMaster = GroupAdminFactory.getGroupMasterDummy();
        this.groupMasterRepository.addGroupMaster(groupMaster);
        RuleBook ruleBook = GroupAdminFactory.getRuleBookDummy(groupMaster.getId());
        this.ruleBookService.addRuleBookToGroup(ruleBook);
        //TODO findGroupParamByGroupMasterId get object of GroupParam
        //TODO findGroupBalanceByGroupMasterId get object of GroupBalance
    }


    @Ignore
    public void testConvertToGroupParam() {

        RuleBook ruleBook = new RuleBook();
        GroupParam groupParam = this.ruleBookService.convertToGroupParam(ruleBook);
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
        assertTrue(ruleBook.getGroupMasterId() > 0);
    }

    @Ignore
    public void testConvertToGroupBalance() {

        RuleBook ruleBook = new RuleBook();
        GroupBalance groupBalance = this.ruleBookService.convertToGroupBalance(ruleBook);
        ruleBook.setGroupMasterId(1);
        ruleBook.setAmtShareFacBal(1000);
        ruleBook.setAmtShareFacBalOthers(1500);
        ruleBook.setAmtMiscDr(100);

        assertTrue(ruleBook.getGroupMasterId() > 0);
    }

    @Ignore
    public void testConvertToGrpTxnLog() {
        RuleBook ruleBook = new RuleBook();
        GrpTxnLog grpTxnLog = this.ruleBookService.convertToGrpTxnLog(ruleBook);
        ruleBook.setGroupMasterId(1);
        ruleBook.setGroupMemberId(1);
        ruleBook.setEventName("ADD ON MY NOW");
        ruleBook.setTxnAmt(1500);
        ruleBook.setTxnAmtOther(100);
        assertTrue(ruleBook.getGroupMasterId() > 0);
    }

}



