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
public class ConteudoProibido implements Tratador{
    
    private String conteudo;

    public ConteudoProibido(String conteudo) {
        this.conteudo = conteudo;
    }
    
    @Override
    public boolean aceita(String texto) {
        return texto.contains(this.conteudo);
    }

    @Override
    public String trata(String texto) {
        return "Mensagem removida por conter conteúdo não autorizado.";
    }
    
}
