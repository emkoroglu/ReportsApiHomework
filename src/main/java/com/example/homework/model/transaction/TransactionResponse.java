package com.example.homework.model.transaction;

public class TransactionResponse
{
    public Fx fx;

    public CustomerInfo customerInfo;

    public TMerchant merchant;

    public Transaction transaction;

    public Fx getFx ()
    {
        return fx;
    }

    public void setFx (Fx fx)
    {
        this.fx = fx;
    }

    public CustomerInfo getCustomerInfo ()
    {
        return customerInfo;
    }

    public void setCustomerInfo (CustomerInfo customerInfo)
    {
        this.customerInfo = customerInfo;
    }

    public TMerchant getMerchant ()
    {
        return merchant;
    }

    public void setMerchant (TMerchant merchant)
    {
        this.merchant = merchant;
    }

    public Transaction getTransaction ()
    {
        return transaction;
    }

    public void setTransaction (Transaction transaction)
    {
        this.transaction = transaction;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [fx = "+fx+", customerInfo = "+customerInfo+", merchant = "+merchant+", transaction = "+transaction+"]";
    }
}
