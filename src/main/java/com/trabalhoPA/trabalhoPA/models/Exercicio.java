package com.trabalhoPA.trabalhoPA.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

public public class Exercicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;
    private String descricao;
    private String modalidade;

    public Exercicio() {
    }

    public Exercicio(String nome, String descricao, String modalidade) {
        this.nome = nome;
        this.descricao = descricao;
        this.modalidade = modalidade;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }
}
 {
    
}
