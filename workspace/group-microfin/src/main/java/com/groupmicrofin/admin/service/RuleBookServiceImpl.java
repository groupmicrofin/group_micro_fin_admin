package com.groupmicrofin.admin.service;

import com.groupmicrofin.admin.model.*;
import com.groupmicrofin.admin.model.rule.RuleBook;
import com.groupmicrofin.admin.repository.*;

public class RuleBookServiceImpl implements RuleBookService {

    private GroupMasterRepository groupMasterRepository;
    private GroupParamRepository groupParamRepository;
    private GroupBalanceRepository groupBalanceRepository;
    private GrpTxnLogRepository grpTxnLogRepository;
    //TODO group txn log repository.

    public RuleBookServiceImpl(){
        groupMasterRepository = new GroupMasterRepositoryMSImpl();
        groupBalanceRepository = new GroupBalanceRepositoryMSImpl();
        groupParamRepository = new GroupParamRepositoryMSImpl();
        grpTxnLogRepository=new GrpTxnLogRepositoryMSImpl();

    }

    @Override
    public void addRuleBookToGroup(RuleBook ruleBook) {

       // GroupMaster groupMaster = groupMasterRepository.findGroupMasterById(ruleBook.getGroupMasterId());
        GroupParam groupParam = convertToGroupParam(ruleBook);
        //TODO system generated fields required to be updated in groupParam
        groupParamRepository.addGroupParam(groupParam);

        GroupBalance groupBalance = convertToGroupBalance(ruleBook);
        /* TODO system generated fields required to be updated in groupParam */
        groupBalanceRepository.addGroupBalance(groupBalance);

        GrpTxnLog grpTxnLog = convertToGrpTxnLog(ruleBook);
        //TODO system generated fields required to be updated in groupParam
        grpTxnLogRepository.addGrpTxnLog(grpTxnLog);
    }

/*for group param*/
    protected GroupParam convertToGroupParam(RuleBook ruleBook){
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
    protected GroupBalance convertToGroupBalance(RuleBook ruleBook){
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

