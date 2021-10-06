/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.contats.chat.builder;

import com.contats.chat.salaChat.ProxySalaChat;
import com.contats.chat.tratadores.ConteudoProibido;
import java.util.ArrayList;

/**
 *
 * @author Julia Dalcamini
 */
public class SalaChatBuilderHTML implements SalaChatBuilder{

    private ProxySalaChat salaChat;
    
    @Override
    public void setSala() {
        salaChat = new ProxySalaChat();
    }

    @Override
    public void setSalaType() {
        ArrayList<String> tags = new ArrayList();
        tags.add("<img");
        tags.add("<table");
        tags.add("<p");
        tags.add("<a href");
        
        tags.stream().map(s -> new ConteudoProibido(s)).forEachOrdered(tratador -> {
            salaChat.tratar(tratador);
        });
    }
    
    @Override
    public ProxySalaChat get() {
        return salaChat;
    }
    
}
