package com.example.homework.model.reports;

public class Fx
{
    public FxMerchant merchant;

    public FxMerchant getMerchant ()
    {
        return merchant;
    }

    public void setMerchant (FxMerchant merchant)
    {
        this.merchant = merchant;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [merchant = "+merchant+"]";
    }
}

