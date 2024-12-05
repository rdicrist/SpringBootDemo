package com.example.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

//    @GetMapping("/")
//    public ResponseEntity<String> hello() {
//        return new ResponseEntity<>("Hello!", HttpStatus.OK);
//    }

    @GetMapping("/")
    public String hello() {
        return "Hello!\n";
    }

//    @GetMapping("/name")
//    public ResponseEntity<String> helloName(@RequestParam("name") String name) {
//        return new ResponseEntity<>("Hello "+name+"!", HttpStatus.OK);
//    }

    @GetMapping("/name")
    public String helloName(@RequestParam("name") String name) {
        return "Hello "+name+"!\n";
    }

    @GetMapping("/name_age")
    public String helloNameAndAge(@RequestParam("name") String name, @RequestParam("age") String age) { return name+" is "+age+" years old\n"; }
}
