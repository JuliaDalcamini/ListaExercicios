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
public class Director {

    public Director() {
    }

    public Sanduiche buildSanduiche(SanduicheBuilder builder) {
        builder.createSanduiche();
        builder.addRecheio();
        builder.addIngredientes();
        return builder.get();
    }
}
