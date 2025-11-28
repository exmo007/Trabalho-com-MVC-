package com.example.trabalhospringmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.trabalhospringmvc.model.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}
