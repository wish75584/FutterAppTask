package com.example.futterapptask.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class SearchStatus {

    @SerializedName("status_code")
    @Expose
    private Integer statusCode;
    @SerializedName("message")
    @Expose
    private String message;

    /**
     * No args constructor for use in serialization
     */
    public SearchStatus() {
    }

    /**
     * @param message
     * @param statusCode
     */
    public SearchStatus(Integer statusCode, String message) {
        super();
        this.statusCode = statusCode;
        this.message = message;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}

