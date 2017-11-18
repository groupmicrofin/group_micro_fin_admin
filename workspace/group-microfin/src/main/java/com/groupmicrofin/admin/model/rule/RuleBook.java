package com.groupmicrofin.admin.model.rule;

import java.time.LocalDate;

public class RuleBook {
    private int groupMasterId;
    private LocalDate groupStartDt;
    private int meetingFrequency;
    private String meetingSchedule;
    private LocalDate datLastMeeting;
    private int yearEndMonth;
    private float shareFaceValue;
    private float lnIntRate;
    private int lnIntBase;
    public int cycleNo;
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
    private LocalDate datNextMeeting;
    private String lastActivityStatus;

    public String getLastActivityStatus() {
        return this.lastActivityStatus;
    }

    public void setLastActivityStatus(String lastActivityStatus) {
        this.lastActivityStatus = lastActivityStatus;
    }

    public LocalDate getDatNextMeeting() {
        return this.datNextMeeting;
    }

    public void setDatNextMeeting(LocalDate datNextMeeting) {
        this.datNextMeeting = datNextMeeting;
    }

    public int getGroupMasterId() {
        return this.groupMasterId;
    }

    public void setGroupMasterId(int groupMasterId) {
        this.groupMasterId = groupMasterId;
    }

    public LocalDate getGroupStartDt() {
        return this.groupStartDt;
    }

    public void setGroupStartDt(LocalDate groupStartDt) {
        this.groupStartDt = groupStartDt;
    }

    public int getMeetingFrequency() {
        return this.meetingFrequency;
    }

    public void setMeetingFrequency(int meetingFrequency) {
        this.meetingFrequency = meetingFrequency;
    }

    public String getMeetingSchedule() {
        return this.meetingSchedule;
    }

    public void setMeetingSchedule(String meetingSchedule) {
        this.meetingSchedule = meetingSchedule;
    }

    public int getYearEndMonth() {
        return this.yearEndMonth;
    }

    public void setYearEndMonth(int yearEndMonth) {
        this.yearEndMonth = yearEndMonth;
    }

    public float getShareFaceValue() {
        return this.shareFaceValue;
    }

    public void setShareFaceValue(float shareFaceValue) {
        this.shareFaceValue = shareFaceValue;
    }

    public float getLnIntRate() {
        return this.lnIntRate;
    }

    public void setLnIntRate(float lnIntRate) {
        this.lnIntRate = lnIntRate;
    }

    public int getLnIntBase() {
        return this.lnIntBase;
    }

    public void setLnIntBase(int lnIntBase) {
        this.lnIntBase = lnIntBase;
    }

    public float getLnDisbAmtMaxLimPercent() {
        return this.lnDisbAmtMaxLimPercent;
    }

    public void setLnDisbAmtMaxLimPercent(float lnDisbAmtMaxLimPercent) {
        this.lnDisbAmtMaxLimPercent = lnDisbAmtMaxLimPercent;
    }

    public int getLnMaxActiveLoanCount() {
        return this.lnMaxActiveLoanCount;
    }

    public void setLnMaxActiveLoanCount(int lnMaxActiveLoanCount) {
        this.lnMaxActiveLoanCount = lnMaxActiveLoanCount;
    }

    public int getLnGaurantersCount() {
        return this.lnGaurantersCount;
    }

    public void setLnGaurantersCount(int lnGaurantersCount) {
        this.lnGaurantersCount = lnGaurantersCount;
    }

    public int getLnMaxInstallmentCount() {
        return this.lnMaxInstallmentCount;
    }

    public void setLnMaxInstallmentCount(int lnMaxInstallmentCount) {
        this.lnMaxInstallmentCount = lnMaxInstallmentCount;
    }

    public double getFeeAmtNoSharePayout() {
        return this.feeAmtNoSharePayout;
    }

    public void setFeeAmtNoSharePayout(double feeAmtNoSharePayout) {
        this.feeAmtNoSharePayout = feeAmtNoSharePayout;
    }

    public int getFeeWaiverNoCycles() {
        return this.feeWaiverNoCycles;
    }

    public void setFeeWaiverNoCycles(int feeWaiverNoCycles) {
        this.feeWaiverNoCycles = feeWaiverNoCycles;
    }

    public int getAmtRoundingDecDigits() {
        return this.amtRoundingDecDigits;
    }

    public void setAmtRoundingDecDigits(int amtRoundingDecDigits) {
        this.amtRoundingDecDigits = amtRoundingDecDigits;
    }

    public int getAmtShareFacBal() {
        return this.amtShareFacBal;
    }

    public void setAmtShareFacBal(int amtShareFacBal) {
        this.amtShareFacBal = amtShareFacBal;
    }

    public int getAmtShareFacBalOthers() {
        return this.amtShareFacBalOthers;
    }

    public void setAmtShareFacBalOthers(int amtShareFacBalOthers) {
        this.amtShareFacBalOthers = amtShareFacBalOthers;
    }

    public int getAmtMiscDr() {
        return this.amtMiscDr;
    }

    public void setAmtMiscDr(int amtMiscDr) {
        this.amtMiscDr = amtMiscDr;
    }

    public LocalDate getDatLastMeeting() {
        return this.datLastMeeting;
    }

    public void setDatLastMeeting(LocalDate datLastMeeting) {
        this.datLastMeeting = datLastMeeting;
    }

    public int getCycleNo() {
        return this.cycleNo;
    }

    public void setCycleNo(int cycleNo) {
        this.cycleNo = cycleNo;
    }
}


