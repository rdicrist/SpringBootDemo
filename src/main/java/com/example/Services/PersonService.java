package com.example.Services;

import com.example.Objects.Entities.Person;
import com.example.Repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    @Autowired
    PersonRepository personRepository;

    public Person createPerson(Person newPerson) {
        Person person = new Person(null, newPerson.getFirstName(), newPerson.getLastName());
        personRepository.save(person);
        return person;
    }
    public Person getPersonByFirstName(String firstName) throws Exception {
        if (personRepository.findByFirstName(firstName) == null) {
            throw new Exception("Person not found.");
        }
        return personRepository.findByFirstName(firstName);
    }
}
