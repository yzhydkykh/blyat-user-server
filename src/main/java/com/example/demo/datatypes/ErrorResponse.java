package com.example.demo.datatypes;

import java.util.List;

public class ErrorResponse {
    private int code;
    private List<String> messages;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }
}
