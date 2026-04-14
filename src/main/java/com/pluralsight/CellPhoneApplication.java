package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

//CREATE BLANK PHONE:
        CellPhone cellphone = new CellPhone();

//        Gathering Data:
        System.out.print("What is your serial number? ");
        long serialNumber = input.nextLong();
        input.nextLine();

        System.out.print("What model is your phone?");
        String phoneModel = input.nextLine();

        System.out.print("Who is your cell service provider?");
        String phoneCarrier = input.nextLine();

        System.out.print("What is your phone number?");
        String phoneNumber = input.nextLine();

        System.out.print("Who is this phone registered to?");
        String phoneOwner = input.nextLine();

//Setters:
        cellphone.setSerialNumber(serialNumber);
        cellphone.setPhoneModel(phoneModel);
        cellphone.setPhoneCarrier(phoneCarrier);
        cellphone.setPhoneNumber(phoneNumber);
        cellphone.setPhoneOwner(phoneOwner);

//        GETTERS AND OUTPUT:
        System.out.println("\n ~~Phone Records~~");
        System.out.println("Serial Number: " + cellphone.getSerialNumber());
        System.out.println("Model: " + cellphone.getPhoneModel());
        System.out.println("Phone Carrier: " + cellphone.getPhoneCarrier());
        System.out.println("Phone Number:" + cellphone.getPhoneNumber());
        System.out.println("Phone Owner: " + cellphone.getPhoneOwner());


    }
}
