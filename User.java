package com.google.lesson_07;

import java.io.Serializable;

public class User implements Comparable<User>, Serializable, Cloneable{
    private String firstName;
    private String lastName;
    private Address address;
    private String[] phoneNumbers;


    public User(String firstName, String lastName, Address address, String[] phoneNumbers) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumbers = phoneNumbers;
    }

    public User(User user) {
        this.phoneNumbers = new String[user.phoneNumbers.length];
        this.firstName = user.firstName;
        this.lastName = user.lastName;
        for (int i = 0; i < user.phoneNumbers.length; i++) {
            this.phoneNumbers[i] = user.phoneNumbers[i];
        }
        this.address = new Address(user.getAddress());
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String[] getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(String[] phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    @Override
    public int compareTo(User o) {
        return 0;
    }
}
