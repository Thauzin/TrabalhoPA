package com.trabalhoPA.trabalhoPA.repositories;

import com.trabalhoPA.trabalhoPA.models.Treinador;
import java.util.ArrayList;
import java.util.List;

public class TreinadorRepository {
    private List<Treinador> lista = new ArrayList<>();

    public void salvar(Treinador t) {
        lista.add(t);
    }

    public List<Treinador> listar() {
        return lista;
    }
}
