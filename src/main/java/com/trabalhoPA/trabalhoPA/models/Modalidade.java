package com.trabalhoPA.trabalhoPA.models;
import com.trabalhoPA.trabalhoPA.DTOs.ModalidadeDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_modalidades")

public class Modalidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;
    private String descricao; 
    private int idadeMinima;

   // @ManyToMany
    // @JoinColumn(name = "modalidade_academia")

    public Modalidade(ModalidadeDTO modalidade) {
        this.id = modalidade.id();
        this.nome = modalidade.nome();
        this.descricao = modalidade.descricao();
        this.idadeMinima = modalidade.idadeMinima();

    }


}