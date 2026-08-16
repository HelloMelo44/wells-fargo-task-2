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
class PortfolioControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void getAllPortfoliosReturnsSeededPortfolios() throws Exception {
        mockMvc.perform(get("/api/portfolios"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(3)))
                .andExpect(jsonPath("$[0].portfolioId").value(1))
                .andExpect(jsonPath("$[0].portfolioName").value("Aisha Retirement Portfolio"))
                .andExpect(jsonPath("$[0].portfolioType").value("Retirement"))
                .andExpect(jsonPath("$[0].customerId").value(1))
                .andExpect(jsonPath("$[0].customerName").value("Aisha Khan"));
    }
}