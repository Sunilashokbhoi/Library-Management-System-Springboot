package com.infogalaxy.librarymanagementsystem.service;

import com.infogalaxy.librarymanagementsystem.entity.BookEntity;
import com.infogalaxy.librarymanagementsystem.repo.IBookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService implements IBookService{

    @Autowired
    IBookRepo bookRepo;
    @Override
    public BookEntity createbook(BookEntity bookEntity) {
        return bookRepo.save(bookEntity);
    }

    @Override
    public List<BookEntity> retrieveallbooks() {
        return bookRepo.findAll();
    }
}
