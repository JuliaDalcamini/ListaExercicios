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
public interface SalaChatBuilder {
    
    public abstract void setSala();
    
    public abstract void setSalaType();
    
    public ProxySalaChat get();
}
