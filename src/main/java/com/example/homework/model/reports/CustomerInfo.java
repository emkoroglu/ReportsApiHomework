package com.example.homework.model.reports;

public class CustomerInfo
{
    public String number;

    public String billingLastName;

    public String billingFirstName;

    public String email;

    public String getNumber ()
    {
        return number;
    }

    public void setNumber (String number)
    {
        this.number = number;
    }

    public String getBillingLastName ()
    {
        return billingLastName;
    }

    public void setBillingLastName (String billingLastName)
    {
        this.billingLastName = billingLastName;
    }

    public String getBillingFirstName ()
    {
        return billingFirstName;
    }

    public void setBillingFirstName (String billingFirstName)
    {
        this.billingFirstName = billingFirstName;
    }

    public String getEmail ()
    {
        return email;
    }

    public void setEmail (String email)
    {
        this.email = email;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [number = "+number+", billingLastName = "+billingLastName+", billingFirstName = "+billingFirstName+", email = "+email+"]";
    }
}