package dev.grebechi.model;

import dev.grebechi.util.StringUtils;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private Endereco endereco;

    public Pessoa(String nome, String sobrenome, Endereco endereco) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public String getNomeCompleto(){
        return StringUtils.capitalizarNome(nome) + " " + StringUtils.capitalizarNome(sobrenome);
    }
}
