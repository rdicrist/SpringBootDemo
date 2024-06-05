package com.example.Repositories;

import com.example.Objects.Entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {
    Person findByFirstName(String firstName);
}

