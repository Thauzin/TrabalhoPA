package com.trabalhoPA.trabalhoPA.DTOs;

public class TreinadorDTO {
    private String nome;
    private String telefone;
    private String endereco;
    private String academia;

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
