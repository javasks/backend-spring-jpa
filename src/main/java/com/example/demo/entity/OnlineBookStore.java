package com.example.demo.entity;


import javax.persistence.*;

@Entity
public class OnlineBookStore {

    @Override
    public String toString() {
        return "OnlineBookStore{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", publisherName='" + publisherName + '\'' +
                ", platoForm='" + platoForm + '\'' +
                '}';
    }

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

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column(name = "BOOK_NAME",nullable = false)
    String bookName;
    @Column(name = "AUTHOR_NAME",nullable = false)
    String authorName;
    @Column(name = "PUBLISHER_NAME")
    String publisherName;
    @Column(name = "PLATFORM")
    String platoForm;
}
