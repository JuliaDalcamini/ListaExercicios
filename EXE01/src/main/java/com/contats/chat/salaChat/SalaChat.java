/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.contats.chat.salaChat;

import java.util.ArrayList;

/**
 *
 * @author Julia Dalcamini
 */
public class SalaChat implements MediatorChat{
    
    private final ArrayList<Participante> participantes;

    public SalaChat() {
        participantes = new ArrayList();
    }
    
    @Override
    public void enviar(Participante participante, String message) {
        for(Participante p : participantes) {
            if(!p.equals(participante)) {
                p.receber(message, participante);
            }
        }
        
    }
    
    @Override
    public Participante criarParticipante(MediatorChat mediator, String name) {
        Participante participante = new ParticipanteChat(mediator, name);
        participantes.add(participante);
        return participante;
    }
}
