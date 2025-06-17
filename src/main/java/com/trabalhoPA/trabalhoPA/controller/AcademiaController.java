package com.trabalhoPA.trabalhoPA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trabalhoPA.trabalhoPA.DTOs.AcademiaDTO;
import com.trabalhoPA.trabalhoPA.models.Academia;
import com.trabalhoPA.trabalhoPA.services.AcademiaService;

@RestController
@RequestMapping("/academias")
public class AcademiaController {

    @Autowired
    private AcademiaService service;

    @PostMapping
    public ResponseEntity<Academia> criar(@RequestBody AcademiaDTO dto) {
        Academia academia = service.criarAcademia(dto);
        return ResponseEntity.ok(academia);
    }

    @GetMapping
    public List<Academia> listar() {
        return service.listarTodas();
    }

    @GetMapping("/{cnpj}")
    public ResponseEntity<Academia> buscar(@PathVariable String cnpj) {
        return service.buscarPorCnpj(cnpj)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{cnpj}")
    public ResponseEntity<Academia> atualizar(@PathVariable String cnpj, @RequestBody AcademiaDTO dto) {
        return service.atualizarAcademia(cnpj, dto)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{cnpj}")
    public ResponseEntity<Void> deletar(@PathVariable String cnpj) {
        boolean deletado = service.deletarAcademia(cnpj);
        return deletado ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }
}
