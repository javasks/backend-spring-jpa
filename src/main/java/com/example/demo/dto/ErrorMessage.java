package com.example.demo.dto;

import java.util.Date;

public class ErrorMessage {

    private Date timestamp;
    private String message;
    private String description;

    public ErrorMessage(Date date, String localizedMessage, String localizedMessage1) {
        this.timestamp = timestamp;
        this.message = message;
        this.description=description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ErrorMessage(){

    }

    public ErrorMessage(Date timestamp, String message) {
        this.timestamp = timestamp;
        this.message = message;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
