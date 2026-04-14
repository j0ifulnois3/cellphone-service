package com.pluralsight;

//CLASS AND DATA:
public class CellPhone {

     private long serialNumber;
     private String phoneModel;
     private String phoneCarrier;
     private String phoneNumber;
     private String phoneOwner;

//Constructor:
    public CellPhone() {
        this.serialNumber = 0;
        this.phoneModel = "";
        this.phoneCarrier = "";
        this.phoneNumber = "";
        this.phoneOwner = "";
    }

//GETTERS and SETTERS:
    public double getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(long serialNumber) {
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















