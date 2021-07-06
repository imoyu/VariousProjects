package com.ssm.test_configuration;

public class Teacher {
    private String tName;

    private int tAge;

    public String gettName() {
        return tName;
    }

    public Teacher settName(String tName) {
        this.tName = tName;
        return this;
    }

    public int gettAge() {
        return tAge;
    }

    public Teacher settAge(int tAge) {
        this.tAge = tAge;
        return this;
    }

    public Teacher() {
        System.out.println("teacher create current INSTANCE is : " + this.hashCode());
    }
}