package com.example.demo;

import com.example.demo.dao.OnlineBookStoreDao;
import com.example.demo.entity.OnlineBookStore;
import com.example.demo.exception.BookNotFoundException;
import com.example.demo.service.impl.OnlineBookStoreServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	OnlineBookStoreServiceImpl onlineBookStoreService;

	@Autowired
	OnlineBookStoreDao onlineBookStoreDao;

	OnlineBookStore onlineBookStore;
	@Test
	void contextLoads() throws BookNotFoundException {

		System.out.println("hello I am in context load:::::"+ onlineBookStoreService);
	}

	@Test
	void basicTest(){
		System.out.println("Hello I am in basic test");
		int expected=2;
		int actual=3;
		Assertions.assertNotEquals(expected,actual);
	}







}
