package com.prernaprasad14.todo.services;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice 
public class GlobalExceptionHandler {
    
     /* the exception handler handles exception thrown in the service layer and returns 
    status code 400 for IlleagalArguments */
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handleIllegalArgumentException(
            IllegalArgumentException e) {

        return ResponseEntity.badRequest().body(e.getMessage());
    }

}
