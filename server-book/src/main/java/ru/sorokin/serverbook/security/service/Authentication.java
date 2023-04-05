package ru.sorokin.serverbook.security.service;

import java.util.UUID;

public interface Authentication {
    void register(String login, String password);
    void checkCredentials(String login, String password);
}
