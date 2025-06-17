package model.service;

import model.Treinador;
import model.DTO.TreinadorDTO;
import model.repository.TreinadorRepository;
import java.util.List;

public class TreinadorService {
    private TreinadorRepository repository = new TreinadorRepository();

    public Treinador criar(TreinadorDTO dto) {
        Treinador t = new Treinador();
        t.setNome(dto.getNome());
        t.setTelefone(dto.getTelefone());
        t.setEndereco(dto.getEndereco());
        t.setAcademia(dto.getAcademia());
        repository.salvar(t);
        return t;
    }

    public List<Treinador> listar() {
        return repository.listar();
    }
}
