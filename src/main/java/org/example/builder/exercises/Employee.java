package org.example.builder.exercises;

import org.example.builder.Weapon;

/**
 * Create a class called Employee and add the following fields to it:
 * firstName, lastName, age, nameOfEmployer, phoneNumber, email, salary
 *
 * Create a builder to handle the creation of the
 * Employee object as a static builder class in
 * the Employee.java file
 */
public class Employee {
    private String firstName;
    private String lastName;
    private int age;
    private String nameOfEmployer;
    private String phoneNumber;
    private String email;
    private int salary;

    Employee(String firstName, String lastName, int age, String nameOfEmployer, String phoneNumber, String email, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.nameOfEmployer = nameOfEmployer;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.salary = salary;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNameOfEmployer() {
        return nameOfEmployer;
    }

    public void setNameOfEmployer(String nameOfEmployer) {
        this.nameOfEmployer = nameOfEmployer;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumbere) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }



    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", nameOfEmployer='" + nameOfEmployer + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static class Builder {

        private String firstName;
        private String lastName;
        private int age;
        private String nameOfEmployer;
        private String phoneNumber;
        private String email;
        private int salary;



        public Employee.Builder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Employee.Builder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Employee.Builder withAge(int age) {
            this.age = age;
            return this;
        }
        public Employee.Builder withNameOfEmployer(String nameOfEmployer) {
            this.nameOfEmployer = nameOfEmployer;
            return this;
        }
        public Employee.Builder withPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public Employee.Builder withEmail(String email) {
            this.email = email;
            return this;
        }
        public Employee.Builder withSalary(int salary) {
            this.salary = salary;
            return this;
        }

        public Employee build() {
            return new Employee(firstName, lastName, age, nameOfEmployer, phoneNumber, email, salary);
        }
    }
}
