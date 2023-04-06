package ru.sorokin.serverbook.book.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.sorokin.serverbook.author.model.Author;
import ru.sorokin.serverbook.genres.model.Genres;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "books")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    private UUID id;
    private String name;
    @ManyToMany
    @JoinTable(name = "books_genres",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "genre_id"))
    private List<Genres> genres;
    @ManyToMany(mappedBy = "books")
    private Set<Author> authors = new HashSet<>();
    private Integer publication;
    private Integer pages;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        return id != null && id.equals(((Book) o).getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
