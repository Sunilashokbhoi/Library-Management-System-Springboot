package com.infogalaxy.librarymanagementsystem.service;

import com.infogalaxy.librarymanagementsystem.entity.BookEntity;

import java.util.List;

public interface IBookService {
    public BookEntity createbook(BookEntity bookEntity);

    public List<BookEntity> retrieveallbooks();
}

