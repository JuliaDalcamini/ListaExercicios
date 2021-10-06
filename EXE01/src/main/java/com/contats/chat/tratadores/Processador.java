/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.contats.chat.tratadores;

import java.util.ArrayList;

/**
 *
 * @author Julia Dalcamini
 */
public class Processador {
    
    private final ArrayList<Tratador> tratadores = new ArrayList<>();

    public void addTratador(Tratador tratador) {
        if (tratador != null) {
            tratadores.add(tratador);
        } else {
            System.out.println("É preciso informar um tratador válido.");
        }
    }

    public String processaTexto(String texto) {
        for (Tratador tratador : tratadores) {
            if (tratador.aceita(texto)) {
                texto = tratador.trata(texto);
            }
        }
        return texto;
    }
}
