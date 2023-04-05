package ru.sorokin.serverbook.security.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.sorokin.serverbook.users.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class AuthService implements Authentication{
    private final UserRepository userRepository;
    @Override
    public void register(String login, String password) {
        if (userRepository)
    }

    @Override
    public void checkCredentials(String login, String password) {

    }
}
