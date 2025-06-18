package com.trabalhoPA.trabalhoPA.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import com.trabalhoPA.trabalhoPA.models.Pessoa;
import com.trabalhoPA.trabalhoPA.DTOs.PessoaDTO;
import com.trabalhoPA.trabalhoPA.repositories.PessoaRepository;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository repository;

    // Criar nova pessoa
    public Pessoa criarPessoa(PessoaDTO dto) {
        Pessoa pessoa = new Pessoa(
                dto.getAltura(),
                dto.getPeso(),
                dto.getNome(),
                dto.getTelefone(),
                dto.getEndereco()
        );
        return repository.save(pessoa);
    }

    // Listar todas as pessoas
    public List<Pessoa> listarTodas() {
        return repository.findAll();
    }

    // Buscar por ID
    public Optional<Pessoa> buscarPorId(Long id) {
        return repository.findById(id);
    }

    // Atualizar pessoa
    public Optional<Pessoa> atualizarPessoa(Long id, PessoaDTO dto) {
        return repository.findById(id).map(pessoa -> {
            pessoa.setAltura(dto.getAltura());
            pessoa.setPeso(dto.getPeso());
            pessoa.setNome(dto.getNome());
            pessoa.setTelefone(dto.getTelefone());
            pessoa.setEndereco(dto.getEndereco());
            return repository.save(pessoa);
        });
    }

    // Deletar pessoa
    public boolean deletarPessoa(Long id) {
        return repository.findById(id).map(pessoa -> {
            repository.delete(pessoa);
            return true;
        }).orElse(false);
    }
}
