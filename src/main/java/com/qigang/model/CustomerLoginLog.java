package com.qigang.model;

import java.io.Serializable;
import java.util.Date;

public class CustomerLoginLog implements Serializable {
    private Integer sysno;

    private Integer logintype;

    private Integer loginbranchtype;

    private String loginip;

    private Integer customersysno;

    private Date createdate;

    private String note;

    private String uniqueuserkey;

    private Integer useractiontype;

    private String cpsdes;

    private Integer checkcount;

    private String deviceid;

    private Integer citysysno;

    private String phonemodel;

    private static final long serialVersionUID = 1L;

    public CustomerLoginLog(Integer sysno, Integer logintype, Integer loginbranchtype, String loginip, Integer customersysno, Date createdate, String note, String uniqueuserkey, Integer useractiontype, String cpsdes, Integer checkcount, String deviceid, Integer citysysno, String phonemodel) {
        this.sysno = sysno;
        this.logintype = logintype;
        this.loginbranchtype = loginbranchtype;
        this.loginip = loginip;
        this.customersysno = customersysno;
        this.createdate = createdate;
        this.note = note;
        this.uniqueuserkey = uniqueuserkey;
        this.useractiontype = useractiontype;
        this.cpsdes = cpsdes;
        this.checkcount = checkcount;
        this.deviceid = deviceid;
        this.citysysno = citysysno;
        this.phonemodel = phonemodel;
    }

    public CustomerLoginLog() {
        super();
    }

    public Integer getSysno() {
        return sysno;
    }

    public void setSysno(Integer sysno) {
        this.sysno = sysno;
    }

    public Integer getLogintype() {
        return logintype;
    }

    public void setLogintype(Integer logintype) {
        this.logintype = logintype;
    }

    public Integer getLoginbranchtype() {
        return loginbranchtype;
    }

    public void setLoginbranchtype(Integer loginbranchtype) {
        this.loginbranchtype = loginbranchtype;
    }

    public String getLoginip() {
        return loginip;
    }

    public void setLoginip(String loginip) {
        this.loginip = loginip == null ? null : loginip.trim();
    }

    public Integer getCustomersysno() {
        return customersysno;
    }

    public void setCustomersysno(Integer customersysno) {
        this.customersysno = customersysno;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public String getUniqueuserkey() {
        return uniqueuserkey;
    }

    public void setUniqueuserkey(String uniqueuserkey) {
        this.uniqueuserkey = uniqueuserkey == null ? null : uniqueuserkey.trim();
    }

    public Integer getUseractiontype() {
        return useractiontype;
    }

    public void setUseractiontype(Integer useractiontype) {
        this.useractiontype = useractiontype;
    }

    public String getCpsdes() {
        return cpsdes;
    }

    public void setCpsdes(String cpsdes) {
        this.cpsdes = cpsdes == null ? null : cpsdes.trim();
    }

    public Integer getCheckcount() {
        return checkcount;
    }

    public void setCheckcount(Integer checkcount) {
        this.checkcount = checkcount;
    }

    public String getDeviceid() {
        return deviceid;
    }

    public void setDeviceid(String deviceid) {
        this.deviceid = deviceid == null ? null : deviceid.trim();
    }

    public Integer getCitysysno() {
        return citysysno;
    }

    public void setCitysysno(Integer citysysno) {
        this.citysysno = citysysno;
    }

    public String getPhonemodel() {
        return phonemodel;
    }

    public void setPhonemodel(String phonemodel) {
        this.phonemodel = phonemodel == null ? null : phonemodel.trim();
    }
}