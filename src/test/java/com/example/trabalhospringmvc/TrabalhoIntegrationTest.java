package com.example.trabalhospringmvc;

import com.example.trabalhospringmvc.model.Tarefa;
import com.example.trabalhospringmvc.repository.TarefaRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class TrabalhoIntegrationTest {

    @Autowired
    private TarefaRepository repository;

    @Test
    void testCriacaoEBusca() {
        Tarefa t = new Tarefa("Testar integração", "PENDENTE");
        Tarefa salva = repository.save(t);

        assertThat(salva.getId()).isNotNull();
        assertThat(repository.findById(salva.getId())).isPresent();
    }
}
