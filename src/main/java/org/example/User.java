package org.example;

public class User {
    public User(){

    }
    public User(String name,String lastName, String phoneNumber){
        this.firstName = firstName;
        this.lastName=lastName;
        this.phoneNumber=phoneNumber;
    }
    String firstName;
    String lastName;
    String phoneNumber;

    public String getName() {
        return firstName;
    }

    public void setName(String name) {
        this.firstName = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
