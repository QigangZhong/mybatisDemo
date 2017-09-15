package com.qigang.model;

import java.util.Date;

public class CustomerLoginLog {
    private int SysNo;
    private int LoginType;
    private int LoginBranchType;
    private String LoginIP;
    private int CustomerSysNo;
    private Date CreateDate;
    private String Note;
    private String UniqueUserKey;
    private int UserActionType;
    private String CPSDes;
    private int CheckCount;
    private String DeviceId;
    private int CitySysNo;
    private String PhoneModel;

    public int getSysNo() {
        return SysNo;
    }

    public void setSysNo(int sysNo) {
        SysNo = sysNo;
    }

    public int getLoginType() {
        return LoginType;
    }

    public void setLoginType(int loginType) {
        LoginType = loginType;
    }

    public int getLoginBranchType() {
        return LoginBranchType;
    }

    public void setLoginBranchType(int loginBranchType) {
        LoginBranchType = loginBranchType;
    }

    public String getLoginIP() {
        return LoginIP;
    }

    public void setLoginIP(String loginIP) {
        LoginIP = loginIP;
    }

    public int getCustomerSysNo() {
        return CustomerSysNo;
    }

    public void setCustomerSysNo(int customerSysNo) {
        CustomerSysNo = customerSysNo;
    }

    public Date getCreateDate() {
        return CreateDate;
    }

    public void setCreateDate(Date createDate) {
        CreateDate = createDate;
    }

    public String getNote() {
        return Note;
    }

    public void setNote(String note) {
        Note = note;
    }

    public String getUniqueUserKey() {
        return UniqueUserKey;
    }

    public void setUniqueUserKey(String uniqueUserKey) {
        UniqueUserKey = uniqueUserKey;
    }

    public int getUserActionType() {
        return UserActionType;
    }

    public void setUserActionType(int userActionType) {
        UserActionType = userActionType;
    }

    public String getCPSDes() {
        return CPSDes;
    }

    public void setCPSDes(String CPSDes) {
        this.CPSDes = CPSDes;
    }

    public int getCheckCount() {
        return CheckCount;
    }

    public void setCheckCount(int checkCount) {
        CheckCount = checkCount;
    }

    public String getDeviceId() {
        return DeviceId;
    }

    public void setDeviceId(String deviceId) {
        DeviceId = deviceId;
    }

    public int getCitySysNo() {
        return CitySysNo;
    }

    public void setCitySysNo(int citySysNo) {
        CitySysNo = citySysNo;
    }

    public String getPhoneModel() {
        return PhoneModel;
    }

    public void setPhoneModel(String phoneModel) {
        PhoneModel = phoneModel;
    }
}
