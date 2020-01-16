package com.login.webapp.model;

//necessary functional class to get data from DB and output it to HTML
public class UserModel {

    //UserModel variables
    private String email;

    private String firstName;

    private String lastName;

    private String company;

    private String phoneNumber;

    private String password;

    public UserModel() {
    }

//    public UserModel(String email, String firstName, String lastName, String company, String phoneNumber, String password) {
//        this.email = email;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.company = company;
//        this.phoneNumber = phoneNumber;
//        this.password = password;
//    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
