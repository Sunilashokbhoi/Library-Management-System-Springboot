package com.infogalaxy.librarymanagementsystem.service;

import com.infogalaxy.librarymanagementsystem.entity.BookEntity;
import com.infogalaxy.librarymanagementsystem.exception.AuthorNotFoundException;
import com.infogalaxy.librarymanagementsystem.exception.BookNotFoundException;
import com.infogalaxy.librarymanagementsystem.repo.IBookRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public Optional<BookEntity> retrievebookbyid(int id) {

        Optional<BookEntity> bookEntity = bookRepo.findById(id);
        if (bookEntity.isPresent()) {
            return bookEntity;
        }else {
         throw new BookNotFoundException("Book Are Not Found In Database..");
        }
    }
    @Override
    public BookEntity updatebookbyid(int id, BookEntity bookEntity) {
        BookEntity bookEntitynew = bookRepo.findById(id).get();
      BeanUtils.copyProperties(bookEntity,bookEntitynew);
      return bookRepo.save(bookEntitynew);

    }

    @Override
    public String deletebookbyid(int id) {
        BookEntity bookentity = bookRepo.findById(id).get();
        bookRepo.delete(bookentity);
        return "Deleted By Given Id Successfully...";
    }
}
