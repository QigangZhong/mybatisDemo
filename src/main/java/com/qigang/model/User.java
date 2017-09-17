package com.qigang.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class User implements Serializable {
    private Integer id;

    private String username;

    private String password;

    private BigDecimal account;

    private static final long serialVersionUID = 1L;

    public User(String username, String password, BigDecimal account) {
        this.username = username;
        this.password = password;
        this.account = account;
    }

    public User(Integer id, String username, String password, BigDecimal account) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.account = account;
    }

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public BigDecimal getAccount() {
        return account;
    }

    public void setAccount(BigDecimal account) {
        this.account = account;
    }
}