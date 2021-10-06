/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.contats.chat.salaChat;

/**
 *
 * @author Julia Dalcamini
 */
public class ParticipanteChat extends Participante {
    
    private final String name;

    public ParticipanteChat(MediatorChat chatMediator, String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void enviar(String message) {
        mediator.enviar(this, message);
    }

    @Override
    public void receber(String message, Participante participante) {
        System.out.println(participante.getName() + ": " + message);
    }
    
}
