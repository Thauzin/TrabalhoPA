package com.trabalhoPA.trabalhoPA.services;

import java.util.List;
import org.springframework.stereotype.Service;
import com.trabalhoPA.trabalhoPA.models.Modalidade;
import com.trabalhoPA.trabalhoPA.repositories.ModalidadeRepository;
import com.trabalhoPA.trabalhoPA.DTOs.ModalidadeDTO;
import jakarta.transaction.Transactional;

@Service
public class ModalidadeService {
    private final ModalidadeRepository modalidadeRepository; 

    public ModalidadeService(ModalidadeRepository modalidadeRepository) {
        this.modalidadeRepository = modalidadeRepository;
    }

    public List<ModalidadeDTO> listar(){
        return modalidadeRepository.findAll().stream().map(modalidade -> new ModalidadeDTO(modalidade)).toList();
    }

    public ModalidadeDTO salvar (ModalidadeDTO dto) {
        Modalidade nova = new Modalidade(dto);
        Modalidade salva = modalidadeRepository.save(nova);
        return new ModalidadeDTO(salva);
    }

   @Transactional
    public ModalidadeDTO salvar(Long id, ModalidadeDTO dto) {
        Modalidade modalidade = modalidadeRepository.findById(id).orElseThrow(() -> new RuntimeException("Modalidade com id " + id + " não encontrada"));

        modalidade.setNome(dto.nome());
        modalidade.setDescricao(dto.descricao());
        modalidade.setIdadeMinima(dto.idadeMinima());

        return new ModalidadeDTO(modalidade);
    }

    public ModalidadeDTO buscarPorId (Long id){
         return new ModalidadeDTO(modalidadeRepository.findById(id).orElseThrow(() -> new RuntimeException("Modalidade com id " + id + " não encontrada")));
    }

    public void deletar (Long id){
        modalidadeRepository.deleteById(id);
    }
}
