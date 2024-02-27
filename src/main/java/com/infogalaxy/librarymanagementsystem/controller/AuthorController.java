package com.infogalaxy.librarymanagementsystem.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("author/api")
public class AuthorController {
    @RequestMapping("home")
    public String author(){
        return "Welcome to Author API";
    }
}
