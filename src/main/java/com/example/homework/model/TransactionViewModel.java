package com.example.homework.model;

public class TransactionViewModel {
    public TransactionViewModel(String email, String firstName, String lastName, String company, String merchantId, String status,String IpAddress) {
        this.email = email;
        this.company = company;
        this.lastName = lastName;
        this.firstName = firstName;
        this.merchantId = merchantId;
        this.status = status;
        this.IpAddress = IpAddress;
    }

    public String email;
    public String firstName;
    public String lastName;
    public String company;
    public String merchantId;
public  String status;
    public  String IpAddress;
}
