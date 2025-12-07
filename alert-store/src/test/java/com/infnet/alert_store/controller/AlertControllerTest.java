//package com.infnet.alert_store.controller;
//
//import com.infnet.alert_store.repository.AlertRepository;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@SpringBootTest
//@AutoConfigureMockMvc
//@ActiveProfiles("test")
//public class AlertControllerTest {
//    @Autowired
//    private MockMvc mvc;
//
//    @Autowired
//    private AlertRepository repo;
//
//    @Test
//    void shouldCreateAlert() throws Exception {
//        String json = """
//        {"city":"Recife","temperature":32,"message":"Calor extremo"}
//        """;
//
//        mvc.perform(post("/alerts")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(json))
//                .andExpect(status().isOk());
//
//        assertEquals(1, repo.findAll().size());
//    }
//}
