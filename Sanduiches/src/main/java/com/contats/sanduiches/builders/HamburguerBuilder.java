/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.contats.sanduiches.builders;

import com.contats.sanduiches.ingredientes.Alface;
import com.contats.sanduiches.ingredientes.Ketchup;
import com.contats.sanduiches.ingredientes.Maionese;
import com.contats.sanduiches.ingredientes.Tomate;

/**
 *
 * @author Julia Dalcamini
 */
public class HamburguerBuilder extends SanduicheBuilder{
    
    @Override
    public void createSanduiche() {
        sanduiche = new Pao();
        sanduiche = (Sanduiche) sanduiche.getOpcao().get(2);
    }

    @Override
    public void addRecheio() {
        sanduiche = (Sanduiche) new Recheio().getOpcao().get(1);
    }

    @Override
    public void addIngredientes() {
        sanduiche = new Alface(sanduiche);
        sanduiche = new Tomate(sanduiche);
        sanduiche = new Ketchup(sanduiche);
        sanduiche = new Maionese(sanduiche);
    }
    
}
