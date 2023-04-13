package ru.sorokin.serverbook.author.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sorokin.serverbook.author.model.Author;

import java.util.UUID;

public interface RepositoryAuthor extends JpaRepository<Author, UUID> {
}
