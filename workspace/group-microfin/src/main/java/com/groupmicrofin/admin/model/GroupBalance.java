package com.groupmicrofin.admin.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class GroupBalance {
    private int id;
    private int groupMasterId;
    private String assessmentYear;
    private int amtShareFacBal;
    private int amtShareFacBalOthers;
    private int cycleNo;
    private int amtMiscDr;
    private LocalDate datLastMeeting;
    private LocalDate datNextMeeting;
    private String lastActivityStatus;
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

    public String getAssessmentYear() {
        return assessmentYear;
    }

    public void setAssessmentYear(String assessmentYear) {
        this.assessmentYear = assessmentYear;
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

    public int getCycleNo() {
        return cycleNo;
    }

    public void setCycleNo(int cycleNo) {
        this.cycleNo = cycleNo;
    }

    public int getAmtMiscDr() {
        return amtMiscDr;
    }

    public void setAmtMiscDr(int amtMiscDr) {
        this.amtMiscDr = amtMiscDr;
    }

    public LocalDate getDatLastMeeting() {
        return datLastMeeting;
    }

    public void setDatLastMeeting(LocalDate datLastMeeting) {
        this.datLastMeeting = datLastMeeting;
    }

    public LocalDate getDatNextMeeting() {
        return datNextMeeting;
    }

    public void setDatNextMeeting(LocalDate datNextMeeting) {
        this.datNextMeeting = datNextMeeting;
    }

    public String getLastActivityStatus(String value_changed) {
        return lastActivityStatus;
    }

    public void setLastActivityStatus(String lastActivityStatus) {
        this.lastActivityStatus = lastActivityStatus;
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
