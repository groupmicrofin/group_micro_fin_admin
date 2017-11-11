package com.groupmicrofin.admin.model;

import java.time.LocalDate;

public class LnInstallment {
    private int id;
    private int groupMasterId;
    private int groupMemberId;
    private String assessmentYear;
    private int cycleNo;
    private int amtLnDisb;
    private int amtLnBalance;
    private int noActiveLn;
    private int amtPaidInt;
    private int amtPaidPrinc;
    private int amtDefInstallment;
    private LocalDate datLastLnDisb;
    private LocalDate datInstallments;

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

    public int getAmtLnBalance() {
        return amtLnBalance;
    }

    public void setAmtLnBalance(int amtLnBalance) {
        this.amtLnBalance = amtLnBalance;
    }

    public int getNoActiveLn() {
        return noActiveLn;
    }

    public void setNoActiveLn(int noActiveLn) {
        this.noActiveLn = noActiveLn;
    }

    public int getAmtPaidInt() {
        return amtPaidInt;
    }

    public void setAmtPaidInt(int amtPaidInt) {
        this.amtPaidInt = amtPaidInt;
    }

    public int getAmtPaidPrinc() {
        return amtPaidPrinc;
    }

    public void setAmtPaidPrinc(int amtPaidPrinc) {
        this.amtPaidPrinc = amtPaidPrinc;
    }

    public int getAmtDefInstallment() {
        return amtDefInstallment;
    }

    public void setAmtDefInstallment(int amtDefInstallment) {
        this.amtDefInstallment = amtDefInstallment;
    }

    public LocalDate getDatLastLnDisb() {
        return datLastLnDisb;
    }

    public void setDatLastLnDisb(LocalDate datLastLnDisb) {
        this.datLastLnDisb = datLastLnDisb;
    }

    public LocalDate getDatInstallments() {
        return datInstallments;
    }

    public void setDatInstallments(LocalDate datInstallments) {
        this.datInstallments = datInstallments;
    }
}


