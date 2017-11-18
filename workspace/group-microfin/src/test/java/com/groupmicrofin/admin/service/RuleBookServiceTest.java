package com.groupmicrofin.admin.service;

import com.groupmicrofin.admin.common.GroupAdminFactory;
import com.groupmicrofin.admin.common.InterestBase;
import com.groupmicrofin.admin.common.MeetingFrequency;
import com.groupmicrofin.admin.model.GroupBalance;
import com.groupmicrofin.admin.model.GroupMaster;
import com.groupmicrofin.admin.model.GroupParam;
import com.groupmicrofin.admin.model.rule.RuleBook;
import com.groupmicrofin.admin.repository.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.time.LocalDate;


public class RuleBookServiceTest {

    RuleBookServiceImpl ruleBookService;
    GroupMasterRepository groupMasterRepository;
    GroupParamRepository groupParamRepository;
    GroupBalanceRepository groupBalanceRepository;

    @Before
    public void setup() {
        this.ruleBookService = new RuleBookServiceImpl();
        this.groupMasterRepository = new GroupMasterRepositoryMSImpl();
        this.groupParamRepository = new GroupParamRepositoryMSImpl();
        this.groupBalanceRepository = new GroupBalanceRepositoryMSImpl();
    }

    @Test
    public void addRulBookToGroupTest() {
        GroupMaster groupMaster = GroupAdminFactory.getGroupMasterDummy();
        GroupParam groupParam = this.groupParamRepository.findByGroupMasterId(groupMaster.getId());
        GroupBalance groupBalance = this.groupBalanceRepository.findByGroupMasterId(groupMaster.getId());
        this.groupMasterRepository.addGroupMaster(groupMaster);
        RuleBook ruleBook = GroupAdminFactory.getRuleBookDummy(groupMaster.getId());
        this.ruleBookService.addRuleBookToGroup(ruleBook);

        assertNotNull(groupParam);
        assertNotNull(groupBalance);
        assertTrue(ruleBook.getCycleNo() == 94);
        assertTrue(ruleBook.getYearEndMonth() == 12);
        System.out.println(groupParam.getAssessmentYear());

    }

    @Test
    public void testConvertToGroupParam() {
        RuleBook ruleBook = new RuleBook();
        ruleBook.setGroupMasterId(1);
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


        GroupParam groupParam = this.ruleBookService.convertToGroupParam(ruleBook);

        assertTrue(groupParam.getGroupStartDt().equals(ruleBook.getGroupStartDt()));
        assertTrue(groupParam.getMeetingSchedule().equals(ruleBook.getMeetingSchedule()));
        assertTrue(groupParam.getMeetingFrequency() == ruleBook.getMeetingFrequency());
        assertTrue(groupParam.getYearEndMonth() == ruleBook.getYearEndMonth());
        assertTrue(groupParam.getGroupMasterId() == ruleBook.getGroupMasterId());
        assertTrue(groupParam.getShareFaceValue() == ruleBook.getShareFaceValue());
        assertTrue(groupParam.getLnIntRate() == ruleBook.getLnIntRate());
        assertTrue(groupParam.getLnIntBase() == ruleBook.getLnIntBase());
        assertTrue(groupParam.getLnDisbAmtMaxLimPercent() == ruleBook.getLnDisbAmtMaxLimPercent());
        assertTrue(groupParam.getLnMaxActiveLoanCount() == ruleBook.getLnMaxActiveLoanCount());
        assertTrue(groupParam.getLnGaurantersCount() == ruleBook.getLnGaurantersCount());
        assertTrue(groupParam.getLnMaxInstallmentCount() == ruleBook.getLnMaxInstallmentCount());
        assertTrue(groupParam.getFeeAmtNoSharePayout() == ruleBook.getFeeAmtNoSharePayout());
        assertTrue(groupParam.getFeeWaiverNoCycles() == ruleBook.getFeeWaiverNoCycles());

        assertTrue(groupParam.getAmtRoundingDecDigits() == ruleBook.getAmtRoundingDecDigits());

    }

    @Test
    public void testConvertToGroupBalance() {
        RuleBook ruleBook = new RuleBook();
        ruleBook.setGroupMasterId(1);
        ruleBook.setAmtShareFacBal(2000);
        ruleBook.setAmtShareFacBalOthers(100);
        ruleBook.setAmtMiscDr(100);
        ruleBook.setDatLastMeeting(LocalDate.of(2017, 10, 29));
        ruleBook.setDatNextMeeting(LocalDate.of(2017, 11, 26));
        ruleBook.setCycleNo(8);


        GroupBalance groupBalance = this.ruleBookService.convertToGroupBalance(ruleBook);

        assertTrue(groupBalance.getGroupMasterId() == ruleBook.getGroupMasterId());
        assertTrue(groupBalance.getAmtShareFacBal() == ruleBook.getAmtShareFacBal());
        assertTrue(groupBalance.getAmtShareFacBalOthers() == ruleBook.getAmtShareFacBalOthers());
        assertTrue(groupBalance.getAmtMiscDr() == ruleBook.getAmtMiscDr());
        assertTrue(groupBalance.getDatLastMeeting() == (ruleBook.getDatLastMeeting()));
        assertTrue(groupBalance.getCycleNo() == (ruleBook.getCycleNo()));
        assertTrue(groupBalance.getDatNextMeeting() == (ruleBook.getDatNextMeeting()));
    }


}



