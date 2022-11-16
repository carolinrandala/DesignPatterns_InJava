package org.example.builder.exercises;
/**
 * Create a User class having the following fields:
 * firstname, lastname, age, email, phonenumber, address
 * Use the builder pattern to create a class called UserBuilder
 * that will be used to make the process of creating a new user easier.
 */
public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private int phoneNumber;
    private String address;

    User(String firstName, String lastName, int age, String email, int phoneNumber, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", address='" + address + '\'' +
                '}';
    }
}
