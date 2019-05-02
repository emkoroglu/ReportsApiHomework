package com.example.homework.model;

public class ReportApiResponse {

    public ReportResponse[] response;

    private String status;

    public ReportResponse[] getResponse ()
    {
        return response;
    }

    public void setResponse (ReportResponse[] response)
    {
        this.response = response;
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
        return "ClassPojo [response = "+response+", status = "+status+"]";
    }
}
