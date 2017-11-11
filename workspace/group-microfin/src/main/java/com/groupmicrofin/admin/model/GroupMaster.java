package com.groupmicrofin.admin.model;

import java.time.LocalDateTime;

public class GroupMaster {

    private int id;
    private String name;
    private String country;
    private String town;
    private String pincode;
    private String loginId;
    private String email;
    private String password;
    private LocalDateTime auditCreatedDttm;
    private LocalDateTime auditUpdatedDttm;


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTown() {
        return this.town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getPincode() {
        return this.pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getLoginId() {
        return this.loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getAuditCreatedDttm() {
        return this.auditCreatedDttm;
    }

    public void setAuditCreatedDttm(LocalDateTime auditCreatedDttm) {
        this.auditCreatedDttm = auditCreatedDttm;
    }

    public LocalDateTime getAuditUpdatedDttm() {
        return this.auditUpdatedDttm;
    }

    public void setAuditUpdatedDttm(LocalDateTime auditUpdatedDttm) {
        this.auditUpdatedDttm = auditUpdatedDttm;
    }

    @Override
    public String toString() {
        return "GroupMaster{" +
                "id=" + this.id +
                ", name='" + this.name + '\'' +
                ", country='" + this.country + '\'' +
                ", town='" + this.town + '\'' +
                ", pincode='" + this.pincode + '\'' +
                ", loginId='" + this.loginId + '\'' +
                ", email='" + this.email + '\'' +
                ", auditCreatedDttm=" + this.auditCreatedDttm +
                ", auditUpdatedDttm=" + this.auditUpdatedDttm +
                '}';
    }
}
