package com.trabalhoPA.trabalhoPA.controller;

import com.trabalhoPA.trabalhoPA.DTOs.ModalidadeDTO;
import com.trabalhoPA.trabalhoPA.services.ModalidadeService; 

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController 
@RequestMapping("/modalidades")
public class ModalidadeController {

    @Autowired
    ModalidadeService modalidadeService;

    @GetMapping
    public List<ModalidadeDTO> listar(){
        return modalidadeService.listar();
    }

    @PostMapping
    public ModalidadeDTO criar(@RequestBody ModalidadeDTO modalidade){
        return modalidadeService.salvar(modalidade);
    }

    @GetMapping("/{id}")
    public ModalidadeDTO buscar(@PathVariable Long id){
        return modalidadeService.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public ModalidadeDTO atualizar(@PathVariable Long id, @RequestBody ModalidadeDTO modalidade){
        return modalidadeService.salvar(id, modalidade);
    }

    @DeleteMapping 
    public void deletar(@PathVariable Long id){
        modalidadeService.deletar(id);
    }

}
