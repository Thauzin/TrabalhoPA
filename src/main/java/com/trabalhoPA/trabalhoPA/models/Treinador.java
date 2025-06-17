package com.trabalhoPA.trabalhoPA.models;

public class Treinador {
    private Long id;
    private String nome;
    private String telefone;
    private String endereco;
    private String academia;

    public Long getId(){ 
        return id; 
    }

    public void setId(Long id){ 
        this.id = id; 
    }

    public String getNome(){ 
        return nome; 
    }

    public void setNome(String nome){ 
        this.nome = nome;
    }

    public String getTelefone(){ 
        return telefone; 
    }

    public void setTelefone(String telefone){ 
        this.telefone = telefone; 
    }

    public String getEndereco(){ 
        return endereco; 
    }

    public void setEndereco(String endereco){ 
        this.endereco = endereco; 
    }

    public String getAcademia(){ 
        return academia; 
    }

    public void setAcademia(String academia){ 
        this.academia = academia; 
    }
}
