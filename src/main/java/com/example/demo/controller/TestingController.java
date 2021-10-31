
package com.example.demo.controller;

import com.example.demo.entity.OnlineBookStore;
import com.example.demo.exception.BookNotFoundException;
import com.example.demo.service.OnlineBookStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class TestingController {

    @Autowired
    OnlineBookStoreService onlineBookStoreService;


    @GetMapping("/sayhi")
    public ResponseEntity helloDude(){

        return new ResponseEntity("Hello Dude , how r u", HttpStatus.OK);
    }

    @GetMapping("/books")
    public ResponseEntity getAllBooks(){
     List<OnlineBookStore> onlineBookStoreList=onlineBookStoreService.getAllBooks();
    return new ResponseEntity(onlineBookStoreList,HttpStatus.OK);

    }

    @GetMapping("/books/{name}")
    public ResponseEntity getBookByAutherName(
            @PathVariable(name = "name") String name) throws BookNotFoundException {
        OnlineBookStore onlineBookStore=onlineBookStoreService.getBookByAutherName(name);
        return new ResponseEntity(onlineBookStore,HttpStatus.OK);

    }
}

