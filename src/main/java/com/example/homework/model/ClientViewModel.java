package com.example.homework.model;


public class ClientViewModel {
    public ClientViewModel(String email, String firstName, String lastName, String company, String state, String country, String phone) {
        this.email = email;
        this.company = company;
        this.lastName = lastName;
        this.firstName = firstName;
        this.state = state;
        this.country = country;
        this.phone = phone;
    }

    public String email;
    public String firstName;
    public String lastName;
    public String company;
    public String state;
    public String country;
    public String phone;
}
