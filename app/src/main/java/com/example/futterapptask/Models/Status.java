package com.example.futterapptask.Models;

public class Status {

    private Long status_code;
    private String message;

    public Status() {
    }

    public Status(Long status_code, String message) {
        this.status_code = status_code;
        this.message = message;
    }

    public Long getStatus_code() {
        return status_code;
    }

    public void setStatus_code(Long status_code) {
        this.status_code = status_code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
