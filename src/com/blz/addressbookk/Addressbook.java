package com.blz.addressbookk;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * Addressbook creation
 */


public class Addressbook {
    private ArrayList<Contact>list = new ArrayList<Contact>();

    public static <Addressbookk> void main(String[] args) {
        System.out.println("Welcome to Address book program");
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Add contact. ");
        System.out.println(" 2. Edit contact. ");
        System.out.println(" 3. Delete contact. ");
        int choice = sc.nextInt();
        while (choice !=0) {
            switch (choice) { //Choice of condition
                case 1 :
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
                    String emailId = sc.next();
                    Addressbook contact1 = new Addressbook();
                    contact1.addContact(firstName, lastName, address, city, state, zip, phoneNumber, emailId);
                    break;
                case 2:
                    System.out.println("Edit Contact");
                    break;
                case 3:
                    System.out.println("Delete Contact");
                    break;
                default:
                    System.out.println("Enter valid Number");
            }
            System.out.println("Program ended..Thank You");
        }
    }
    private void addContact(String firstName, String lastName, String address, String city, String state, int zip, long phoneNumber, String emailId) {
        Contact person = new Contact(firstName, lastName, address, city, state, zip,phoneNumber , emailId);
        list.add(person);
        person.display();

    }

    }

