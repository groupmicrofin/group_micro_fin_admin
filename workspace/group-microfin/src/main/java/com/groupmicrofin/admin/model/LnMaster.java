package com.groupmicrofin.admin.model;

import java.time.LocalDate;

public class LnMaster {
    private int id;
    private int groupMasterId;
    private int groupMemberId;
    private String assessmentYear;
    private int cycleNo;
    private int amtLnDisb;
    private int amtDefInstallment;
    private LocalDate datLnDisb;
    private String garunterIids;

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

    public int getGroupMemberId() {
        return groupMemberId;
    }

    public void setGroupMemberId(int groupMemberId) {
        this.groupMemberId = groupMemberId;
    }

    public String getAssessmentYear() {
        return assessmentYear;
    }

    public void setAssessmentYear(String assessmentYear) {
        this.assessmentYear = assessmentYear;
    }

    public int getCycleNo() {
        return cycleNo;
    }

    public void setCycleNo(int cycleNo) {
        this.cycleNo = cycleNo;
    }

    public int getAmtLnDisb() {
        return amtLnDisb;
    }

    public void setAmtLnDisb(int amtLnDisb) {
        this.amtLnDisb = amtLnDisb;
    }

    public int getAmtDefInstallment() {
        return amtDefInstallment;
    }

    public void setAmtDefInstallment(int amtDefInstallment) {
        this.amtDefInstallment = amtDefInstallment;
    }

    public LocalDate getDatLnDisb() {
        return datLnDisb;
    }

    public void setDatLnDisb(LocalDate datLnDisb) {
        this.datLnDisb = datLnDisb;
    }

    public String getGarunterIids() {
        return garunterIids;
    }

    public void setGarunterIids(String garunterIids) {
        this.garunterIids = garunterIids;
    }
}
