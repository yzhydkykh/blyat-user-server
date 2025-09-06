package com.example.demo.datatypes.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND, reason="No such User")  // 404
public class UserNotFoundException extends RuntimeException {
    private String userId;
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public UserNotFoundException(String userId) {
        this.userId = userId;
    }
}
