package com.example.Controllers;

import com.example.Objects.Entities.Person;
import com.example.Services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    public PersonService personService;
    @GetMapping("/getByFirstName")
    public Person getPersonByFirstName(@RequestParam("firstName") String firstName) throws Exception {
        return personService.getPersonByFirstName(firstName);
    }

    @PostMapping("/new")
    public Person createPerson(@RequestBody Person newPerson) {
        return personService.createPerson(newPerson);
    }
}
