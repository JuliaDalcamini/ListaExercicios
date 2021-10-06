/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.contats.sanduiches.builders;

import java.util.ArrayList;

/**
 *
 * @author Julia Dalcamini
 */
public abstract class Sanduiche {
    
    ArrayList<String> opcoes = new ArrayList();
    
    protected int opcao;
    
    protected String descricao;

    public Sanduiche() {
    }

    public abstract String getDescricao();
    
    public abstract ArrayList getOpcao();

    @Override
    public String toString() {
        return getDescricao();
    }
}
