package com.learn.oop.library;

import java.util.Date;

public class Book {

    private String title;
    private Date releaseDate;
    private Author author;


    public Book(String title, Date releaseDate, Author author) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.author = author;

    }

    public String getTitle() {
        return this.title;
    }

    public Date getReleaseDate() {
        return this.releaseDate;
    }

    public Author getAuthor() {
        return this.author;
    }
}
