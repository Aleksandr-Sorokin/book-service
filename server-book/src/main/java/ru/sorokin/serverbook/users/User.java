package ru.sorokin.serverbook.users;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.sorokin.serverbook.enums.Role;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String login;
    private String password;
    private String firstName;
    private String lastName;
    private Set<Role> roles;
}
