package ru.sorokin.serverbook.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sorokin.serverbook.book.model.Book;

import java.util.UUID;

public interface RepositoryBook extends JpaRepository<Book, UUID> {
}
