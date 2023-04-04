package ru.sorokin.serverbook.security.service;

import java.util.UUID;

public interface Authentication {
    void register(UUID id, String login, String password);
}
