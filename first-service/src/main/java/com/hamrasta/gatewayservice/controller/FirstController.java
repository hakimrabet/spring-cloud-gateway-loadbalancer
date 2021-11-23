package com.hamrasta.gatewayservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/test/{value}")
    public String test(@PathVariable String value){
        System.out.println("*******  ONE  *******");
        return value+" " + serverPort;
    }


}
