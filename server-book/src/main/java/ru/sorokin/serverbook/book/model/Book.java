package ru.sorokin.serverbook.book.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import ru.sorokin.serverbook.author.model.Author;
import ru.sorokin.serverbook.genres.model.Genres;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "t_books")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    private UUID id;
    private String name;
    @ElementCollection
    @CollectionTable(name = "t_genres", joinColumns = @JoinColumn(name = "id"), indexes = {@Index(columnList = "index_list")})
    @Column(name = "genre")
    private List<Genres> genres;
    @ElementCollection
    @CollectionTable(name = "t_authors", joinColumns = @JoinColumn(name = "id"), indexes = {@Index(columnList = "index_list")})
    @Column(name = "author")
    private List<Author> authors;
    private Integer publication;
    private Integer pages;
}
