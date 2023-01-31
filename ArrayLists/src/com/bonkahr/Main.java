package com.bonkahr;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    private static final MobilePhone mobilePhone = new MobilePhone("098765433");


    public static void main(String[] args) {
        boolean quit = false;

        startPhone();
        printActions();

        while (!quit){
            System.out.println("\nEnter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0 -> {
                    System.out.println("\nShutting down...");
                    quit = true;
                }
                case 1 -> mobilePhone.printContacts();
                case 2 -> addNewContact();
                case 3 -> updateContact();
                case 4 -> removeContact();
                case 5 -> queryContact();
                case 6 -> printActions();
            }
        }

    }

    private static void addNewContact(){
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String number = scanner.nextLine();
        Contact newContact = Contact.createContact(name, number);
        if (mobilePhone.addNewContact(newContact)){
            System.out.println("New contact added:  " + name +
                    ", phone = " + number);
        }else {
            System.out.println("can't add " + name + " already in phone");
        }
    }

    private static void updateContact(){
        System.out.println("Enter existing name: ");
        String name = scanner.nextLine();
        mobilePhone.queryContact(name);
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null){
            System.out.println("Contact not found");
        }
        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact phone number");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);
        if (mobilePhone.updateContact(existingContactRecord,newContact)){
            System.out.println("Successfully updated record");
        }else{
            System.out.println("Error updating record");
        }

    }

    private static void removeContact(){
        System.out.println("Enter existing name: ");
        String name = scanner.nextLine();
        mobilePhone.queryContact(name);
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null){
            System.out.println("Contact not found");
        }
        if (mobilePhone.removeContact(existingContactRecord)){
            System.out.println("Successfully deleted");
        }else {
            System.out.println("Error deleting contact");
        }
    }

    private static void queryContact(){
        System.out.println("Enter existing name: ");
        String name = scanner.nextLine();
        mobilePhone.queryContact(name);
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null){
            System.out.println("Contact not found");
        }
        assert existingContactRecord != null;
        System.out.println("Name: " + existingContactRecord.getName() +
                " phone number is " + existingContactRecord.getPhoneNumber());
        if (mobilePhone.removeContact(existingContactRecord)){
            System.out.println("Successfully deleted");
        }else {
            System.out.println("Error deleting contact");
        }
    }


    private static void startPhone(){
        System.out.println("Starting phone...");
    }

    private static void printActions(){
        System.out.println("\n Available options: \n press");
        System.out.println("""
                0 - to shutdown
                1 - to print Contacts
                2 - to add new contact
                3 - to update an existing contact
                4 - to remove an existing contact
                5 - query if a contact exists
                6 - to print a list of available contacts""");
        System.out.println("Choose your action: ");
    }

}
