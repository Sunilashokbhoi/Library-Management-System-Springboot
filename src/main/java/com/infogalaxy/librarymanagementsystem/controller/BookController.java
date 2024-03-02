package com.infogalaxy.librarymanagementsystem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book/api")
public class BookController {

    @GetMapping("/book")
    public String book(){
        return "Welcome To Book Api";
    }
}
