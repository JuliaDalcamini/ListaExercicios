/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.contats.chat.main;

import com.contats.chat.builder.Director;
import com.contats.chat.builder.SalaChatBuilder;
import com.contats.chat.builder.SalaChatBuilderHTML;
import com.contats.chat.builder.SalaChatBuilderMarca;
import com.contats.chat.salaChat.MediatorChat;
import com.contats.chat.salaChat.Participante;
import com.contats.chat.salaChat.ParticipanteChat;
import com.contats.chat.salaChat.SalaChat;

/**
 *
 * @author Julia Dalcamini
 */
public class Main {
    
    public static void main(String[] args) throws Exception {
        
        SalaChatBuilderMarca salaBuilder = new SalaChatBuilderMarca();
        SalaChatBuilderHTML salaBuilder2 = new SalaChatBuilderHTML();
        
        Director director = new Director(salaBuilder);
        Director director2 = new Director(salaBuilder2);

        MediatorChat salaChat = director.construct();
        MediatorChat salaChat2 = director2.construct();
        
        Participante p11 = salaChat.criarParticipante(salaChat, "Fulano");
        Participante p21 = salaChat.criarParticipante(salaChat, "Beltrano");
        Participante p31 = salaChat.criarParticipante(salaChat, "Cicrano");
        Participante p12 = salaChat2.criarParticipante(salaChat2, "Fulano");
        Participante p22 = salaChat2.criarParticipante(salaChat2, "Beltrano");
        Participante p32 = salaChat2.criarParticipante(salaChat2, "Cicrano");
        
        p11.enviar("Comprei um celular da Samsung.");
        p21.enviar("Legal, o meu é da Apple.");
        
        p12.enviar("Me envie aquela imagem.");
        p22.enviar("<img src =\"https://www.plazahoteis.com.br/wp-content/uploads/2019/07/gatinho-filhote-plaza-hoteis-jul19.jpg\"/>");
        
    }
}
