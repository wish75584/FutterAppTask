package com.example.futterapptask.Models;

public class LoginResponse {
    private Status status;
    private Payload payload;

    public LoginResponse(Status status, Payload payload) {
        this.status = status;
        this.payload = payload;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Payload getPayload() {
        return payload;
    }

    public void setPayload(Payload payload) {
        this.payload = payload;
    }
}
