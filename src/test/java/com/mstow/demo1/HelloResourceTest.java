//package com.mstow.demo1;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//
//import static org.mockito.Mockito.when;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
//
//public class HelloResourceTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @MockBean
//    B b;
//
//    @Test
//    public void testHello() throws Exception {
//        mockMvc.perform(get("/hello")).andExpect(content().string("Hello World"));
//    }
//
//    @Test
//    public void testWelcomeFromB() throws Exception {
//        String test = "test";
//        when(b.welcome()).thenReturn(test);
//        mockMvc.perform(get("/welcome")).andExpect(content().string(test));
//    }
//}