package com.infogalaxy.librarymanagementsystem.service;

import com.infogalaxy.librarymanagementsystem.entity.BookEntity;

import java.util.List;
import java.util.Optional;

public interface IBookService {
    public BookEntity createbook(BookEntity bookEntity);

    public List<BookEntity> retrieveallbooks();

    public Optional<BookEntity> retrievebookbyid(int id);

    public BookEntity updatebookbyid(int id,BookEntity bookEntity);

    public String deletebookbyid(int id);
}

