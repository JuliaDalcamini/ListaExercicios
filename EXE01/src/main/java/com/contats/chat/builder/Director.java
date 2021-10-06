/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.contats.chat.builder;

import com.contats.chat.salaChat.ProxySalaChat;

/**
 *
 * @author Julia Dalcamini
 */
public class Director {
    
    SalaChatBuilder builder;

    public Director(SalaChatBuilder builder) {
        this.builder = builder;
    }
    
    public ProxySalaChat construct() {
        builder.setSala();
        builder.setSalaType();
        return builder.get();
    }
    
    public ProxySalaChat construct(SalaChatBuilder builder) {
        this.builder = builder;
        return this.construct();
    }
}
