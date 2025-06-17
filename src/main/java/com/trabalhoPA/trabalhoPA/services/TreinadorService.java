package com.trabalhoPA.trabalhoPA.services;


import com.trabalhoPA.trabalhoPA.models.Treinador;

import com.trabalhoPA.trabalhoPA.DTOs.TreinadorDTO;

import com.trabalhoPA.trabalhoPA.repositories.TreinadorRepository;
import java.util.List;

public class TreinadorService {
    private TreinadorRepository repository = new TreinadorRepository();

    public Treinador criar(TreinadorDTO dto) {
        Treinador t = new Treinador();
        t.setNome(dto.getNome());
        t.setTelefone(dto.getTelefone());
        t.setEndereco(dto.getEndereco());
        t.setAcademia(dto.getAcademia());
        repository.salvar(t);
        return t;
    }

    public List<Treinador> listar() {
        return repository.listar();
    }
}
