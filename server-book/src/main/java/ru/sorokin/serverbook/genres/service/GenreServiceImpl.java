package ru.sorokin.serverbook.genres.service;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import ru.sorokin.serverbook.genres.model.Genres;

import java.util.List;
import java.util.UUID;

public class GenreServiceImpl implements GenreService<Genres, UUID>{
    @Override
    public List<Genres> findAll() {
        return null;
    }

    @Override
    public List<Genres> findAll(Sort sort) {
        return null;
    }

    @Override
    public List<Genres> findAllById(Iterable<UUID> uuids) {
        return null;
    }

    @Override
    public <S extends Genres> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Genres> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Genres> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Genres> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<UUID> uuids) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Genres getOne(UUID uuid) {
        return null;
    }

    @Override
    public Genres getById(UUID uuid) {
        return null;
    }

    @Override
    public Genres getReferenceById(UUID uuid) {
        return null;
    }

    @Override
    public <S extends Genres> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Genres> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }
}
