package com.example.demo.controller;

import com.example.demo.datatypes.ErrorResponse;
import com.example.demo.datatypes.exceptions.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.ArrayList;

@ControllerAdvice
public class GlobalControllerExceptionHandler {



        @ExceptionHandler(UserNotFoundException.class)
        public ResponseEntity<ErrorResponse> handleException(UserNotFoundException ex) {
            ErrorResponse errorResponse = new ErrorResponse();
            errorResponse.setCode(HttpStatus.NOT_FOUND.value());
            errorResponse.setMessages(new ArrayList<>());
            errorResponse.getMessages().add("User with ID " + ex.getUserId() + "not found");
            return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
        }
}
