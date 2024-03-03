package com.infogalaxy.librarymanagementsystem.controller;

import com.infogalaxy.librarymanagementsystem.entity.BookEntity;
import com.infogalaxy.librarymanagementsystem.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public BookEntity createbook(@RequestBody BookEntity bookEntity){
        return bookService.createbook(bookEntity);
    }
}
