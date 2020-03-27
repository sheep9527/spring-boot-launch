package com.sheep.launch.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/boot")
public class HelloController {

    @Value("${person.message}")
    String message;

    @GetMapping("/hello")
    public String hello() {
        return "hello world " + message;
    }
}
