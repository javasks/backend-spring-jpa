package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class OnlineBookStoreDTO {
    Long id;
    @NotNull(message = "book number should not be null and it is required")
    String bookName;
    @NotNull(message = "author name is required")
    String authorName;
    @NotNull(message = "publisher name is required")
    @Size(min = 0,max = 2)
    String publisherName;
    @NotNull
    String platoForm;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getPlatoForm() {
        return platoForm;
    }

    public void setPlatoForm(String platoForm) {
        this.platoForm = platoForm;
    }
}
