package com.groupmicrofin.admin.model;

import java.time.LocalDate;

public class GroupMember {

    private int id;
    private int groupMasterId;
    private String assessmentYear;
    private String name;
    private String loginId;
    private String email;
    private String password;
    private int mobileNo;
    private LocalDate birthDate;
    private String kycId;
    private int cycleNo;
    private int amtPendShare;
    private int amtPaidFee;
    private int amtLnDisb;
    private int amtLnBalance;
    private int noActiveLn;
    private int amtAccrInt;
    private int amtPaidInt;
    private int amtPaidPrinc;
    private int amtDefInstallment;
    private int datLastLnDisb;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(int mobileNo) {
        this.mobileNo = mobileNo;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getKycId() {
        return kycId;
    }

    public void setKycId(String kycId) {
        this.kycId = kycId;
    }

    public int getCycleNo() {
        return cycleNo;
    }

    public void setCycleNo(int cycleNo) {
        this.cycleNo = cycleNo;
    }

    public int getAmtPendShare() {
        return amtPendShare;
    }

    public void setAmtPendShare(int amtPendShare) {
        this.amtPendShare = amtPendShare;
    }

    public int getAmtPaidFee() {
        return amtPaidFee;
    }

    public void setAmtPaidFee(int amtPaidFee) {
        this.amtPaidFee = amtPaidFee;
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

    public int getAmtAccrInt() {
        return amtAccrInt;
    }

    public void setAmtAccrInt(int amtAccrInt) {
        this.amtAccrInt = amtAccrInt;
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

    public int getDatLastLnDisb() {
        return datLastLnDisb;
    }

    public void setDatLastLnDisb(int datLastLnDisb) {
        this.datLastLnDisb = datLastLnDisb;
    }
}
