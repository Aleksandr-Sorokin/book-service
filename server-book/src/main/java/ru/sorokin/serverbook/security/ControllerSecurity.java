package ru.sorokin.serverbook.security;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sorokin.serverbook.security.service.AuthService;

@RestController
@RequestMapping("api")
@RequiredArgsConstructor
public class ControllerSecurity {
    private final AuthService authService;

}
