package com.example.homework.service;

import com.example.homework.config.ConfigFileReader;
import com.example.homework.model.*;
import com.example.homework.model.client.ClientResponse;
import com.example.homework.model.reports.Data;
import com.example.homework.model.reports.Reports;
import com.example.homework.model.transaction.TransactionResponse;
import com.fasterxml.jackson.core.type.TypeReference;
import com.google.gson.Gson;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class HomeworkApiService {

    public HomeworkApiService() throws UnirestException {
        Login();
    }

    private static TokenModel tokenM = new TokenModel();

    public void Login() throws UnirestException {
        String url = ConfigFileReader.getValueFromConfig("loginUrl");
        String email = ConfigFileReader.getValueFromConfig("email");
        String password = ConfigFileReader.getValueFromConfig("password");

        HttpResponse<JsonNode> jsonResponse = Unirest.post(url)
                .header("accept", "application/json")
                .field("email", email)
                .field("password", password)
                .asJson();
        tokenM = new Gson().fromJson(jsonResponse.getBody().getObject().toString(), TokenModel.class);
    }

    public List<ReportModelView> getReport() throws UnirestException {
        String url = ConfigFileReader.getValueFromConfig("reportUrl");
        HttpResponse<JsonNode> jsonResponse = Unirest.post(url)
                .header("accept", "application/json")
                .header("Authorization", tokenM.token)
                .field("fromDate", "2015-07-01")
                .field("toDate", "2019-10-01")
                .field("merchant", "")
                .field("acquirer", "")
                .asJson();
        ReportApiResponse resportRes = new Gson().fromJson(jsonResponse.getBody().getObject().toString(), ReportApiResponse.class);
        ArrayList<ReportModelView> reportArray = new ArrayList<>();
        for (ReportResponse item : resportRes.response) {
            ReportModelView model = new ReportModelView(
                    item.total,
                    item.count,
                    item.currency);
            reportArray.add(model);
        }
        return reportArray;
    }

    public ArrayList<ReportsViewModel> getReportList() throws UnirestException {
        String url = ConfigFileReader.getValueFromConfig("transactionListUrl");
        HttpResponse<JsonNode> jsonResponse = Unirest.post(url)
                .header("accept", "application/json")
                .header("Authorization", tokenM.token)
                .field("fromDate", "2015-07-01")
                .field("toDate", "2019-10-01")
                .field("merchant", "1")
                .field("acquirer", "1")
                .asJson();

        Reports reports = new Gson().fromJson(jsonResponse.getBody().getObject().toString(), Reports.class);
        ArrayList<ReportsViewModel> reportsArray = new ArrayList<ReportsViewModel>();
        for (Data item : reports.data) {
            ReportsViewModel model = new ReportsViewModel(
                    item.customerInfo.email,
                    item.customerInfo.billingFirstName,
                    item.customerInfo.billingLastName,
                    item.fx.merchant.originalAmount,
                    item.fx.merchant.originalCurrency,
                    item.transaction.merchant.transactionId);
            reportsArray.add(model);
        }
        return reportsArray;
    }

    public TransactionViewModel getTransactionById(String transactionId) throws UnirestException {
        String url = ConfigFileReader.getValueFromConfig("transactionUrl");
        HttpResponse<JsonNode> jsonResponse = Unirest.post(url)
                .header("accept", "application/json")
                .header("Authorization", tokenM.token)
                .field("transactionId", transactionId)
                .asJson();

        TransactionResponse transactionRes = new Gson().fromJson(jsonResponse.getBody().getObject().toString(), TransactionResponse.class);
        return new TransactionViewModel(transactionRes.customerInfo.email,
                transactionRes.customerInfo.billingFirstName,
                transactionRes.customerInfo.billingLastName,
                transactionRes.customerInfo.shippingCompany,
                transactionRes.transaction.merchant.merchantId,
                transactionRes.transaction.merchant.status,
                transactionRes.transaction.merchant.agent.customerIp);
    }

    public ClientViewModel getClientById(String transactionId) throws UnirestException {
        String url = ConfigFileReader.getValueFromConfig("clientUrl");
        HttpResponse<JsonNode> jsonResponse = Unirest.post(url)
                .header("accept", "application/json")
                .header("Authorization", tokenM.token)
                .field("transactionId", transactionId)
                .asJson();

        ClientResponse clientRes = new Gson().fromJson(jsonResponse.getBody().getObject().toString(), ClientResponse.class);
        return new ClientViewModel(clientRes.customerInfo.email,
                clientRes.customerInfo.billingFirstName,
                clientRes.customerInfo.billingLastName,
                clientRes.customerInfo.shippingCompany, clientRes.customerInfo.shippingState, clientRes.customerInfo.billingCountry, clientRes.customerInfo.billingPhone);
    }
}
