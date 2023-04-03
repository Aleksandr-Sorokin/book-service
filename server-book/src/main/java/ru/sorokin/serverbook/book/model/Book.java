package ru.sorokin.serverbook.book.model;

import ru.sorokin.serverbook.author.model.Author;
import ru.sorokin.serverbook.genres.model.Genres;

import java.util.List;

public class Book {
    private String name;
    private List<Genres> genres;
    private List<Author> authors;
    private Integer publication;
    private Integer pages;
}
