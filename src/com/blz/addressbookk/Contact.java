package com.blz.addressbookk;

public class Contact {

    private String firstName = " ";
    private String lastName = " ";
    private String address = " ";
    private String city = " ";
    private String state = " ";
    private int zip = 0;
    private long phoneNumber = 0;
    private String email = " ";

    //parameterized constructor
     Contact(String firstName, String lastName, String address, String city, String state, int zip,
                   long phoneNumber, String email) {
         this.firstName = firstName;
         this.lastName = lastName;
         this.address = address;
         this.city = city;
         this.state = state;
         this.zip = zip;
         this.phoneNumber= phoneNumber;
         this.email = email;

    }

    //standard setters method
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //standard getter methods


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getZip() {
        return zip;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }



    void display() {
             System.out.println("First name = " + firstName);
             System.out.println("Last name = " + lastName);
             System.out.println("Address = " + address);
             System.out.println("City = " + city);
             System.out.println("State = " + state);
             System.out.println("Zip = " + zip);
             System.out.println("Phone number = " + phoneNumber);
             System.out.println("Email = " + email);
    }
}







