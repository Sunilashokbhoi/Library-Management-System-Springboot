package com.infogalaxy.librarymanagementsystem.service;

import com.infogalaxy.librarymanagementsystem.entity.AuthorEntity;
import com.infogalaxy.librarymanagementsystem.exception.AuthorNotFoundException;
import com.infogalaxy.librarymanagementsystem.repo.IAuthorRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorService implements IAuthorService{
    @Autowired
    IAuthorRepo authorRepo;
    @Override
    public AuthorEntity createauthor(AuthorEntity authorEntity) {
        return authorRepo.save(authorEntity);
    }

    @Override
    public List<AuthorEntity> retrieveallauthors() {
        return authorRepo.findAll();
    }

    @Override
    public Optional<AuthorEntity> retrieveauthorbyid(int id) {
        Optional<AuthorEntity> authorEntity = authorRepo.findById(id);
        if (authorEntity.isPresent()) {
            return authorEntity;
        } else {
        throw new AuthorNotFoundException("Author with Given Id Not Found In Database");
        }
    }
    @Override
    public AuthorEntity updateauthorbyid(int id, AuthorEntity authorEntity) {
        AuthorEntity authornew = authorRepo.findById(id).get();
        BeanUtils.copyProperties(authorEntity,authornew);
        return authorRepo.save(authorEntity);
    }

    @Override
    public String deletauthorbyid(int id) {
        AuthorEntity authorEntity = authorRepo.findById(id).get();
        authorRepo.deleteById(id);
        return "Deleted Author Data By Given Id";
    }
}
