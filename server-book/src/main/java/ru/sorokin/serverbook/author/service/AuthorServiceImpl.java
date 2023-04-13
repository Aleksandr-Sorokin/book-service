package ru.sorokin.serverbook.author.service;

import org.springframework.stereotype.Service;
import ru.sorokin.serverbook.author.model.Author;
import ru.sorokin.serverbook.author.model.AuthorDto;
import ru.sorokin.serverbook.book.model.Book;

import java.util.UUID;

@Service
public class AuthorServiceImpl implements AuthorService {


    @Override
    public AuthorDto create(AuthorDto authorDto) {
        return null;
    }

    @Override
    public AuthorDto update(AuthorDto authorDto, UUID id) {
        return null;
    }

    @Override
    public AuthorDto findById(UUID id) {
        return null;
    }

    @Override
    public AuthorDto findAll() {
        return null;
    }

    @Override
    public String delete(UUID id) {
        return null;
    }

    private void addBook(Author author, Book book) {
        author.getBooks().add(book);
        book.getAuthors().add(author);
    }

    private void removeBook(Author author, Book book) {
        author.getBooks().remove(book);
        book.getAuthors().remove(author);
    }
}
