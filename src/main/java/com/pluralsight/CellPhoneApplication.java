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

        public class CellPhoneApplication {

            public static void main(String[] args) {
                // Create the first instance
                CellPhone cellPhone1 = new CellPhone();
                cellPhone1.setOwner("Dana Wyatt");
                cellPhone1.setPhoneNumber("855-555-2222");
                cellPhone1.setSerialNumber(1234567);
                cellPhone1.setModel("iPhone 15");

                // Create the second instance
                CellPhone cellPhone2 = new CellPhone();
                cellPhone2.setOwner("j0ifulnois3");
                cellPhone2.setPhoneNumber("555-012-3456");
                cellPhone2.setSerialNumber(7654321);
                cellPhone2.setModel("Pixel 8");

                // Call the static display method for both
                display(cellPhone1);
                display(cellPhone2);

                System.out.println("\n--- Starting Calls ---");

                // Have the first phone dial the second one
                cellPhone1.dial(cellPhone2.getPhoneNumber());

                // Have the second phone dial the first one
                cellPhone2.dial(cellPhone1.getPhoneNumber());
            }

            // New static method to display phone properties
            public static void display(CellPhone phone) {
                System.out.println("Phone Details:");
                System.out.println("Owner: " + phone.getOwner());
                System.out.println("Number: " + phone.getPhoneNumber());
                System.out.println("Model: " + phone.getModel());
                System.out.println("--------------------");
            }
        }

    }
}
