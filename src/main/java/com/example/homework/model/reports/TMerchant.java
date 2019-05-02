package com.example.homework.model.reports;

public class TMerchant
{
    public String referenceNo;

    public String created_at;

    public String customData;

    public String type;

    public String message;

    public String operation;

    public String transactionId;

    public String status;

    public String getReferenceNo ()
    {
        return referenceNo;
    }

    public void setReferenceNo (String referenceNo)
    {
        this.referenceNo = referenceNo;
    }

    public String getCreated_at ()
    {
        return created_at;
    }

    public void setCreated_at (String created_at)
    {
        this.created_at = created_at;
    }

    public String getCustomData ()
    {
        return customData;
    }

    public void setCustomData (String customData)
    {
        this.customData = customData;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    public String getMessage ()
    {
        return message;
    }

    public void setMessage (String message)
    {
        this.message = message;
    }

    public String getOperation ()
    {
        return operation;
    }

    public void setOperation (String operation)
    {
        this.operation = operation;
    }

    public String getTransactionId ()
    {
        return transactionId;
    }

    public void setTransactionId (String transactionId)
    {
        this.transactionId = transactionId;
    }

    public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [referenceNo = "+referenceNo+", created_at = "+created_at+", customData = "+customData+", type = "+type+", message = "+message+", operation = "+operation+", transactionId = "+transactionId+", status = "+status+"]";
    }
}
