package com.infogalaxy.librarymanagementsystem.service;

import com.infogalaxy.librarymanagementsystem.entity.AuthorEntity;
import com.infogalaxy.librarymanagementsystem.repo.IAuthorRepo;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class AuthorServiceTest {

    @Test
    void createauthor() {
       AuthorEntity authorEntity = new AuthorEntity();
//        AuthorService authorService ;
//        @Autowired
//        IAuthorRepo authorRepo;
//
        authorEntity.setAuthorid(9);
        authorEntity.setAuthorname("Sachine");
        authorEntity.setAuthorcountry("India");

        AuthorService authorService = new AuthorService();
        authorService.createauthor(authorEntity);
        assertNotNull(authorEntity);
    }
}