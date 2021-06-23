package com.ssm.entity;

public class TableForSSM {

    private Integer id;
    private String name;
    private String phone;
    private Boolean isMale;

    public Integer getId() {
        return id;
    }

    public TableForSSM setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public TableForSSM setName(String name) {
        this.name = name;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public TableForSSM setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public Boolean getMale() {
        return isMale;
    }

    public TableForSSM setMale(Boolean male) {
        isMale = male;
        return this;
    }
}
