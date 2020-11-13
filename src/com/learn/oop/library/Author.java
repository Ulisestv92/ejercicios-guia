package com.learn.oop.library;

import java.util.Date;

public class Author {

    private String firstName;
    private String surname;
    private Date birthDate;

    public Author(String firstName, String surname, Date birthDate) {

        this.firstName = firstName;
        this.surname = surname;
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getBirthDate() {
        return birthDate.toString();

    }
}