/*
package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name="Book_Store")
public class BookBackup {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long bookId;

    public long getBookId() {
        return bookId;
    }

    @Override
    public String toString() {
        return "BookBackup{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @Column(name = "Book_CustomeName")
    String bookName;
    String authorName;
    @Transient
    String description;


}
*/
