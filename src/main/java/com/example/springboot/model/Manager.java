package com.example.springboot.model;

import java.util.Date;

public class Manager {
    private Integer managerId;

    private String managerName;

    private String managerAccount;

    private String managerPassword;

    private String managerPhone;

    private String managerMail;

    private String managerLevel;

    private Date managerLatestOperationDate;

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName == null ? null : managerName.trim();
    }

    public String getManagerAccount() {
        return managerAccount;
    }

    public void setManagerAccount(String managerAccount) {
        this.managerAccount = managerAccount == null ? null : managerAccount.trim();
    }

    public String getManagerPassword() {
        return managerPassword;
    }

    public void setManagerPassword(String managerPassword) {
        this.managerPassword = managerPassword == null ? null : managerPassword.trim();
    }

    public String getManagerPhone() {
        return managerPhone;
    }

    public void setManagerPhone(String managerPhone) {
        this.managerPhone = managerPhone == null ? null : managerPhone.trim();
    }

    public String getManagerMail() {
        return managerMail;
    }

    public void setManagerMail(String managerMail) {
        this.managerMail = managerMail == null ? null : managerMail.trim();
    }

    public String getManagerLevel() {
        return managerLevel;
    }

    public void setManagerLevel(String managerLevel) {
        this.managerLevel = managerLevel == null ? null : managerLevel.trim();
    }

    public Date getManagerLatestOperationDate() {
        return managerLatestOperationDate;
    }

    public void setManagerLatestOperationDate(Date managerLatestOperationDate) {
        this.managerLatestOperationDate = managerLatestOperationDate;
    }
}