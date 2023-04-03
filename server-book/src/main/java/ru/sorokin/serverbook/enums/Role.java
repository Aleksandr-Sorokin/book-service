package ru.sorokin.serverbook.enums;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

@RequiredArgsConstructor
public enum Role implements GrantedAuthority {
    ADMIN("ADMIN"),
    USER("USER"),
    GUEST("GUEST");
    private final String value;

    @Override
    public String getAuthority() {
        return value;
    }
}
