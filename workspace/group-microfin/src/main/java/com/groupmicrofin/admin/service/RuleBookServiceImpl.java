package com.groupmicrofin.admin.service;

import com.groupmicrofin.admin.model.GroupBalance;
import com.groupmicrofin.admin.model.GroupParam;
import com.groupmicrofin.admin.model.GrpTxnLog;
import com.groupmicrofin.admin.model.rule.RuleBook;
import com.groupmicrofin.admin.repository.*;

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

        // GroupMaster groupMaster = groupMasterRepository.findGroupMasterById(ruleBook.getGroupMasterId());
        GroupParam groupParam = convertToGroupParam(ruleBook);
        int assessmentYears = getAssessmentYears(ruleBook.getGroupStartDt(), ruleBook.getLastMeetingDate(), ruleBook.getYearEndMonth());
        groupParam.setAssessmentYear(String.valueOf(assessmentYears));
        this.groupParamRepository.addGroupParam(groupParam);

        /*GroupBalance groupBalance = convertToGroupBalance(ruleBook);
        *//* TODO system generated fields required to be updated in groupParam *//*
        this.groupBalanceRepository.addGroupBalance(groupBalance);

        GrpTxnLog grpTxnLog = convertToGrpTxnLog(ruleBook);
        //TODO system generated fields required to be updated in groupParam
        this.grpTxnLogRepository.addGrpTxnLog(grpTxnLog);*/
    }


    public int getAssessmentYears(LocalDate grpStartDate, LocalDate lastMeetingDate, int yearEndMonth) {
        int totalAssessmentYears = 0;
        int startYear = grpStartDate.getYear();
        int lastMeetingYear = lastMeetingDate.getYear();
        int lastMeetingMonth = lastMeetingDate.getMonthValue();
        totalAssessmentYears = (lastMeetingYear - startYear) + 1;
        if (lastMeetingMonth > yearEndMonth) {
            totalAssessmentYears = totalAssessmentYears + 1;
        }
        return totalAssessmentYears;
    }

    /*for group param*/
    protected GroupParam convertToGroupParam(RuleBook ruleBook) {
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

    /*for group balance*/
    protected GroupBalance convertToGroupBalance(RuleBook ruleBook) {
        GroupBalance groupBalance = new GroupBalance();
        groupBalance.setGroupMasterId(ruleBook.getGroupMasterId());
        groupBalance.setAmtShareFacBal(ruleBook.getAmtShareFacBal());
        groupBalance.setAmtShareFacBalOthers(ruleBook.getAmtShareFacBalOthers());
        groupBalance.setAmtMiscDr(ruleBook.getAmtMiscDr());

        return groupBalance;
    }

    /*for grptxnlog*/
    protected GrpTxnLog convertToGrpTxnLog(RuleBook ruleBook) {
        GrpTxnLog grpTxnLog = new GrpTxnLog();
        grpTxnLog.setGroupMasterId(ruleBook.getGroupMasterId());
        grpTxnLog.setGroupMemberId(ruleBook.getGroupMemberId());
        grpTxnLog.setEventName(ruleBook.getEventName());
        grpTxnLog.setTxnAmt(ruleBook.getTxnAmt());
        grpTxnLog.setTxnAmtOther(ruleBook.getTxnAmtOther());
        return grpTxnLog;

    }
}

