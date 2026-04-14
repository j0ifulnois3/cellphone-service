package com.pluralsight;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);


//CREATE BLANK PHONE:
        CellPhone cellphone = new CellPhone();

//        Gathering Data:
        System.out.print("What is your serial number? ");
        double serialNumber = input.nextDouble();

        System.out.print("What model is your phone?");
        String phoneModel = input.nextLine();

        System.out.print("Who is your cell service provider?");
        String phoneCarrier = input.nextLine();

        System.out.print("What is your phone number?");
        String phoneNumber = input.next();

        System.out.print("Who is this phone registered to?");
        String phoneOwner = input.next();





    }
}
