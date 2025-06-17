package com.trabalhoPA.trabalhoPA.services;

import java.util.List;
import java.util.Optional;
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

    //public ModalidadeDTO salvar (ModalidadeDTO modalidadeDTO) {
        //Modalidade modalidadeEntity = new Modalidade(Modalidade);
    //}

  //  @Transactional
    //public ModalidadeDTO salvar(Long id, ModalidadeDTO modalidadeDTO) {
        //ModalidadeRepository.findById(id).orElseThrow(()-> new NaoEncontradoException("Ninja com id" + id +" não encontrado"));
   // }
}
