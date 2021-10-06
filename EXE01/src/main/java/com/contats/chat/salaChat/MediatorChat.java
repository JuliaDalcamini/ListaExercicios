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
public interface MediatorChat {
    
    public void enviar(Participante participante, String message);
    
    public Participante criarParticipante(MediatorChat mediador, String name);
}
