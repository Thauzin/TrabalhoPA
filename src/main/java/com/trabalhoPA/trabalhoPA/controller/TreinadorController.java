package com.trabalhoPA.trabalhoPA.controller;


import com.trabalhoPA.trabalhoPA.models.Treinador;
import com.trabalhoPA.trabalhoPA.DTOs.TreinadorDTO;
import com.trabalhoPA.trabalhoPA.services.TreinadorService;
import java.util.List;

public class TreinadorController {
    private TreinadorService service = new TreinadorService();

    public Treinador criar(TreinadorDTO dto) {
        return service.criar(dto);
    }

    public List<Treinador> listar() {
        return service.listar();
    }
}
