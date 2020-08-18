package com.springbatch.example.dao.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
public class Person {

    @Id
    @Column (name = "ID", nullable = false)
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @Column (name = "FIRSTNAME")
    private String firstName;

    @NotNull
    @Column (name = "LASTNAME")
    private String lastName;

    public Person() {
    }

    public Person(final String firstName, final String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getId(){
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
