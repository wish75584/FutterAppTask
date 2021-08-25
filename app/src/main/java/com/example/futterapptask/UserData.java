package com.example.futterapptask;

import com.example.futterapptask.Models.Meta;
import com.example.futterapptask.Models.Payload;
import com.example.futterapptask.Models.Status;

import java.util.List;


public class UserData {
    private Status status;

    private List<Payload> payload = null;

    private Meta meta;


    public UserData() {
    }

    public UserData(Status status, List<Payload> payload, Meta meta) {
        super();
        this.status = status;
        this.payload = payload;
        this.meta = meta;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<Payload> getPayload() {
        return payload;
    }

    public void setPayload(List<Payload> payload) {
        this.payload = payload;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }
}