package com.example.trabalhospringmvc.service;

import com.example.trabalhospringmvc.model.Tarefa;
import com.example.trabalhospringmvc.repository.TarefaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TarefaService {

    private final TarefaRepository repository;

    public TarefaService(TarefaRepository repository) {
        this.repository = repository;
    }

    public Tarefa criarTarefa(Tarefa tarefa) {
        return repository.save(tarefa);
    }

    public List<Tarefa> listarTarefas() {
        return repository.findAll();
    }

    public Optional<Tarefa> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Tarefa atualizarTarefa(Long id, Tarefa novaTarefa) {
        return repository.findById(id).map(t -> {
            t.setDescricao(novaTarefa.getDescricao());
            t.setStatus(novaTarefa.getStatus());
            return repository.save(t);
        }).orElseThrow(() -> new RuntimeException("Tarefa não encontrada com id: " + id));
    }

    public void deletarTarefa(Long id) {
        repository.deleteById(id);
    }
}
