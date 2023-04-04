package ru.sorokin.serverbook.users.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sorokin.serverbook.users.User;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
