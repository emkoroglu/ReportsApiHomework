package com.example.homework.controller;


import com.example.homework.model.TokenModel;
import com.example.homework.service.HomeworkApiService;
import com.google.gson.Gson;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.mashape.unirest.http.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {

    @Autowired
    private HomeworkApiService homeworkApiService;

    @GetMapping("/")
    public String home() throws UnirestException {
        return "index"; //view
    }

    @RequestMapping("/report")
    public String report(Model model) throws UnirestException {
        model.addAttribute("ViewModel", homeworkApiService.getReport());
        return "report";
    }

    @RequestMapping("/reportlist")
    public Model reportlist(Model model) throws UnirestException {
        model.addAttribute("ViewModel", homeworkApiService.getReportList());
        return model;
    }

    @RequestMapping("/transaction")
    public Model transaction(@RequestParam String transactionId, Model model) throws UnirestException {
        model.addAttribute("ViewModel", homeworkApiService.getTransactionById(transactionId));
        return model;
    }

    @RequestMapping("/client")
    public Model client(@RequestParam String transactionId, Model model) throws UnirestException {
        model.addAttribute("ViewModel", homeworkApiService.getClientById(transactionId));
        return model;
    }
}


