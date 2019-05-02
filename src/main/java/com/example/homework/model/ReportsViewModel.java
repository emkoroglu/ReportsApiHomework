package com.example.homework.model;

public class ReportsViewModel {
    public ReportsViewModel() {

    }

    public ReportsViewModel(String email, String firstName, String lastName, String amount, String currency, String transactionId) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.amount = amount;
        this.currency = currency;
        this.transactionId = transactionId;
    }

    public String email;
    public String firstName;
    public String lastName;
    public String amount;
    public String currency;
    public String transactionId;


}
