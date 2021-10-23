package com.example.demo.service.impl;

import com.example.demo.dao.OnlineBookStoreDao;
import com.example.demo.entity.OnlineBookStore;
import com.example.demo.exception.BookNotFoundException;
import com.example.demo.service.OnlineBookStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OnlineBookStoreServiceImpl implements OnlineBookStoreService {

    @Autowired
    private OnlineBookStoreDao onlineBookStoreDao;

    @Override
    public OnlineBookStore publishNewBook(OnlineBookStore onlineBookStore) {
        return onlineBookStoreDao.save(onlineBookStore);
    }

    public List<OnlineBookStore> getAllBooks(){
        return onlineBookStoreDao.findAll();
    }

    @Override
    public OnlineBookStore getBookByAutherName(String authorNAme) throws BookNotFoundException {
        return onlineBookStoreDao.findByAuthorName(authorNAme);
    }

    @Override
    public OnlineBookStore getBookDetails(Long id) throws BookNotFoundException {
        return onlineBookStoreDao.findById(id).orElseThrow(()-> new BookNotFoundException("Book not found for this ID::"+ id));
    }

    public void  deleteBook(Long id){
         onlineBookStoreDao.deleteById(id);

    }

    public void updateBook(Long id){
        OnlineBookStore onlineBookStore= onlineBookStoreDao.getById(id);
        onlineBookStore.setAuthorName("changedName");
        onlineBookStoreDao.save(onlineBookStore);
    }
}
