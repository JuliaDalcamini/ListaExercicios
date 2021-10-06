/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.contats.sanduiches.ingredientes;

import com.contats.sanduiches.builders.Sanduiche;
import java.util.ArrayList;

/**
 *
 * @author Julia Dalcamini
 */
public abstract class Decorator extends Sanduiche{
    
    Sanduiche elementoDecorado;

    public Decorator(Sanduiche elementoDecorado) {
        this.elementoDecorado = elementoDecorado;
    }
    
    @Override
    public ArrayList getOpcao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
