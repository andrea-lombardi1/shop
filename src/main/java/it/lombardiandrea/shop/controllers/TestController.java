package it.lombardiandrea.shop.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${db.username}")
    private String username;
    @Value("${db.password}")
    private String password;

    @GetMapping("/test")
    public String stampa() {
        return String.format("Username: %s, Password: %s", username, password);
    }
}
