package com.example.demo;

import com.example.demo.controleer.ControllerTest;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringJUnit4ClassRunner.class)
public class ContTest {
    private MockMvc mockMvc;

    @InjectMocks
    ControllerTest controllerTest;

    @Before
    public void setUp(){
        mockMvc= MockMvcBuilders.standaloneSetup(controllerTest).build();
    }

    @Test
    public void testCheck() throws Exception {

        mockMvc.perform(MockMvcRequestBuilders.get("/check"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("testing my controller"))
;
    }


    @Test
    public void testHello() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/check"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("testing my controller"));
    }

}
