package ru.sorokin.serverbook.author.service;

import ru.sorokin.serverbook.author.model.Author;
import ru.sorokin.serverbook.author.model.AuthorDto;

import java.util.UUID;

public interface AuthorService {
    AuthorDto create(AuthorDto authorDto);
    AuthorDto update(AuthorDto authorDto, UUID id);
    AuthorDto findById(UUID id);
    AuthorDto findAll();
    String delete(UUID id);
}
