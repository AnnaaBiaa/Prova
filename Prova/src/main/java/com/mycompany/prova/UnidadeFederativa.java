/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.prova;

/**
 *
 * @author Aluno
 */
public enum UnidadeFederativa {
    
    BAHIA("Bahia","Ba"),
    SAO_PAULO("São Paulo","Sp"),
    RIO_DE_JANEIRO("Rio de Janeiro","Rj"),
    ESPIRITO_SANTO("Espirito Santo","Es");
    
    
    private String nome;
    private String sigla;

    private UnidadeFederativa(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
    
    
    
    
    
}
