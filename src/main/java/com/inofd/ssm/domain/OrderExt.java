package com.inofd.ssm.domain;

public class OrderExt extends Orders {
    private String usename;
    private String address;

    public String getUsename() {
        return usename;
    }

    public void setUsename(String usename) {
        this.usename = usename;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
