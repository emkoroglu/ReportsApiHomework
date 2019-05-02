package com.example.homework.model.reports;

public class Ipn
{
    private Merchant merchant;

    private String sent;

    public Merchant getMerchant ()
    {
        return merchant;
    }

    public void setMerchant (Merchant merchant)
    {
        this.merchant = merchant;
    }

    public String getSent ()
    {
        return sent;
    }

    public void setSent (String sent)
    {
        this.sent = sent;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [merchant = "+merchant+", sent = "+sent+"]";
    }
}