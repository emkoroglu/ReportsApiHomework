package com.example.homework.model.transaction;

public class TMerchant {
    public Agent agent;

    public String code;

    public String referenceNo;

    public String acquirerTransactionId;

    public String channel;

    public String created_at;

    public String customData;

    public String type;

    public String message;

    public String transactionId;

    public String updated_at;

    public String merchantId;

    public String chainId;

    public String agentInfoId;

    public String id;

    public String operation;

    public String fxTransactionId;

    public String status;

    public Agent getAgent ()
    {
        return agent;
    }

    public void setAgent (Agent agent)
    {
        this.agent = agent;
    }

    public String getCode ()
    {
        return code;
    }

    public void setCode (String code)
    {
        this.code = code;
    }

    public String getReferenceNo ()
    {
        return referenceNo;
    }

    public void setReferenceNo (String referenceNo)
    {
        this.referenceNo = referenceNo;
    }

    public String getAcquirerTransactionId ()
    {
        return acquirerTransactionId;
    }

    public void setAcquirerTransactionId (String acquirerTransactionId)
    {
        this.acquirerTransactionId = acquirerTransactionId;
    }

    public String getChannel ()
    {
        return channel;
    }

    public void setChannel (String channel)
    {
        this.channel = channel;
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

    public String getTransactionId ()
    {
        return transactionId;
    }

    public void setTransactionId (String transactionId)
    {
        this.transactionId = transactionId;
    }

    public String getUpdated_at ()
    {
        return updated_at;
    }

    public void setUpdated_at (String updated_at)
    {
        this.updated_at = updated_at;
    }

    public String getMerchantId ()
    {
        return merchantId;
    }

    public void setMerchantId (String merchantId)
    {
        this.merchantId = merchantId;
    }

    public String getChainId ()
    {
        return chainId;
    }

    public void setChainId (String chainId)
    {
        this.chainId = chainId;
    }

    public String getAgentInfoId ()
    {
        return agentInfoId;
    }

    public void setAgentInfoId (String agentInfoId)
    {
        this.agentInfoId = agentInfoId;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getOperation ()
    {
        return operation;
    }

    public void setOperation (String operation)
    {
        this.operation = operation;
    }

    public String getFxTransactionId ()
    {
        return fxTransactionId;
    }

    public void setFxTransactionId (String fxTransactionId)
    {
        this.fxTransactionId = fxTransactionId;
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
        return "ClassPojo [agent = "+agent+", code = "+code+", referenceNo = "+referenceNo+", acquirerTransactionId = "+acquirerTransactionId+", channel = "+channel+", created_at = "+created_at+", customData = "+customData+", type = "+type+", message = "+message+", transactionId = "+transactionId+", updated_at = "+updated_at+", merchantId = "+merchantId+", chainId = "+chainId+", agentInfoId = "+agentInfoId+", id = "+id+", operation = "+operation+", fxTransactionId = "+fxTransactionId+", status = "+status+"]";
    }
}
