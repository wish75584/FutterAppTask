package com.example.futterapptask.Models;

public class User {
    private String _id;
    private String createdAt;
    private String name;
    private String email;

    public User(String _id, String createdAt, String name, String email) {
        this._id = _id;
        this.createdAt = createdAt;
        this.name = name;
        this.email = email;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

