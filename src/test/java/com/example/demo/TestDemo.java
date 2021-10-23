package com.example.demo;

import com.example.demo.entity.OnlineBookStore;
import com.example.demo.exception.BookNotFoundException;
import com.example.demo.service.impl.OnlineBookStoreServiceImpl;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestDemo {

    @Autowired
    OnlineBookStoreServiceImpl onlineBookStoreService;

    static OnlineBookStore onlineBookStore;

    @BeforeAll
     static void  testBeforeAll(){
        System.out.println("I am in before All method");
        onlineBookStore=new OnlineBookStore();
        onlineBookStore.setId(34L);
        onlineBookStore.setAuthorName("Sandeep Singh");
        onlineBookStore.setBookName("javSKS");
        onlineBookStore.setPlatoForm("Online platform");
        onlineBookStore.setPublisherName("XYZ");
    }

    @BeforeEach
    void testBefore(){
        System.out.println("I am in befor method");

    }

    @Test
    void testMethod(){
        System.out.println("I am in test method");
    }


    @Test
    void testMethodAgain(){
        System.out.println("I am in another test method");
    }

    @AfterEach
    void testAfterEacheMethod(){
        System.out.println("I am in afterEach  test method");
    }

    @Test
    public void testSave() throws BookNotFoundException {


        System.out.println(onlineBookStore);
        System.out.println(onlineBookStoreService);
        OnlineBookStore onlineBookStore1=onlineBookStoreService.publishNewBook(onlineBookStore);
        Assertions.assertNotNull(onlineBookStore1);
        Assertions.assertNotNull(onlineBookStore1.getId());
    }


}
