package com.blz.addressbookk;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * Addressbook creation
 */


public class Addressbook {
    private static List<Contact> list = new ArrayList<Contact>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Address book program");
        menu();
        System.out.println(list);
    }

    private static void menu() {
        System.out.println(" 1. Add contact. ");
        System.out.println("Enter your Choice ");
        int choice = sc.nextInt();
        Addressbook contact = new Addressbook();
        while (choice !=0) {
            switch (choice) { //Choice of condition
                case 1:
                    while (choice != 2) {
                        System.out.println("Enter Contact Details");
                    System.out.println("enter firstname");
                    String firstName = sc.next();
                    System.out.println("Enter lastname");
                    String lastName = sc.next();
                    System.out.println("Enter address");
                    String address = sc.next();
                    System.out.println("Enter city");
                    String city = sc.next();
                    System.out.println("Enter state");
                    String state = sc.next();
                    System.out.println("Enter zip");
                    int zip = sc.nextInt();
                    System.out.println("Enter phone number");
                    long phoneNumber = sc.nextLong();
                    System.out.println("Enter email-Id");
                    String email = sc.next();
                    contact.addContact(firstName, lastName, address, city, state, zip, phoneNumber, email);
                    System.out.println("Would you like to add someone else? 1: Yes, 2: No");
                    choice = sc.nextInt();
                    }
                    break;
                    default:
                    System.out.println("Enter valid Number");
                    break;
            }
            System.out.println("1.Add contact.");
            choice = sc.nextInt();
        }
        System.out.println("Ended...Thank you");
    }

    private void addContact(String firstName, String lastName, String address, String city, String state, int zip, long phoneNumber, String email) {
        Contact person = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);
        list.add(person);
        //person.display();
    }
}


