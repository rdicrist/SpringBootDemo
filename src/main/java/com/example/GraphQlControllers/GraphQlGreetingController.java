package com.example.GraphQlControllers;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class GraphQlGreetingController {

    @QueryMapping
    public String hello() {
        return "Hello!";
    }

    @QueryMapping
    public String helloName(@Argument String name) {
        return "Hello "+name+"!";
    }
}
