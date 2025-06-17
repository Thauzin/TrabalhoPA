package com.trabalhoPA.trabalhoPA.services;


import com.trabalhoPA.trabalhoPA.DTOs.ExercicioDTO;
import com.trabalhoPA.trabalhoPA.models.Exercicio;

import com.trabalhoPA.trabalhoPA.repositories.ExercicioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExercicioService {

    private final ExercicioRepository repository;

    public ExercicioService(ExercicioRepository repository) {
        this.repository = repository;
    }

    public Exercicio salvar(ExercicioDTO dto) {
        Exercicio exercicio = new Exercicio(dto.getNome(), dto.getDescricao(), dto.getModalidade());
        return repository.save(exercicio);
    }

    public List<Exercicio> listarTodos() {
        return repository.findAll();
    }

    public Optional<Exercicio> buscarPorId(int id) {
        return repository.findById(id);
    }

    public void deletar(int id) {
        repository.deleteById(id);
    }
}
