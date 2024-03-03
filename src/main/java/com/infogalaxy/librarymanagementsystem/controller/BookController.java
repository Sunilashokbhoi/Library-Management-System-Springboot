package com.infogalaxy.librarymanagementsystem.controller;

import com.infogalaxy.librarymanagementsystem.entity.AuthorEntity;
import com.infogalaxy.librarymanagementsystem.entity.BookEntity;
import com.infogalaxy.librarymanagementsystem.responses.GlobalResponses;
import com.infogalaxy.librarymanagementsystem.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book/api")
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping("/book")
    public String book(){
        return "Welcome To Book Api";
    }

    @PostMapping("createbook")
    public ResponseEntity<?> createbook(@RequestBody BookEntity bookEntity){
        return new ResponseEntity<>(new GlobalResponses("Book Created Successfully  ", HttpStatus.CREATED,bookService.createbook(bookEntity)),HttpStatus.CREATED) ;
    }

    @GetMapping("retrieveallbooks")
    public ResponseEntity<?> retrieveallbooks(){
        return new ResponseEntity<>(new GlobalResponses("Retrieve All Books Successfully ..",HttpStatus.FOUND,bookService.retrieveallbooks()),HttpStatus.FOUND);
    }
    @GetMapping("/retrievebookbyid/{id}")
    public ResponseEntity<?> retrievebookbyid(@PathVariable("id") int id){
        return new ResponseEntity<>(new GlobalResponses("Retrive Book Given By Id Successfully..",HttpStatus.ACCEPTED,bookService.retrievebookbyid(id)),HttpStatus.ACCEPTED);
    }
    @PutMapping("/updatebookbyid/{id}")
    public ResponseEntity<?> updatebookbyid(@PathVariable ("id") int id,@RequestBody BookEntity bookEntity){
        return new ResponseEntity<>(new GlobalResponses("Update Book By Given Id Successfully...",HttpStatus.FOUND,bookService.updatebookbyid(id,bookEntity)),HttpStatus.FOUND);
    }
}
