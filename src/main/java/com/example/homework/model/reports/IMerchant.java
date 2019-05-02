package com.example.homework.model.reports;

public class IMerchant
{
    private String date;

    private String amount;

    private String ipnType;

    private String code;

    private String convertedAmount;

    private String referenceNo;

    private String customData;

    private String message;

    private String type;

    private String transactionId;

    private String paymentType;

    private String token;

    private String chainId;

    private String IPNUrl;

    private String currency;

    private String operation;

    private String status;

    private String convertedCurrency;

    public String getDate ()
    {
        return date;
    }

    public void setDate (String date)
    {
        this.date = date;
    }

    public String getAmount ()
    {
        return amount;
    }

    public void setAmount (String amount)
    {
        this.amount = amount;
    }

    public String getIpnType ()
    {
        return ipnType;
    }

    public void setIpnType (String ipnType)
    {
        this.ipnType = ipnType;
    }

    public String getCode ()
    {
        return code;
    }

    public void setCode (String code)
    {
        this.code = code;
    }

    public String getConvertedAmount ()
    {
        return convertedAmount;
    }

    public void setConvertedAmount (String convertedAmount)
    {
        this.convertedAmount = convertedAmount;
    }

    public String getReferenceNo ()
    {
        return referenceNo;
    }

    public void setReferenceNo (String referenceNo)
    {
        this.referenceNo = referenceNo;
    }

    public String getCustomData ()
{
    return customData;
}

    public void setCustomData (String customData)
    {
        this.customData = customData;
    }

    public String getMessage ()
    {
        return message;
    }

    public void setMessage (String message)
    {
        this.message = message;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    public String getTransactionId ()
    {
        return transactionId;
    }

    public void setTransactionId (String transactionId)
    {
        this.transactionId = transactionId;
    }

    public String getPaymentType ()
    {
        return paymentType;
    }

    public void setPaymentType (String paymentType)
    {
        this.paymentType = paymentType;
    }

    public String getToken ()
    {
        return token;
    }

    public void setToken (String token)
    {
        this.token = token;
    }

    public String getChainId ()
    {
        return chainId;
    }

    public void setChainId (String chainId)
    {
        this.chainId = chainId;
    }

    public String getIPNUrl ()
    {
        return IPNUrl;
    }

    public void setIPNUrl (String IPNUrl)
    {
        this.IPNUrl = IPNUrl;
    }

    public String getCurrency ()
    {
        return currency;
    }

    public void setCurrency (String currency)
    {
        this.currency = currency;
    }

    public String getOperation ()
    {
        return operation;
    }

    public void setOperation (String operation)
    {
        this.operation = operation;
    }

    public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
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
        return "ClassPojo [date = "+date+", amount = "+amount+", ipnType = "+ipnType+", code = "+code+", convertedAmount = "+convertedAmount+", referenceNo = "+referenceNo+", customData = "+customData+", message = "+message+", type = "+type+", transactionId = "+transactionId+", paymentType = "+paymentType+", token = "+token+", chainId = "+chainId+", IPNUrl = "+IPNUrl+", currency = "+currency+", operation = "+operation+", status = "+status+", convertedCurrency = "+convertedCurrency+"]";
    }
}
