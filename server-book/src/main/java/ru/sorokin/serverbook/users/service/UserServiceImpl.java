package ru.sorokin.serverbook.users.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.sorokin.serverbook.users.User;
import ru.sorokin.serverbook.users.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService<User, UUID> {
    private final UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public List<User> findAll(Sort sort) {
        if (sort.isEmpty()) {
            sort = Sort.by(Sort.Direction.ASC, "last_name");
        }
        return userRepository.findAll(sort);
    }

    @Override
    public List<User> findAllById(Iterable<UUID> uuids) {
        List<User> users = new ArrayList<>();
        if (uuids  != null) {
            users = userRepository.findAllById(uuids);
        }
        return users;
    }

    @Override
    public <S extends User> List<S> saveAll(Iterable<S> entities) {
        List<S> users = new ArrayList<>();
        if (entities != null) {
            users = userRepository.saveAll(entities);
        }
        return users;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends User> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends User> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<User> entities) {
        if (entities != null) {
            userRepository.deleteAllInBatch(entities);
        }
    }

    @Override
    public void deleteAllByIdInBatch(Iterable<UUID> uuids) {
        if (uuids != null) {
            userRepository.deleteAllByIdInBatch(uuids);
        }
    }

    @Override
    public void deleteAllInBatch() {
    }

    @Override
    public User getOne(UUID uuid) {
        return null;
    }

    @Override
    public User getById(UUID uuid) {
        return null;
    }

    @Override
    public User getReferenceById(UUID uuid) {
        return userRepository.getReferenceById(uuid);
    }

    @Override
    public <S extends User> List<S> findAll(Example<S> example) {
        List<S> users = new ArrayList<>();
        if (example != null) {
            users = userRepository.findAll(example);
        }
        return users;
    }

    @Override
    public <S extends User> List<S> findAll(Example<S> example, Sort sort) {
        List<S> users = new ArrayList<>();
        if (example != null) {
            if (sort.isEmpty()) {
                sort = Sort.by(Sort.Direction.ASC, "last_name");
            }
            users = userRepository.findAll(example, sort);
        }
        return users;
    }
}
