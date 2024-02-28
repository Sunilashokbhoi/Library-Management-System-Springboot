package com.infogalaxy.librarymanagementsystem.exception;

import com.infogalaxy.librarymanagementsystem.responses.GlobalResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 *  GlobalExceptionHandler can generate an appropriate error message
 */
@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
   @ExceptionHandler(MemberNotFounfException.class)
    public ResponseEntity<?> memberNotFoundById(MemberNotFounfException Ex){
    return new ResponseEntity<>(new GlobalResponses("Member with Given ID Not Found in Database..", HttpStatus.NOT_FOUND),HttpStatus.NOT_FOUND);
   }

   @ExceptionHandler(AuthorNotFoundException.class)
    public ResponseEntity<?> authorNotFoundById(AuthorNotFoundException aEX){
       return new ResponseEntity<>(new GlobalResponses("Author With Given Id Not Found in Database..",HttpStatus.NOT_FOUND),HttpStatus.NOT_FOUND);
   }
}
