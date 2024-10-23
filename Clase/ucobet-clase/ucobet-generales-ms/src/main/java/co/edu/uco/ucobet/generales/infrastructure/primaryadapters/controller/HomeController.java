package co.edu.uco.ucobet.generales.infrastructure.primaryadapters.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/welcome")
    public String home() {
        return "Welcome to Ucobet!";
    }
}
