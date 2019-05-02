package com.example.homework.model.reports;

public class Reports
{
    public String per_page;

    public Data[] data;

    public String next_page_url;

    public String from;

    public String to;

    public String prev_page_url;

    public String current_page;

    public String getPer_page ()
    {
        return per_page;
    }

    public void setPer_page (String per_page)
    {
        this.per_page = per_page;
    }

    public Data[] getData ()
    {
        return data;
    }

    public void setData (Data[] data)
    {
        this.data = data;
    }

    public String getNext_page_url ()
    {
        return next_page_url;
    }

    public void setNext_page_url (String next_page_url)
    {
        this.next_page_url = next_page_url;
    }

    public String getFrom ()
    {
        return from;
    }

    public void setFrom (String from)
    {
        this.from = from;
    }

    public String getTo ()
    {
        return to;
    }

    public void setTo (String to)
    {
        this.to = to;
    }

    public String getPrev_page_url ()
{
    return prev_page_url;
}

    public void setPrev_page_url (String prev_page_url)
    {
        this.prev_page_url = prev_page_url;
    }

    public String getCurrent_page ()
    {
        return current_page;
    }

    public void setCurrent_page (String current_page)
    {
        this.current_page = current_page;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [per_page = "+per_page+", data = "+data+", next_page_url = "+next_page_url+", from = "+from+", to = "+to+", prev_page_url = "+prev_page_url+", current_page = "+current_page+"]";
    }
}
