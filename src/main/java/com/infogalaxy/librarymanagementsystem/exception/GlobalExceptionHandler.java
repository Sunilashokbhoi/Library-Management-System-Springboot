package com.infogalaxy.librarymanagementsystem.exception;

import com.infogalaxy.librarymanagementsystem.responses.GlobalResponses;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.HashMap;
import java.util.Map;

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
   @ExceptionHandler({BookNotFoundException.class})
   public ResponseEntity<?> bookNotFoundById(BookNotFoundException bEX){
       return new ResponseEntity<>(new GlobalResponses("Book With Given Id Not Found In Database...",HttpStatus.NOT_FOUND),HttpStatus.NOT_FOUND);
   }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {

        Map<String,String> error = new HashMap<>();
       for(FieldError field : ex.getFieldErrors()){
           error.put(field.getField(),field.getDefaultMessage()) ;
         //  logger.info(field.getField()+"="+field.getDefaultMessage());
       }
       return new ResponseEntity<>(new GlobalResponses("Please enter Proper Input",HttpStatus.BAD_REQUEST,error),HttpStatus.BAD_REQUEST);
    }
}
