package guru.springframework.mspcokeservice.web.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import guru.springframework.mspcokeservice.web.model.CokeDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.UUID;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(CokeController.class)
class CokeControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void getCokeById() throws Exception {
        mockMvc.perform(get("/api/v1/coke/" + UUID.randomUUID().toString()).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    void saveNewCoke() throws Exception {

        CokeDto cokeDto = CokeDto.builder().build();
        String cokeDtoJson = objectMapper.writeValueAsString(cokeDto);

        mockMvc.perform(post("/api/v1/beer/")
                .contentType(MediaType.APPLICATION_JSON)
                .content(cokeDtoJson))
                .andExpect(status().isCreated());
    }

    @Test
    void updateCokeById() throws Exception {

        CokeDto cokeDto = CokeDto.builder().build();
        String cokeDtoJson = objectMapper.writeValueAsString(cokeDto);

        mockMvc.perform(put("/api/v1/beer/" + UUID.randomUUID().toString())
                .contentType(MediaType.APPLICATION_JSON)
                .content(cokeDtoJson))
                .andExpect(status().isNoContent());
    }
}