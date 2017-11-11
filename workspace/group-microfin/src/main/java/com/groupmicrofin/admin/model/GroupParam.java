package com.groupmicrofin.admin.model;



import java.time.LocalDate;
import java.time.LocalDateTime;

public class GroupParam
{
    private int id;
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
    private String assessmentYear;
    private int amtRoundingDecDigits;
    private LocalDateTime auditCreatedDttm;
    private LocalDateTime auditUpdatedDttm;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getAssessmentYear() {
        return assessmentYear;
    }

    public void setAssessmentYear(String assesmentYear) {
        this.assessmentYear = assesmentYear;
    }

    public int getAmtRoundingDecDigits() {
        return amtRoundingDecDigits;
    }

    public void setAmtRoundingDecDigits(int amtRoundingDecDigits) {
        this.amtRoundingDecDigits = amtRoundingDecDigits;
    }

    public LocalDateTime getAuditCreatedDttm() {
        return auditCreatedDttm;
    }

    public void setAuditCreatedDttm(LocalDateTime auditCreatedDttm) {
        this.auditCreatedDttm = auditCreatedDttm;
    }

    public LocalDateTime getAuditUpdatedDttm() {
        return auditUpdatedDttm;
    }

    public void setAuditUpdatedDttm(LocalDateTime auditUpdatedDttm) {
        this.auditUpdatedDttm = auditUpdatedDttm;
    }

}
