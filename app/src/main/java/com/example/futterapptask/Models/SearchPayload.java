package com.example.futterapptask.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SearchPayload {


    @SerializedName("is_pro")
    @Expose
    private Boolean isPro;
    @SerializedName("is_online")
    @Expose
    private Boolean isOnline;
    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("phone_number")
    @Expose
    private String phoneNumber;
    @SerializedName("createdAt")
    @Expose
    private String createdAt;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("first_name")
    @Expose
    private String firstName;
    @SerializedName("last_name")
    @Expose
    private String lastName;
    @SerializedName("occupation")
    @Expose
    private String occupation;
    @SerializedName("thumb")
    @Expose
    private String thumb;


    public SearchPayload(Boolean isPro, Boolean isOnline, String id, String phoneNumber, String createdAt, String city, String country, String firstName, String lastName, String occupation, String thumb) {
        super();
        this.isPro = isPro;
        this.isOnline = isOnline;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.createdAt = createdAt;
        this.city = city;
        this.country = country;
        this.firstName = firstName;
        this.lastName = lastName;
        this.occupation = occupation;
        this.thumb = thumb;
    }

    public Boolean getIsPro() {
        return isPro;
    }

    public void setIsPro(Boolean isPro) {
        this.isPro = isPro;
    }

    public Boolean getIsOnline() {
        return isOnline;
    }

    public void setIsOnline(Boolean isOnline) {
        this.isOnline = isOnline;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }
}
