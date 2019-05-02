package com.example.homework.model.transaction;



public class FxMerchant
{
    public String originalAmount;

    public String originalCurrency;

    public String getOriginalAmount ()
    {
        return originalAmount;
    }

    public void setOriginalAmount (String originalAmount)
    {
        this.originalAmount = originalAmount;
    }

    public String getOriginalCurrency ()
    {
        return originalCurrency;
    }

    public void setOriginalCurrency (String originalCurrency)
    {
        this.originalCurrency = originalCurrency;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [originalAmount = "+originalAmount+", originalCurrency = "+originalCurrency+"]";
    }
}


