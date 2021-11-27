package com.hamrasta.gatewayservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping("/test/{value}")
    public String test(@PathVariable String value) {
        System.out.println("*******  LOG SERVICE  *******");
        return value;
    }

}
