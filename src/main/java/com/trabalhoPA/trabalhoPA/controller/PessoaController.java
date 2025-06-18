package com.trabalhoPA.trabalhoPA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.trabalhoPA.trabalhoPA.DTOs.PessoaDTO;
import com.trabalhoPA.trabalhoPA.models.Pessoa;
import com.trabalhoPA.trabalhoPA.services.PessoaService;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    @Autowired
    private PessoaService service;

    @PostMapping
    public ResponseEntity<Pessoa> criar(@RequestBody PessoaDTO dto) {
        Pessoa pessoa = service.criarPessoa(dto);
        return ResponseEntity.ok(pessoa);
    }

    @GetMapping
    public List<Pessoa> listar() {
        return service.listarTodas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pessoa> buscar(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pessoa> atualizar(@PathVariable Long id, @RequestBody PessoaDTO dto) {
        return service.atualizarPessoa(id, dto)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        boolean deletado = service.deletarPessoa(id);
        return deletado ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }
}
