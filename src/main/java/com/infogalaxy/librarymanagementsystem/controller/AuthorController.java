package com.infogalaxy.librarymanagementsystem.controller;

import com.infogalaxy.librarymanagementsystem.entity.AuthorEntity;
import com.infogalaxy.librarymanagementsystem.repo.IAuthorRepo;
import com.infogalaxy.librarymanagementsystem.service.IAuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Create Controller Class for Author Request And Response Handle
 */
@RestController
@RequestMapping("author/api")
public class AuthorController {
    @Autowired
    IAuthorService authorService;

    /**s
     * @return String - Welcome to Author API
     */
    @GetMapping("home")
    public String author(){
        return "Welcome to Author API";
    }

    /**
     * API to create Author Data in Database
     * @param authorEntity - Object of a AuthorEntity
     * @return- authorentity object
     */
    @PostMapping("/createauthor")
    public AuthorEntity createauthor(@RequestBody AuthorEntity authorEntity){
        return authorService.createauthor(authorEntity);
    }
}
