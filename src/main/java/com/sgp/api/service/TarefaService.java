package com.sgp.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.sgp.api.model.Tarefa;
import com.sgp.api.repository.TarefaRepository;

public class TarefaService {
    
    @Autowired
    private TarefaRepository tarefaRepository;

    public List<Tarefa> carregarTarefas() {
        return tarefaRepository.findAll();
    }

    public Optional<Tarefa> carregarTarefasPeloId(Long id) {
        return tarefaRepository.findById(id);
    }

    public void deletarTarefa(Long id) {
        tarefaRepository.deleteById(id);
    }
}
