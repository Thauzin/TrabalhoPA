package com.trabalhoPA.trabalhoPA.DTOs;

import com.trabalhoPA.trabalhoPA.models.Modalidade;

public record ModalidadeDTO (
    Long id,
    String nome,
    String descricao) {

public ModalidadeDTO (Modalidade modalidade) {
    this(
        modalidade.getId(),
        modalidade.getNome(),
        modalidade.getDescricao()
    );
}

}
