package com.niki.productcatlogservice.controller;

import com.niki.productcatlogservice.services.MyFirstService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MyFirstController {

    private MyFirstService myFirstService;

    public MyFirstController(MyFirstService myFirstService){
        this.myFirstService=myFirstService;
    }
    @GetMapping("first")
    public String SayHi(){
        return "Hey there !";
    }
}
