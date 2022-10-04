package com.google.lesson_07;
import java.io.Serializable;
public class Address implements Comparable<Address>, Serializable {
    private String streetAddress;
    private String city;
    private int postalCode;

    public Address(String streetAddress, String city, int postalCode) {
        this.streetAddress = streetAddress;
        this.city = city;
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetAddress='" + streetAddress + '\'' +
                ", city='" + city + '\'' +
                ", postalCode=" + postalCode +
                '}';
    }

    public Address(Address address) {
        this.streetAddress = address.streetAddress;
        this.city = address.city;
        this.postalCode = address.postalCode;
    }


    public Address() {
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public int compareTo(Address o) {
        return 0;
    }
}
