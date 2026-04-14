package com.pluralsight;

import java.lang.reflect.Constructor;

//CLASS AND VARIABLES:
public class CellPhone {
    private double serialNumber;
    private String phoneModel;
    private String phoneCarrier;
    private String phoneNumber;
    private String phoneOwner;

//Constructor:
    public CellPhone(double serialNumber, String phoneModel, String phoneCarrier, String phoneNumber, String phoneOwner) {
        this.serialNumber = serialNumber;
        this.phoneModel = phoneModel;
        this.phoneCarrier = phoneCarrier;
        this.phoneNumber = phoneNumber;
        this.phoneOwner = phoneOwner;
    }

//GETTERS and SETTERS:
    public double getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(double serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getPhoneModel() {
        return phoneModel;
    }

    public void setPhoneModel(String phoneModel) {
        this.phoneModel = phoneModel;
    }

    public String getPhoneCarrier() {
        return phoneCarrier;
    }

    public void setPhoneCarrier(String phoneCarrier) {
        this.phoneCarrier = phoneCarrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneOwner() {
        return phoneOwner;
    }

    public void setPhoneOwner(String phoneOwner) {
        this.phoneOwner = phoneOwner;
    }
}














}
