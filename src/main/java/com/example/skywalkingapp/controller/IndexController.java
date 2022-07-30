package com.example.skywalkingapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

/**
 * @author handsome
 */
@RestController
public class IndexController {
    @GetMapping("/")
    public String index() {
        return "Hello World. " + LocalDate.now().toString();
    }
}
