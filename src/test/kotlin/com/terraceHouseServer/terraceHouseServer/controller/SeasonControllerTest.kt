package com.terraceHouseServer.terraceHouseServer.controller

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get

@SpringBootTest
@AutoConfigureMockMvc
internal class SeasonControllerTest {

    @Autowired
    lateinit var mockMvc: MockMvc

    @Test
    fun `endpoint returns 200 status code`() {
        mockMvc.get("/seasons/")
            .andDo { print() }
            .andExpect {
                status { isOk() }
            }
    }

}