/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Cliente extends Fisica{

    private int protocoloAtendimento;

    public Cliente(int protocoloAtendimento, LocalDate dataNascimento, Genero genero, int idade, String nome, String telefone, String email, Endereco endereco) {
        super(dataNascimento, genero, idade, nome, telefone, email, endereco);
        this.protocoloAtendimento = protocoloAtendimento;
    }

   

    public int getProtocoloAtendimento() {
        return protocoloAtendimento;
    }

    public void setProtocoloAtendimento(int protocoloAtendimento) {
        this.protocoloAtendimento = protocoloAtendimento;
    }

    @Override
    public String toString() {
        return "\nInformações cliente\n" + super.toString() + "\nprotocoloAtendimento:" + protocoloAtendimento;
    }
    
    

}
