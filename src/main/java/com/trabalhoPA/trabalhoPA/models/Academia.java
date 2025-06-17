package com.trabalhoPA.trabalhoPA.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Academia {

    @Id
    private String cnpj;

    private String nome;
    private String modalidade;
    private String endereco;

    // Construtores
    public Academia() {}

    public Academia(String cnpj, String nome, String modalidade, String endereco) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.modalidade = modalidade;
        this.endereco = endereco;
    }

    // Getters e Setters
    public String getCnpj() { return cnpj; }
    public void setCnpj(String cnpj) { this.cnpj = cnpj; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getModalidade() { return modalidade; }
    public void setModalidade(String modalidade) { this.modalidade = modalidade; }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }
}
