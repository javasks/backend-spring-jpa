package com.example.demo.service.impl;

import com.example.demo.entity.OnlineBookStore;
import com.example.demo.exception.BookNotFoundException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class OnlineBookStoreServiceImplTest {


    @Autowired
    OnlineBookStoreServiceImpl onlineBookStoreService;

     static OnlineBookStore onlineBookStore;



    @BeforeAll
    static void createOnlineBookStoreEntity(){
        onlineBookStore= new OnlineBookStore();
        onlineBookStore.setId(1L);
        onlineBookStore.setBookName("PHP");
        onlineBookStore.setAuthorName("Bharath");
        onlineBookStore.setPublisherName("XYZ");
        onlineBookStore.setPlatoForm("Offline");
    }

    @Test
    void testPublishNewBook(){

       OnlineBookStore publishedBook= onlineBookStoreService.publishNewBook(onlineBookStore);
        Assertions.assertNotNull(publishedBook);

    }

    @Test
    void testgetBookByAutherName() throws BookNotFoundException {
        onlineBookStoreService.getBookByAutherName("Bharath");
    }

    @Test
    void testgetBookDetails() throws BookNotFoundException {
        onlineBookStoreService.getBookDetails(1L);
    }


}
