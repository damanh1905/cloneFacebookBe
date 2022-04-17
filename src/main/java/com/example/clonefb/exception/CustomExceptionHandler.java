package com.example.clonefb.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class CustomExceptionHandler {
    @ExceptionHandler(NotfoundException.class)
    public ResponseEntity<?> handlerNotFoundException(NotfoundException ex , WebRequest req ){
        ErrorResponse err = new ErrorResponse(404, HttpStatus.NOT_FOUND,ex.getMessage());
        return new ResponseEntity<>(err,HttpStatus.NOT_FOUND);
    }
    //  Xử lý tất cả các exception chưa được khai báo
    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> handlerException(Exception ex, WebRequest req){
        ErrorResponse err = new ErrorResponse(500,HttpStatus.INTERNAL_SERVER_ERROR,ex.getMessage());
        return new ResponseEntity<>(err,HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
