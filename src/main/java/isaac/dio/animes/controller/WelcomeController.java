package isaac.dio.animes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping
    public String getWelcome() {
        return "Bem vindo!";
    }
}
