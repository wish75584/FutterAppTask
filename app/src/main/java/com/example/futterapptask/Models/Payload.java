package com.example.futterapptask.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import retrofit2.http.Url;

public class Payload {

    private User user;
    private String token;


    @SerializedName("_id")
    @Expose
    private String id;

    @SerializedName("phone_number")
    @Expose
    private String phoneNumber;
    @SerializedName("createdAt")
    @Expose
    private String createdAt;


    @SerializedName("fcm_token")
    @Expose
    private String fcmToken;
    @SerializedName("first_name")
    @Expose
    private String firstName;

    @SerializedName("last_name")
    @Expose
    private String lastName;

    @SerializedName("occupation")
    @Expose
    private String occupation;

    private String email;

    private Url thumb;

    public Payload() {
    }


    public Payload(String phoneNumber, String createdAt, String firstName, String lastName, String occupation, String email, Url thumb) {
        this.user = user;
        this.token = token;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.createdAt = createdAt;
        this.fcmToken = fcmToken;
        this.firstName = firstName;
        this.lastName = lastName;
        this.occupation = occupation;
        this.email = email;
        this.thumb = thumb;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Payload(User user, String token) {
        this.user = user;
        this.token = token;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }


    public String getFcmToken() {
        return fcmToken;
    }

    public void setFcmToken(String fcmToken) {
        this.fcmToken = fcmToken;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public Url getThumb() {
        return thumb;
    }

    public void setThumb(Url thumb) {
        this.thumb = thumb;
    }
}
