/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.prova;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Aluno
 */
public class Prova {

    public static void main(String[] args) {
        Cliente cliente = new Cliente(123, LocalDate.of(2000, Month.MARCH, 9), Genero.FEMININO,23 , "Luisa", "8291910", "luisa@gmail.com", 
                 new Endereco("4525626", "32", "casa", "53629740", "Salvador", UnidadeFederativa.BAHIA));
        
        Motoboy moto = new Motoboy("789","729102", "0987654", "21345", Setor.ENGENHARIA, 1.500, LocalDate.of(2001, Month.FEBRUARY, 22), Genero.MASCULINO, 22, "Luis", "5261718", "Luis@gmail.com",  
         new Endereco("62782", "89", "casa", "4137843", "Rio de Janeiro", UnidadeFederativa.RIO_DE_JANEIRO));;
        
        Medico medico = new Medico("5262", "526717818", "62788191", "621726721", Setor.SAUDE, 3.478, LocalDate.of(2000, Month.JULY, 25), Genero.FEMININO, 23, "Joana", "5262718", "joana@gmail.com",    
        new Endereco("92728", "728190", "casa", "734290", "São Paulo", UnidadeFederativa.SAO_PAULO));
        
        Advogado advogado = new Advogado("62372", "627281", "617181", "719181", Setor.JURIDICO, 3.321, LocalDate.of(2003, Month.MARCH, 21), Genero.MASCULINO,21, "João", "7289181", "joao@gmail.com", 
                new Endereco("6372910", "829111", "casa", "7382161", "Lauro de Freitas", UnidadeFederativa.BAHIA)); 
        
        
        System.out.println(cliente.toString());
        System.out.println(moto.toString());
        System.out.println(medico.toString());
        System.out.println(advogado.toString());
        
        
    }
}


