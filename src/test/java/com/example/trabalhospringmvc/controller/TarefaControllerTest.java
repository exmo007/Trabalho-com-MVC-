package com.example.trabalhospringmvc.controller;

import com.example.trabalhospringmvc.model.Tarefa;
import com.example.trabalhospringmvc.repository.TarefaRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class TarefaControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private TarefaRepository repository;

    @Autowired
    private ObjectMapper objectMapper;

    @BeforeEach
    void setup() {
        repository.deleteAll();
    }

    @Test
    void testCriarListarEDeletar() throws Exception {
        Tarefa t = new Tarefa("Teste MockMvc","PENDENTE");

        String json = objectMapper.writeValueAsString(t);

        // criar
        mockMvc.perform(post("/tarefas")
                .contentType(MediaType.APPLICATION_JSON)
                .content(json))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.id").exists());

        // listar
        mockMvc.perform(get("/tarefas")).andExpect(status().isOk())
                .andExpect(jsonPath("$[0].descricao").value("Teste MockMvc"));

        // deletar
        Long id = repository.findAll().get(0).getId();
        mockMvc.perform(delete("/tarefas/" + id)).andExpect(status().isNoContent());
    }
}
