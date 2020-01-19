package com.login.webapp.model;

import com.login.webapp.enums.RoleType;

//necessary functional for ftl to display
public class UserModel {

    //UserModel variables
    private String email;

    private String firstName;

    private String lastName;

    private String company;

    private String phoneNumber;

    private String password;

    private RoleType role;

    public UserModel() {
    }

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

    public RoleType getRole() { return role; }

    public void setRole(RoleType role) { this.role = role; }
}
