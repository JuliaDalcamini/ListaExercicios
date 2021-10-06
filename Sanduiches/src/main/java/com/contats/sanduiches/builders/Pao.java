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
public class Pao extends Sanduiche {

    @Override
    public String getDescricao() {
        return getOpcao().get(opcao).toString();
    }

    @Override
    public ArrayList getOpcao() {
        opcoes.add(" Pao Frances,");
        opcoes.add(" Pao Sovado,");
        opcoes.add(" Pao de Hambúrguer,");
        opcoes.add(" Pao de Forma,");
        
        return opcoes;
    }
    
}
