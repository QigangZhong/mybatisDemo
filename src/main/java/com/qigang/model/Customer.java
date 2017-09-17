package com.qigang.model;

import java.io.Serializable;
import java.util.Date;

public class Customer implements Serializable {
    private Integer id;

    private String name;

    private String gender;

    private Date birthday;

    private String cellphone;

    private String email;

    private String preference;

    private String type;

    private String description;

    private static final long serialVersionUID = 1L;

    public Customer(Integer id, String name, String gender, Date birthday, String cellphone, String email, String preference, String type, String description) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.cellphone = cellphone;
        this.email = email;
        this.preference = preference;
        this.type = type;
        this.description = description;
    }

    public Customer() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone == null ? null : cellphone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPreference() {
        return preference;
    }

    public void setPreference(String preference) {
        this.preference = preference == null ? null : preference.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}