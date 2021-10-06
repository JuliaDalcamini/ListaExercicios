/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.contats.chat.tratadores;

/**
 *
 * @author Julia Dalcamini
 */
public class CensuraMarca implements Tratador {
    
    private String marca;

    public CensuraMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public boolean aceita(String texto) {
        return texto.contains(this.marca);
    }

    @Override
    public String trata(String texto) {
        return texto.replaceAll(marca, "*");
    }
    
}
