package com.infogalaxy.librarymanagementsystem.service;

import com.infogalaxy.librarymanagementsystem.entity.AuthorEntity;

import java.util.List;
import java.util.Optional;

public interface IAuthorService {

    public AuthorEntity createauthor(AuthorEntity authorEntity);

    public List<AuthorEntity> retrieveallauthors();


    public Optional<AuthorEntity> retrieveauthorbyid(int id);

    public AuthorEntity updateauthorbyid(int id,AuthorEntity authorEntity);

    public String deletauthorbyid(int id);

}
