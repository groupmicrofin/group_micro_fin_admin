package com.groupmicrofin.admin.service;

import com.groupmicrofin.admin.model.GroupBalance;
import com.groupmicrofin.admin.model.GroupParam;
import com.groupmicrofin.admin.model.rule.RuleBook;
import com.groupmicrofin.admin.repository.*;
import com.groupmicrofin.util.GroupCalculator;

import java.time.LocalDate;

public class RuleBookServiceImpl implements RuleBookService {

    private final GroupMasterRepository groupMasterRepository;
    private final GroupParamRepository groupParamRepository;
    private final GroupBalanceRepository groupBalanceRepository;
    private final GrpTxnLogRepository grpTxnLogRepository;

    public RuleBookServiceImpl() {

        this.groupMasterRepository = new GroupMasterRepositoryMSImpl();
        this.groupBalanceRepository = new GroupBalanceRepositoryMSImpl();
        this.groupParamRepository = new GroupParamRepositoryMSImpl();
        this.grpTxnLogRepository = new GrpTxnLogRepositoryMSImpl();

    }

    @Override
    public void addRuleBookToGroup(RuleBook ruleBook) {
        GroupParam groupParam = convertToGroupParam(ruleBook);
        GroupBalance groupBalance = convertToGroupBalance(ruleBook);
        int assessmentYear = GroupCalculator.getAssessmentYears(ruleBook.getGroupStartDt(), ruleBook.getDatLastMeeting(), ruleBook.getYearEndMonth());
        groupParam.setAssessmentYear(String.valueOf(assessmentYear));
        this.groupParamRepository.addGroupParam(groupParam);
        int cycleNo = GroupCalculator.calculateNoOfCycles(ruleBook.getGroupStartDt(), ruleBook.getDatLastMeeting(), ruleBook.getMeetingFrequency());
        groupBalance.setCycleNo(cycleNo);
        groupBalance.setAssessmentYear(String.valueOf(assessmentYear));
        LocalDate datNextMeeting = GroupCalculator.getNextMeetingDateForWeekDay(ruleBook.getDatLastMeeting(), 1);
        groupBalance.setDatNextMeeting(datNextMeeting);
        int amtShareFacBal = GroupCalculator.calculateAmtShareFaceBal((int) ruleBook.getShareFaceValue(), ruleBook.getCycleNo());
        groupBalance.setAmtShareFacBal(amtShareFacBal);
        String lastActivityStatus = GroupCalculator.getLastActivityStatus();
        groupBalance.setLastActivityStatus(lastActivityStatus);
        this.groupBalanceRepository.addGroupBalance(groupBalance);


    }

    GroupBalanceRepository getGroupBalanceRepository() {
        return this.groupBalanceRepository;
    }

    public GroupParam convertToGroupParam(RuleBook ruleBook) {
        GroupParam groupParam = new GroupParam();

        groupParam.setGroupMasterId(ruleBook.getGroupMasterId());
        groupParam.setGroupStartDt(ruleBook.getGroupStartDt());
        groupParam.setMeetingFrequency(ruleBook.getMeetingFrequency());
        groupParam.setMeetingSchedule(ruleBook.getMeetingSchedule());
        groupParam.setYearEndMonth(ruleBook.getYearEndMonth());
        groupParam.setShareFaceValue(ruleBook.getShareFaceValue());
        groupParam.setLnIntRate(ruleBook.getLnIntRate());
        groupParam.setLnIntBase(ruleBook.getLnIntBase());
        groupParam.setLnDisbAmtMaxLimPercent(ruleBook.getLnDisbAmtMaxLimPercent());
        groupParam.setLnMaxActiveLoanCount(ruleBook.getLnMaxActiveLoanCount());
        groupParam.setLnGaurantersCount(ruleBook.getLnGaurantersCount());
        groupParam.setLnMaxInstallmentCount(ruleBook.getLnMaxInstallmentCount());
        groupParam.setFeeAmtNoSharePayout(ruleBook.getFeeAmtNoSharePayout());
        groupParam.setFeeWaiverNoCycles(ruleBook.getFeeWaiverNoCycles());
        groupParam.setAmtRoundingDecDigits(ruleBook.getAmtRoundingDecDigits());

        return groupParam;
    }

    public GroupBalance convertToGroupBalance(RuleBook ruleBook) {
        GroupBalance groupBalance = new GroupBalance();

        groupBalance.setGroupMasterId(ruleBook.getGroupMasterId());
        groupBalance.setAmtShareFacBal(ruleBook.getAmtShareFacBal());
        groupBalance.setAmtShareFacBalOthers(ruleBook.getAmtShareFacBalOthers());
        groupBalance.setAmtMiscDr(ruleBook.getAmtMiscDr());
        groupBalance.setDatLastMeeting(ruleBook.getDatLastMeeting());
        groupBalance.setDatNextMeeting(ruleBook.getDatNextMeeting());
        groupBalance.setCycleNo(ruleBook.getCycleNo());

        return groupBalance;
    }
}
