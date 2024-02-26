package com.infogalaxy.librarymanagementsystem.exception;

import com.infogalaxy.librarymanagementsystem.entity.LibraryMemberEntity;
import com.infogalaxy.librarymanagementsystem.responses.Responses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

   @ExceptionHandler(MemberNotFounfException.class)
    public ResponseEntity<?> memberNotFoundById(MemberNotFounfException Ex){
    return new ResponseEntity<>(new Responses("Member with Given ID Not Found in Database..", HttpStatus.NOT_FOUND),HttpStatus.NOT_FOUND);
   }
}
