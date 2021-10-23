package com.example.demo.service;


import com.example.demo.entity.OnlineBookStore;
import com.example.demo.exception.BookNotFoundException;

import java.util.List;

/**
 *
 */
public interface OnlineBookStoreService {


    public OnlineBookStore publishNewBook(OnlineBookStore onlineBookStore);

    public OnlineBookStore getBookByAutherName(String authorNAme) throws BookNotFoundException;

    public OnlineBookStore getBookDetails(Long id) throws BookNotFoundException;

    public List<OnlineBookStore> getAllBooks();

    public void deleteBook(Long id);

    public void updateBook(Long id);

}
