package com.qigang.model;

import java.io.Serializable;
import java.util.Date;

public class AccountSecurityLog implements Serializable {
    private Integer sysno;

    private Integer customersysno;

    private String cellphone;

    private Integer operationtype;

    private String operationname;

    private Integer loginbranchtype;

    private String loginbranchname;

    private String source;

    private String urlreferrer;

    private String clientip;

    private String note;

    private String uuk;

    private String deviceid;

    private String useragent;

    private Date createtime;

    private static final long serialVersionUID = 1L;

    public AccountSecurityLog(Integer sysno, Integer customersysno, String cellphone, Integer operationtype, String operationname, Integer loginbranchtype, String loginbranchname, String source, String urlreferrer, String clientip, String note, String uuk, String deviceid, String useragent, Date createtime) {
        this.sysno = sysno;
        this.customersysno = customersysno;
        this.cellphone = cellphone;
        this.operationtype = operationtype;
        this.operationname = operationname;
        this.loginbranchtype = loginbranchtype;
        this.loginbranchname = loginbranchname;
        this.source = source;
        this.urlreferrer = urlreferrer;
        this.clientip = clientip;
        this.note = note;
        this.uuk = uuk;
        this.deviceid = deviceid;
        this.useragent = useragent;
        this.createtime = createtime;
    }

    public AccountSecurityLog() {
        super();
    }

    public Integer getSysno() {
        return sysno;
    }

    public void setSysno(Integer sysno) {
        this.sysno = sysno;
    }

    public Integer getCustomersysno() {
        return customersysno;
    }

    public void setCustomersysno(Integer customersysno) {
        this.customersysno = customersysno;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone == null ? null : cellphone.trim();
    }

    public Integer getOperationtype() {
        return operationtype;
    }

    public void setOperationtype(Integer operationtype) {
        this.operationtype = operationtype;
    }

    public String getOperationname() {
        return operationname;
    }

    public void setOperationname(String operationname) {
        this.operationname = operationname == null ? null : operationname.trim();
    }

    public Integer getLoginbranchtype() {
        return loginbranchtype;
    }

    public void setLoginbranchtype(Integer loginbranchtype) {
        this.loginbranchtype = loginbranchtype;
    }

    public String getLoginbranchname() {
        return loginbranchname;
    }

    public void setLoginbranchname(String loginbranchname) {
        this.loginbranchname = loginbranchname == null ? null : loginbranchname.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getUrlreferrer() {
        return urlreferrer;
    }

    public void setUrlreferrer(String urlreferrer) {
        this.urlreferrer = urlreferrer == null ? null : urlreferrer.trim();
    }

    public String getClientip() {
        return clientip;
    }

    public void setClientip(String clientip) {
        this.clientip = clientip == null ? null : clientip.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public String getUuk() {
        return uuk;
    }

    public void setUuk(String uuk) {
        this.uuk = uuk == null ? null : uuk.trim();
    }

    public String getDeviceid() {
        return deviceid;
    }

    public void setDeviceid(String deviceid) {
        this.deviceid = deviceid == null ? null : deviceid.trim();
    }

    public String getUseragent() {
        return useragent;
    }

    public void setUseragent(String useragent) {
        this.useragent = useragent == null ? null : useragent.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}