package com.groupmicrofin.admin.model.rule;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class RuleBook {
    private int groupMasterId;
    private LocalDate groupStartDt;
    private int meetingFrequency;
    private String meetingSchedule;
    private int yearEndMonth;
    private float shareFaceValue;
    private float lnIntRate;
    private int lnIntBase;
    private float lnDisbAmtMaxLimPercent;
    private int lnMaxActiveLoanCount;
    private int lnGaurantersCount;
    private int lnMaxInstallmentCount;
    private double feeAmtNoSharePayout;
    private int feeWaiverNoCycles;
    private int amtRoundingDecDigits;
    private int amtShareFacBal;
    private int amtShareFacBalOthers;
    private int amtMiscDr;
    private int groupMemberId;
    private String eventName;
    private int txnAmt;
    private int txnAmtOther;

    public int getGroupMasterId() {
        return groupMasterId;
    }

    public void setGroupMasterId(int groupMasterId) {
        this.groupMasterId = groupMasterId;
    }

    public LocalDate getGroupStartDt() {
        return groupStartDt;
    }

    public void setGroupStartDt(LocalDate groupStartDt) {
        this.groupStartDt = groupStartDt;
    }

    public int getMeetingFrequency() {
        return meetingFrequency;
    }

    public void setMeetingFrequency(int meetingFrequency) {
        this.meetingFrequency = meetingFrequency;
    }

    public String getMeetingSchedule() {
        return meetingSchedule;
    }

    public void setMeetingSchedule(String meetingSchedule) {
        this.meetingSchedule = meetingSchedule;
    }

    public int getYearEndMonth() {
        return yearEndMonth;
    }

    public void setYearEndMonth(int yearEndMonth) {
        this.yearEndMonth = yearEndMonth;
    }

    public float getShareFaceValue() {
        return shareFaceValue;
    }

    public void setShareFaceValue(float shareFaceValue) {
        this.shareFaceValue = shareFaceValue;
    }

    public float getLnIntRate() {
        return lnIntRate;
    }

    public void setLnIntRate(float lnIntRate) {
        this.lnIntRate = lnIntRate;
    }

    public int getLnIntBase() {
        return lnIntBase;
    }

    public void setLnIntBase(int lnIntBase) {
        this.lnIntBase = lnIntBase;
    }

    public float getLnDisbAmtMaxLimPercent() {
        return lnDisbAmtMaxLimPercent;
    }

    public void setLnDisbAmtMaxLimPercent(float lnDisbAmtMaxLimPercent) {
        this.lnDisbAmtMaxLimPercent = lnDisbAmtMaxLimPercent;
    }

    public int getLnMaxActiveLoanCount() {
        return lnMaxActiveLoanCount;
    }

    public void setLnMaxActiveLoanCount(int lnMaxActiveLoanCount) {
        this.lnMaxActiveLoanCount = lnMaxActiveLoanCount;
    }

    public int getLnGaurantersCount() {
        return lnGaurantersCount;
    }

    public void setLnGaurantersCount(int lnGaurantersCount) {
        this.lnGaurantersCount = lnGaurantersCount;
    }

    public int getLnMaxInstallmentCount() {
        return lnMaxInstallmentCount;
    }

    public void setLnMaxInstallmentCount(int lnMaxInstallmentCount) {
        this.lnMaxInstallmentCount = lnMaxInstallmentCount;
    }

    public double getFeeAmtNoSharePayout() {
        return feeAmtNoSharePayout;
    }

    public void setFeeAmtNoSharePayout(double feeAmtNoSharePayout) {
        this.feeAmtNoSharePayout = feeAmtNoSharePayout;
    }

    public int getFeeWaiverNoCycles() {
        return feeWaiverNoCycles;
    }

    public void setFeeWaiverNoCycles(int feeWaiverNoCycles) {
        this.feeWaiverNoCycles = feeWaiverNoCycles;
    }

    public int getAmtRoundingDecDigits() {
        return amtRoundingDecDigits;
    }

    public void setAmtRoundingDecDigits(int amtRoundingDecDigits) {
        this.amtRoundingDecDigits = amtRoundingDecDigits;
    }

    public int getAmtShareFacBal() {
        return amtShareFacBal;
    }

    public void setAmtShareFacBal(int amtShareFacBal) {
        this.amtShareFacBal = amtShareFacBal;
    }

    public int getAmtShareFacBalOthers() {
        return amtShareFacBalOthers;
    }

    public void setAmtShareFacBalOthers(int amtShareFacBalOthers) {
        this.amtShareFacBalOthers = amtShareFacBalOthers;
    }

    public int getAmtMiscDr() {
        return amtMiscDr;
    }

    public void setAmtMiscDr(int amtMiscDr) {
        this.amtMiscDr = amtMiscDr;
    }


    public int getGroupMemberId() {
        return groupMemberId;
    }

    public void setGroupMemberId(int groupMemberId) {
        this.groupMemberId = groupMemberId;
    }
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
    public int getTxnAmt() {
        return txnAmt;
    }

    public void setTxnAmt(int txnAmt) {
        this.txnAmt = txnAmt;
    }

    public int getTxnAmtOther() {
        return txnAmtOther;
    }

    public void setTxnAmtOther(int txnAmtOther) {
        this.txnAmtOther = txnAmtOther;
    }
}
