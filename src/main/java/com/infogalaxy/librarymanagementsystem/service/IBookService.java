package com.infogalaxy.librarymanagementsystem.service;

import com.infogalaxy.librarymanagementsystem.entity.BookEntity;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface IBookService {
    public BookEntity createbook(BookEntity bookEntity);

    public List<BookEntity> retrieveallbooks();

    public BookEntity retrievebookbyid(int id);

    public BookEntity updatebookbyid(int id,BookEntity bookEntity);
}

