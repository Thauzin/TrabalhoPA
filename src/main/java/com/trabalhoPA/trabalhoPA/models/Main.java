package com.trabalhoPA.trabalhoPA.models;

import com.trabalhoPA.trabalhoPA.DTOs.TreinadorDTO;
import com.trabalhoPA.trabalhoPA.controller.TreinadorController;

public class Main {
    public static void main(String[] args) {
        TreinadorDTO dto = new TreinadorDTO();
        dto.setNome("Maria");
        dto.setTelefone("123456");
        dto.setEndereco("Rua 1");
        dto.setAcademia("TopGym");

        TreinadorController controller = new TreinadorController();
        Treinador t = controller.criar(dto);
        System.out.println("Treinador criado: " + t.getNome());
    }
}
