package com.infogalaxy.librarymanagementsystem.service;

import com.infogalaxy.librarymanagementsystem.entity.AuthorEntity;

import java.util.List;

public interface IAuthorService {

    public AuthorEntity createauthor(AuthorEntity authorEntity);

    public List<AuthorEntity> retrieveallauthors();


    AuthorEntity retrieveauthorbyid(int id);
}
