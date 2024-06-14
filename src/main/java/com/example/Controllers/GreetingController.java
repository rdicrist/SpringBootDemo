package com.example.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @GetMapping("/")
    public String hello() {
        return "Hello!";
    }

    @GetMapping("/name")
    public String helloName(@RequestParam("name") String name) {
        return "Hello "+name+"!";
    }
}
