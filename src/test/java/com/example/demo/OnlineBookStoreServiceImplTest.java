package com.example.demo;

import com.example.demo.dao.OnlineBookStoreDao;
import com.example.demo.entity.OnlineBookStore;
import com.example.demo.service.impl.OnlineBookStoreServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class OnlineBookStoreServiceImplTest {


    @Mock
    OnlineBookStoreDao onlineBookStoreDao;

    @InjectMocks
    OnlineBookStoreServiceImpl onlineBookStoreService;


    OnlineBookStore onlineBookStore;


    @BeforeEach
    public void BeforeEachTest() {
        onlineBookStore = new OnlineBookStore();
        onlineBookStore.setId(34L);
        onlineBookStore.setAuthorName("Sandeep Singh");
        onlineBookStore.setBookName("javSKS");
        onlineBookStore.setPlatoForm("Online platform");
        onlineBookStore.setPublisherName("XYZ");


        Mockito.when(onlineBookStoreDao.save(onlineBookStore)).thenReturn(onlineBookStore);


    }

    @Test
    public void testSave() {
        OnlineBookStore onlineBookStore1 = onlineBookStoreService.publishNewBook(onlineBookStore);
        Assertions.assertNotNull(onlineBookStore1);
        Assertions.assertNotNull(onlineBookStore1.getId());


    }

}
