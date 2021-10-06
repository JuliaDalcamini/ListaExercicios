/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.contats.sanduiches.builders;

import com.contats.sanduiches.ingredientes.Ketchup;
import com.contats.sanduiches.ingredientes.Maionese;

/**
 *
 * @author Julia Dalcamini
 */
public class CachorroQuenteBuilder extends SanduicheBuilder {
    
    private final int opcao;

    public CachorroQuenteBuilder(int opcao) {
        this.opcao = opcao;
    }
    
    @Override
    public void createSanduiche() {
        sanduiche = new Pao();
        sanduiche.getOpcao().remove(2);
        sanduiche.getOpcao().remove(3);
        sanduiche = (Sanduiche) sanduiche.getOpcao().get(this.opcao);
    }

    @Override
    public void addRecheio() {
        sanduiche = (Sanduiche) new Recheio().getOpcao().get(2);
    }

    @Override
    public void addIngredientes() {
        sanduiche = new Ketchup(sanduiche);
        sanduiche = new Maionese(sanduiche);
    }
    
}
