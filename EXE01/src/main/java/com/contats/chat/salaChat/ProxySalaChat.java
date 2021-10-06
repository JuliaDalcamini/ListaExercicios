/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.contats.chat.salaChat;

import com.contats.chat.tratadores.Processador;
import com.contats.chat.tratadores.Tratador;

/**
 *
 * @author Julia Dalcamini
 */
public class ProxySalaChat implements MediatorChat{
    
    private final SalaChat salaChat;
    
    private final Processador processador;

    public ProxySalaChat() {
        salaChat = new SalaChat();
        processador = new Processador();
    }

    public void tratar(Tratador tratador) {
        if(tratador != null) {
            processador.addTratador(tratador);
        }
    }

    @Override
    public void enviar(Participante participante, String message) {
        String messageProcessada = processador.processaTexto(message);
        salaChat.enviar(participante, messageProcessada);
    }

    @Override
    public Participante criarParticipante(MediatorChat mediador, String name) {
        return salaChat.criarParticipante(mediador, name);
    }
    
}
