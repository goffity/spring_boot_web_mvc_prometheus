package com.goffity.monitoring.spring.prometheus.controllers;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;


import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring-web-servlet.xml"})
//@WebAppConfiguration
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class UsersControllerTest {

    @Autowired
    private MockMvc mockMvc;

//    @InjectMocks
//    private UsersController usersController;

    @Before
    public void setUp() throws Exception {
//        MockitoAnnotations.initMocks(this);
//
//        mockMvc = MockMvcBuilders.standaloneSetup(usersController).build();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getAllUsers() throws Exception {
        MvcResult mvcResult = mockMvc.perform(post("/users")).andExpect(status().isOk()).andExpect(content().string("getAllUsers()")).andReturn();

        assertNotNull(mvcResult);
    }
}