package com.example.homework.model.reports;

public class Merchant
{
    private String allowPartialRefund;

    private String name;

    private String allowPartialCapture;

    private String id;

    public String getAllowPartialRefund ()
    {
        return allowPartialRefund;
    }

    public void setAllowPartialRefund (String allowPartialRefund)
    {
        this.allowPartialRefund = allowPartialRefund;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getAllowPartialCapture ()
    {
        return allowPartialCapture;
    }

    public void setAllowPartialCapture (String allowPartialCapture)
    {
        this.allowPartialCapture = allowPartialCapture;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [allowPartialRefund = "+allowPartialRefund+", name = "+name+", allowPartialCapture = "+allowPartialCapture+", id = "+id+"]";
    }
}
