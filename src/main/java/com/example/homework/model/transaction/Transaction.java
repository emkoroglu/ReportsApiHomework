package com.example.homework.model.transaction;

public class Transaction
{
    public TMerchant merchant;

    public TMerchant getMerchant ()
    {
        return merchant;
    }

    public void setMerchant (TMerchant merchant)
    {
        this.merchant = merchant;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [merchant = "+merchant+"]";
    }
}
