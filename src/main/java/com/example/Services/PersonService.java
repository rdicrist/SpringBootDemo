package com.example.Services;

import com.example.Objects.Entities.Person;
import com.example.Objects.Entities.Requests.CreatePersonRequest;
import com.example.Repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person createPerson(CreatePersonRequest request) {
        Person person = new Person(null, request.getFirstName(), request.getLastName());
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
