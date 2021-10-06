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
public interface Tratador {
    
    public abstract boolean aceita(String texto);
    
    public abstract String trata(String texto);
}
