package model.controller;

import model.DTO.TreinadorDTO;
import model.Treinador;
import model.service.TreinadorService;
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
