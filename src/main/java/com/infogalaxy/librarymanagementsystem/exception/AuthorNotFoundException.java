package com.infogalaxy.librarymanagementsystem.exception;

public class AuthorNotFoundException extends RuntimeException{
    AuthorNotFoundException(String message){
        super(message);
    }
}
