package controller;

public package com.seuprojeto.controller;

import com.seuprojeto.dto.ExercicioDTO;
import com.seuprojeto.model.Exercicio;
import com.seuprojeto.service.ExercicioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exercicios")
public class ExercicioController {

    private final ExercicioService service;

    public ExercicioController(ExercicioService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Exercicio> criar(@RequestBody ExercicioDTO dto) {
        Exercicio novo = service.salvar(dto);
        return ResponseEntity.ok(novo);
    }

    @GetMapping
    public ResponseEntity<List<Exercicio>> listar() {
        return ResponseEntity.ok(service.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Exercicio> buscar(@PathVariable int id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable int id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
 {
    
}
