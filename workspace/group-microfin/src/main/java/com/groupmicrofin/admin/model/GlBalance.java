package com.groupmicrofin.admin.model;

import java.time.LocalDate;

public class GlBalance {
    private int groupMasterId;
    private int cycleNo;
    private int cashBalance;
    private int assetBalance;
    private int liabBalance;
    private int incBalance;
    private int expBalance;
    private LocalDate datLastMnt;

    public int getGroupMasterId() {
        return groupMasterId;
    }

    public void setGroupMasterId(int groupMasterId) {
        this.groupMasterId = groupMasterId;
    }

    public int getCycleNo() {
        return cycleNo;
    }

    public void setCycleNo(int cycleNo) {
        this.cycleNo = cycleNo;
    }

    public int getCashBalance() {
        return cashBalance;
    }

    public void setCashBalance(int cashBalance) {
        this.cashBalance = cashBalance;
    }

    public int getAssetBalance() {
        return assetBalance;
    }

    public void setAssetBalance(int assetBalance) {
        this.assetBalance = assetBalance;
    }

    public int getLiabBalance() {
        return liabBalance;
    }

    public void setLiabBalance(int liabBalance) {
        this.liabBalance = liabBalance;
    }

    public int getIncBalance() {
        return incBalance;
    }

    public void setIncBalance(int incBalance) {
        this.incBalance = incBalance;
    }

    public int getExpBalance() {
        return expBalance;
    }

    public void setExpBalance(int expBalance) {
        this.expBalance = expBalance;
    }

    public LocalDate getDatLastMnt() {
        return datLastMnt;
    }

    public void setDatLastMnt(LocalDate datLastMnt) {
        this.datLastMnt = datLastMnt;
    }
}
