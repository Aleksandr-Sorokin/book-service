package ru.sorokin.serverbook.book.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.sorokin.serverbook.author.model.Author;
import ru.sorokin.serverbook.genres.model.Genres;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookDto {
    private String name;
    private Set<Genres> genres;
    private Set<Author> authors = new HashSet<>();
    private Integer publication;
    private Integer pages;
    private Date release;
}
