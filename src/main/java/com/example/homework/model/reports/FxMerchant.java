package com.example.homework.model.reports;

public class FxMerchant
{
    public String convertedAmount;

    public String originalAmount;

    public String originalCurrency;

    public String convertedCurrency;

    public String getConvertedAmount ()
    {
        return convertedAmount;
    }

    public void setConvertedAmount (String convertedAmount)
    {
        this.convertedAmount = convertedAmount;
    }

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

    public String getConvertedCurrency ()
    {
        return convertedCurrency;
    }

    public void setConvertedCurrency (String convertedCurrency)
    {
        this.convertedCurrency = convertedCurrency;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [convertedAmount = "+convertedAmount+", originalAmount = "+originalAmount+", originalCurrency = "+originalCurrency+", convertedCurrency = "+convertedCurrency+"]";
    }
}

