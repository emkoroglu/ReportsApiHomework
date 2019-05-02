package com.example.homework;

import com.example.homework.service.HomeworkApiService;
import com.google.gson.Gson;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ReportServiceTest {
    private HomeworkApiService apiservice = new HomeworkApiService();

    public ReportServiceTest() throws UnirestException {
    }

    @Test
    public void getReport() throws UnirestException {
        Assert.assertEquals(TestExpected.reportExpected.length(),  new Gson().toJson(apiservice.getReport()).length());
    }
    @Test
    public void getReportList() throws UnirestException {
        Assert.assertEquals(TestExpected.reportsExpected.length(), new Gson().toJson(apiservice.getReportList()).length());
    }
    @Test
    public void getTransaction() throws UnirestException {
        Assert.assertEquals(TestExpected.transactionExpected.length(), new Gson().toJson(apiservice.getTransactionById("1011026-1539357059-1293")).length());
    }
    @Test
    public void getClient() throws UnirestException {
        Assert.assertEquals(TestExpected.clientExpected.length(),  new Gson().toJson(apiservice.getClientById("1011026-1539357059-1293")).length());
    }
}

