package com.example.demo.controller;

import com.example.demo.service.TargetSumIndexesService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class TargetSumIndexesControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private TargetSumIndexesService targetSumIndexesService;

    @Test
    public void testTargetSumIndexesControllerShouldReturnIsOk() throws Exception {
        this.mockMvc.perform(post("/targetIndexes")
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content("{\n" +
                        "  \"array\": [1, 5, 3, 6, 4, 2],\n" +
                        "  \"sum\": 6\n" +
                        "}"))
                .andDo(print())
                .andExpect(status().isOk());
    }
}
