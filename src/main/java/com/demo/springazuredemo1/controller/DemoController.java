package com.demo.springazuredemo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/api")
    public String getMessage() {
        return  "First app deployed !! and  it is working !!";
    }
}
