package ru.sorokin.serverbook.book.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
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
    @GeneratedValue
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator",
            parameters = {
                    @Parameter(
                            name = "uuid_gen_strategy_class",
                            value = "org.hibernate.id.uuid.CustomVersionStrategy"
                    )
            }
    )
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;
    @Column(name = "name", nullable = false)
    private String name;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable(name = "book_genre",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "genre_id")
    )
    private Set<Genres> genres;
    @ManyToMany(mappedBy = "books")
    private Set<Author> authors = new HashSet<>();
    @Column(name = "publication", nullable = false)
    private Integer publication;
    @Column(name = "pages", nullable = false)
    private Integer pages;
    @Basic
    @Temporal(TemporalType.DATE)
    @Column(name = "release", nullable = false)
    private Date release;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return name.equals(book.name)
                && authors.equals(book.authors)
                && publication.equals(book.publication)
                && release.equals(book.release);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, authors, publication, release);
    }
}
