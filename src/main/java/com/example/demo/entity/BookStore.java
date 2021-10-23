/*
package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "BOOK_ONLINE_STORE")
public class BookStore {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long bookID;
    //@Column(name = "BOOK_NAME")
    @Column(nullable = false,name = "BOOK_NAME")
    String bookName;

    @Override
    public String toString() {
        return "BookStore{" +
                "bookID=" + bookID +
                ", bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                '}';
    }

    public Long getBookID() {
        return bookID;
    }

    public void setBookID(Long bookID) {
        this.bookID = bookID;
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
    @Transient
    String  authorName;
}
*/
