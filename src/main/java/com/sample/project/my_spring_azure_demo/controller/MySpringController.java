package com.sample.project.my_spring_azure_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MySpringController {

    @GetMapping("/message")
    public String getMessage() {
        return "My Spring Azure Demo.";
    }
}
