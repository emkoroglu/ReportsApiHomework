package com.example.homework.model.transaction;

public class Agent
{
    public String merchantUserAgent;

    public String customerUserAgent;

    public String customerIp;

    public String updated_at;

    public String merchantIp;

    public String created_at;

    public String id;

    private String deleted_at;

    public String getMerchantUserAgent ()
    {
        return merchantUserAgent;
    }

    public void setMerchantUserAgent (String merchantUserAgent)
    {
        this.merchantUserAgent = merchantUserAgent;
    }

    public String getCustomerUserAgent ()
    {
        return customerUserAgent;
    }

    public void setCustomerUserAgent (String customerUserAgent)
    {
        this.customerUserAgent = customerUserAgent;
    }

    public String getCustomerIp ()
    {
        return customerIp;
    }

    public void setCustomerIp (String customerIp)
    {
        this.customerIp = customerIp;
    }

    public String getUpdated_at ()
    {
        return updated_at;
    }

    public void setUpdated_at (String updated_at)
    {
        this.updated_at = updated_at;
    }

    public String getMerchantIp ()
    {
        return merchantIp;
    }

    public void setMerchantIp (String merchantIp)
    {
        this.merchantIp = merchantIp;
    }

    public String getCreated_at ()
    {
        return created_at;
    }

    public void setCreated_at (String created_at)
    {
        this.created_at = created_at;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getDeleted_at ()
{
    return deleted_at;
}

    public void setDeleted_at (String deleted_at)
    {
        this.deleted_at = deleted_at;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [merchantUserAgent = "+merchantUserAgent+", customerUserAgent = "+customerUserAgent+", customerIp = "+customerIp+", updated_at = "+updated_at+", merchantIp = "+merchantIp+", created_at = "+created_at+", id = "+id+", deleted_at = "+deleted_at+"]";
    }
}
