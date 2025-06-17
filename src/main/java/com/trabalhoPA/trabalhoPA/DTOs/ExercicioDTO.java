package com.trabalhoPA.trabalhoPA.DTOs;

public class ExercicioDTO {

    private String nome;
    private String descricao;
    private String modalidade;

    public ExercicioDTO() {
    }

    public ExercicioDTO(String nome, String descricao, String modalidade) {
        this.nome = nome;
        this.descricao = descricao;
        this.modalidade = modalidade;
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
