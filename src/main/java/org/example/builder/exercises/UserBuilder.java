package org.example.builder.exercises;
/**
 * Create a User class having the following fields:
 * firstname, lastname, age, email, phonenumber, address
 * Use the builder pattern to create a class called UserBuilder
 * that will be used to make the process of creating a new user easier.
 */
public class UserBuilder {
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private int phoneNumber;
    private String address;


    public UserBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public UserBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
    public UserBuilder withAge(int age) {
        this.age = age;
        return this;
    }
    public UserBuilder withEmail(String email) {
        this.email = email;
        return this;
    }
    public UserBuilder withPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public UserBuilder withAddress(String address) {
        this.address = address;
        return this;
    }

    public User build() {
        return new User(firstName, lastName, age, email, phoneNumber, address);
    }
}


