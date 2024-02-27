package com.infogalaxy.librarymanagementsystem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create Controller Class for Author Request And Response Handle
 */
@RestController
@RequestMapping("author/api")
public class AuthorController {
    /**
     *
     * @return String - Welcome to Author API
     */
    @GetMapping("home")
    public String author(){
        return "Welcome to Author API";
    }
}
