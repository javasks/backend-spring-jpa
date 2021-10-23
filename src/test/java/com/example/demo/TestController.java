package com.example.demo;

import com.example.demo.controleer.HelloController;
import com.example.demo.service.impl.HelloServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;



@RunWith(SpringJUnit4ClassRunner.class)
public class TestController {

    private MockMvc mockMvc;

    @Mock
    private HelloServiceImpl helloServiceImpl;

    @InjectMocks
    private HelloController helloController;

    @Before
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(helloController)
                .build();
    }

    @Test
    public void testHelloWorld() throws Exception {

        Mockito.when(helloServiceImpl.hello()).thenReturn("hello you are testing your controller");

        mockMvc.perform(MockMvcRequestBuilders.get("/hello"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("hello you are testing your controller"));

        Mockito.verify(helloServiceImpl).hello();
    }

}
