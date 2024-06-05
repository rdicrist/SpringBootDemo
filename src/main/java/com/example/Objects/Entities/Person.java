package com.example.Objects.Entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="persons")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
}
