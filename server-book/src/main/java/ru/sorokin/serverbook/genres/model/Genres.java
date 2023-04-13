package ru.sorokin.serverbook.genres.model;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "genres")
public class Genres {
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
    @Column(name = "genre", nullable = false)
    private String genre;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Genres)) return false;
        Genres genres = (Genres) o;
        return genre.equals(genres.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(genre);
    }
}
