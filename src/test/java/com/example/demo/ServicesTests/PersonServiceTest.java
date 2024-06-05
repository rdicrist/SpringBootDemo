package com.example.demo.ServicesTests;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;

import com.example.Objects.Entities.Person;
import com.example.Repositories.PersonRepository;
import com.example.Services.PersonService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class PersonServiceTest {
    private PersonService personService;
    @Mock
    private PersonRepository personRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        MockitoAnnotations.openMocks(this);

        personService = new PersonService(personRepository);
    }

    @Test
    void demoTestMethod() {
        assertTrue(true);
    }

    @Test
    void getPersonByFirstName_HappyPath() throws Exception {
        Person returnPerson = new Person(1, "Jane", "Smith");
        Mockito.when(personRepository.findByFirstName(anyString())).thenReturn(returnPerson);

        String firstName = "Jane";
        Person response = personService.getPersonByFirstName(firstName);

        assertNotNull(response);
        assertEquals(firstName, returnPerson.getFirstName());
    }

    @Test
    void getPersonByFirstName_NotFoundException() throws Exception {
        Mockito.when(personRepository.findByFirstName(anyString())).thenReturn(null);

        Exception exception = assertThrows(Exception.class, () -> {
            personService.getPersonByFirstName("null");
        });
        assertEquals(exception.getMessage(), "Person not found.");
    }
}
