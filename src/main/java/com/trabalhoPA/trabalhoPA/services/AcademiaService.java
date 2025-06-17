package com.trabalhoPA.trabalhoPA.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// Import Academia and AcademiaDTO classes
import com.trabalhoPA.trabalhoPA.models.Academia;
import com.trabalhoPA.trabalhoPA.DTOs.AcademiaDTO;
import com.trabalhoPA.trabalhoPA.repositories.AcademiaRepository;

@Service
public class AcademiaService {

    @Autowired
    private AcademiaRepository repository;

    // Criar nova academia
    public Academia criarAcademia(AcademiaDTO dto) {
        Academia academia = new Academia(
                dto.getCnpj(),
                dto.getNome(),
                dto.getModalidade(),
                dto.getEndereco()
        );
        return repository.save(academia);
    }

    // Listar todas as academias
    public List<Academia> listarTodas() {
        return repository.findAll();
    }

    // Buscar por CNPJ
    public Optional<Academia> buscarPorCnpj(String cnpj) {
        return repository.findById(cnpj);
    }

    // Atualizar academia
    public Optional<Academia> atualizarAcademia(String cnpj, AcademiaDTO dto) {
        return repository.findById(cnpj).map(academia -> {
            academia.setNome(dto.getNome());
            academia.setModalidade(dto.getModalidade());
            academia.setEndereco(dto.getEndereco());
            return repository.save(academia);
        });
    }

    // Deletar academia
    public boolean deletarAcademia(String cnpj) {
        return repository.findById(cnpj).map(academia -> {
            repository.delete(academia);
            return true;
        }).orElse(false);
    }
}
