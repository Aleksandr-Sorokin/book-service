package ru.sorokin.serverbook.genres.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sorokin.serverbook.genres.model.Genres;

import java.util.UUID;

public interface RepositoryGenres extends JpaRepository<Genres, UUID> {
}
