package com.infogalaxy.librarymanagementsystem.service;

import com.infogalaxy.librarymanagementsystem.entity.AuthorEntity;

import java.util.List;

public interface IAuthorService {

    public AuthorEntity createauthor(AuthorEntity authorEntity);

    public List<AuthorEntity> retrieveallauthors();


    public AuthorEntity retrieveauthorbyid(int id);

    public AuthorEntity updateauthorbyid(int id,AuthorEntity authorEntity);

}
