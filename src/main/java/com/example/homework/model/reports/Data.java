package com.example.homework.model.reports;

public class Data
{
    public Fx fx;

    public String updated_at;

    public Ipn ipn;

    public CustomerInfo customerInfo;

    public String created_at;

    public Merchant merchant;

    public String refundable;

    public Acquirer acquirer;

    public Transaction transaction;

    public Fx getFx ()
    {
        return fx;
    }

    public void setFx (Fx fx)
    {
        this.fx = fx;
    }

    public String getUpdated_at ()
    {
        return updated_at;
    }

    public void setUpdated_at (String updated_at)
    {
        this.updated_at = updated_at;
    }

    public Ipn getIpn ()
    {
        return ipn;
    }

    public void setIpn (Ipn ipn)
    {
        this.ipn = ipn;
    }

    public CustomerInfo getCustomerInfo ()
    {
        return customerInfo;
    }

    public void setCustomerInfo (CustomerInfo customerInfo)
    {
        this.customerInfo = customerInfo;
    }

    public String getCreated_at ()
    {
        return created_at;
    }

    public void setCreated_at (String created_at)
    {
        this.created_at = created_at;
    }

    public Merchant getMerchant ()
    {
        return merchant;
    }

    public void setMerchant (Merchant merchant)
    {
        this.merchant = merchant;
    }

    public String getRefundable ()
    {
        return refundable;
    }

    public void setRefundable (String refundable)
    {
        this.refundable = refundable;
    }

    public Acquirer getAcquirer ()
    {
        return acquirer;
    }

    public void setAcquirer (Acquirer acquirer)
    {
        this.acquirer = acquirer;
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
        return "ClassPojo [fx = "+fx+", updated_at = "+updated_at+", ipn = "+ipn+", customerInfo = "+customerInfo+", created_at = "+created_at+", merchant = "+merchant+", refundable = "+refundable+", acquirer = "+acquirer+", transaction = "+transaction+"]";
    }
}

