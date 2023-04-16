package ru.sorokin.serverbook.users;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sorokin.serverbook.users.service.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path = "/users/")
@RequiredArgsConstructor
public class UserController {
    private final UserService<User, UUID> userService;

    public List<User> findAll() {
        return userService.findAll();
    }

    public List<User> findAll(Sort sort) {
        if (sort.isEmpty()) {
            sort = Sort.by(Sort.Direction.ASC, "last_name");
        }
        return userService.findAll(sort);
    }

    public List<User> findAllById(Iterable<UUID> uuids) {
        List<User> users = new ArrayList<>();
        if (uuids != null) {
            users = userService.findAllById(uuids);
        }
        return users;
    }

    public <S extends User> List<S> saveAll(Iterable<S> entities) {
        List<S> users = new ArrayList<>();
        if (entities != null) {
            users = userService.saveAll(entities);
        }
        return users;
    }

    public void deleteAllInBatch(Iterable<User> entities) {
        if (entities != null) {
            userService.deleteAllInBatch(entities);
        }
    }

    public void deleteAllByIdInBatch(Iterable<UUID> uuids) {
        if (uuids != null) {
            userService.deleteAllByIdInBatch(uuids);
        }
    }

    public User getReferenceById(UUID uuid) {
        return userService.getReferenceById(uuid);
    }

    public <S extends User> List<S> findAll(Example<S> example) {
        List<S> users = new ArrayList<>();
        if (example != null) {
            users = userService.findAll(example);
        }
        return users;
    }

    public <S extends User> List<S> findAll(Example<S> example, Sort sort) {
        List<S> users = new ArrayList<>();
        if (example != null) {
            if (sort.isEmpty()) {
                sort = Sort.by(Sort.Direction.ASC, "last_name");
            }
            users = userService.findAll(example, sort);
        }
        return users;
    }

}
