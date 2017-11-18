package com.groupmicrofin.admin.common;

public enum MeetFrequency {

    MONTHLY(1), BIMONTHLY(2), QUATERLY(3), HALFYEARLY(4), YEARLY(5);
    //MeetFrequency MONTHLY = new MeetFrequency(1);

    public int value;

    MeetFrequency(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
