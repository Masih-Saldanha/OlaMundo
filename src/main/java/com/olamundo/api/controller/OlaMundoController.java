package com.olamundo.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class OlaMundoController {
    @GetMapping
    public String OlaSpring() {
        return "Olá Spring";
    }
}
