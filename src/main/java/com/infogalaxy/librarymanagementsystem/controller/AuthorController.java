package com.infogalaxy.librarymanagementsystem.controller;
import com.infogalaxy.librarymanagementsystem.entity.AuthorEntity;
import com.infogalaxy.librarymanagementsystem.responses.GlobalResponses;
import com.infogalaxy.librarymanagementsystem.service.IAuthorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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
     * @return- Custome Responses -  Custom Response object with response data
     */
    @PostMapping("/createauthor")
    public ResponseEntity<?> createauthor(@RequestBody @Valid AuthorEntity authorEntity){
        return new ResponseEntity<>(new GlobalResponses("Created Authod Data Successfully...", HttpStatus.CREATED,authorService.createauthor(authorEntity)),HttpStatus.CREATED);
    }

    /**
     * API to retrieve all authors Data in Databse
     * @return- Custome Responses List Of Objects
     */
    @GetMapping("/retriveallauthors")
    public ResponseEntity<?> retrieveallauthors(){
        return new ResponseEntity<>(new GlobalResponses("Retrieve All Authors Successfully...",HttpStatus.FOUND,authorService.retrieveallauthors()),HttpStatus.FOUND);
    }

    @GetMapping("retrieveauthorbyid/{id}")
    public ResponseEntity<?> retrieveauthorbyid(@PathVariable("id")int id){
        return new ResponseEntity<>(new GlobalResponses("Author Retrieve By Given Id In Database..",HttpStatus.ACCEPTED,authorService.retrieveauthorbyid(id)),HttpStatus.ACCEPTED) ;
    }

    @PutMapping("updateauthorbyid/{id}")
    public ResponseEntity<?> updateauthorbyid(@PathVariable("id")int id,@RequestBody AuthorEntity authorEntity){
        return new ResponseEntity<>(new GlobalResponses("Author Are Update Given By Id.",HttpStatus.FOUND, authorService.updateauthorbyid(id,authorEntity)),HttpStatus.FOUND);
    }

    @DeleteMapping("deleteauthorbyid/{id}")
    public ResponseEntity<?> deletauthorbyid(@PathVariable("id") int id){
       return new ResponseEntity<>(new GlobalResponses("Deleted Author By Given Id",HttpStatus.ACCEPTED,authorService.deletauthorbyid(id)),HttpStatus.ACCEPTED);
    }
}
