package ru.sorokin.serverbook.book.service;

import ru.sorokin.serverbook.author.model.AuthorDto;
import ru.sorokin.serverbook.book.model.BookDto;

import java.util.UUID;

public interface BookService {
    BookDto create(BookDto bookDto);
    BookDto update(BookDto bookDto, UUID id);
    BookDto findById(UUID id);
    BookDto findAll();
    String delete(UUID id);
}
