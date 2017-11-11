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
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
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
