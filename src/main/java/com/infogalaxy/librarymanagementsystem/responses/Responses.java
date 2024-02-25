package com.infogalaxy.librarymanagementsystem.responses;

import lombok.Data;
import org.springframework.http.HttpStatus;

/**
 * Create a Custome Responses
 */
@Data
public class Responses {

    private String message;
    private HttpStatus code;
    private Object object;

    public Responses(String message){
        this.message=message;
    }

    public Responses(String message, HttpStatus code){
        this.message=message;
        this.code=code;
    }
    public Responses(String message,HttpStatus code,Object object){
        this.message=message;
        this.code=code;
        this.object=object;
    }
}
