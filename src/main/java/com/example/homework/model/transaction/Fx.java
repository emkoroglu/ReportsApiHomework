package com.example.homework.model.transaction;

public class Fx
{
    private FxMerchant merchant;

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
