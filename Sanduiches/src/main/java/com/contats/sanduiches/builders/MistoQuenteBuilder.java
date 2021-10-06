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
public class MistoQuenteBuilder extends SanduicheBuilder{
    
    private final int opcao;

    public MistoQuenteBuilder(int opcao) {
        this.opcao = opcao;
    }
    
    @Override
    public void createSanduiche() {
        sanduiche = new Pao();
        sanduiche.getOpcao().remove(2);
        sanduiche.getOpcao().remove(1);
        sanduiche = (Sanduiche) sanduiche.getOpcao().get(this.opcao);
    }

    @Override
    public void addRecheio() {
        sanduiche = (Sanduiche) new Recheio().getOpcao().get(0);
    }

    @Override
    public void addIngredientes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
