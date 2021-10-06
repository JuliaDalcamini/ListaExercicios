/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.contats.sanduiches.builders;

/**
 *
 * @author Julia Dalcamini
 */
public abstract class SanduicheBuilder {
    
    protected Sanduiche sanduiche;
    
    public abstract void createSanduiche();
    
    public abstract void addRecheio();
    
    public abstract void addIngredientes();
    
    public Sanduiche get() {
        return sanduiche;
    }
}
