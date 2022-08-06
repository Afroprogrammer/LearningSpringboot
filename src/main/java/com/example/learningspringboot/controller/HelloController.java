package com.example.learningspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class HelloController {
    @GetMapping("/h")
    public String sayHello() {
        return "<h1>hello>";
    }
}
