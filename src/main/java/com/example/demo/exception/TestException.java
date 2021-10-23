
package com.example.demo.exception;

import com.example.demo.dto.ErrorMessage;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class TestException extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = {Exception.class})
    public ResponseEntity<ErrorMessage> handleAnyException(Exception ex, WebRequest ws){

        ErrorMessage errorMessage=new ErrorMessage(new Date(), ex.getLocalizedMessage());
        return new ResponseEntity<>(
                errorMessage, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

   /* public ResponseEntity<ErrorMessage> handleBookRelatedException
            (BookNotFoundException ex, WebRequest ws){
        ErrorMessage errorMessage=new ErrorMessage(new Date(),ex.getMessage());
        return new ResponseEntity<>(errorMessage, new HttpHeaders(), HttpStatus.BAD_REQUEST);

    }*/
}

