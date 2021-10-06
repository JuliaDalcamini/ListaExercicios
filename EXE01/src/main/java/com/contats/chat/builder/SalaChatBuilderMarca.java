/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.contats.chat.builder;

import com.contats.chat.salaChat.ProxySalaChat;
import com.contats.chat.tratadores.CensuraMarca;
import java.util.ArrayList;

/**
 *
 * @author Julia Dalcamini
 */
public class SalaChatBuilderMarca implements SalaChatBuilder {
    
    private ProxySalaChat salaChat;

    @Override
    public void setSala() {
        salaChat = new ProxySalaChat();
    }

    @Override
    public void setSalaType() {
        ArrayList<String> marca = new ArrayList();
        marca.add("Apple");
        marca.add("IBM");
        marca.add("Microsoft");
        marca.add("Samsung");
        
        marca.stream().map(s -> new CensuraMarca(s)).forEachOrdered(tratador -> {
            salaChat.tratar(tratador);
        });
    }
    
    @Override
    public ProxySalaChat get() {
        return salaChat;
    }
}
