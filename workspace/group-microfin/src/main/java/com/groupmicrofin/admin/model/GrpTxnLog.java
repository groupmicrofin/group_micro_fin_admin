package com.groupmicrofin.admin.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class GrpTxnLog
{
    private int groupMasterId;
    private int cycleNo;
    private String eventName;
    private int groupMemberId;
    private String mntChngDetails;
    private int txnAmt;
    private int txnAmtOther;
    private LocalDateTime datTxn;
    private String Fucolmn1;

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

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public int getGroupMemberId() {
        return groupMemberId;
    }

    public void setGroupMemberId(int groupMemberId) {
        this.groupMemberId = groupMemberId;
    }

    public String getMntChngDetails() {
        return mntChngDetails;
    }

    public void setMntChngDetails(String mntChngDetails) {
        this.mntChngDetails = mntChngDetails;
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

    public LocalDateTime getDatTxn() {
        return datTxn;
    }

    public void setDatTxn(LocalDateTime datTxn) {
        this.datTxn = datTxn;
    }

    public String getFucolmn1() {
        return Fucolmn1;
    }

    public void setFucolmn1(String fucolmn1) {
        Fucolmn1 = fucolmn1;
    }






}
