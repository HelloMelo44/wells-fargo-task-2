package com.wellsfargo.counselor.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class AdvisorControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void getAllAdvisorsReturnsSeededAdvisors() throws Exception {
        mockMvc.perform(get("/api/advisors"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(2)))
                .andExpect(jsonPath("$[0].advisorId").value(1))
                .andExpect(jsonPath("$[0].firstName").value("Maya"))
                .andExpect(jsonPath("$[0].lastName").value("Patel"))
                .andExpect(jsonPath("$[0].email").value("maya.patel@example.com"));
    }
}