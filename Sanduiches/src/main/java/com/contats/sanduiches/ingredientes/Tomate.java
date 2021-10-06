/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.contats.sanduiches.ingredientes;

import com.contats.sanduiches.builders.Sanduiche;

/**
 *
 * @author Julia Dalcamini
 */
public class Tomate extends Decorator {
    
    public Tomate (Sanduiche elementoDecorado) {
        super(elementoDecorado);
    }

    @Override
    public String getDescricao() {
        return elementoDecorado.getDescricao() + ", tomate";
    }
}
