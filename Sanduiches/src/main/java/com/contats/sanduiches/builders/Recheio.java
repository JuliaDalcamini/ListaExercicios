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
public class Recheio extends Sanduiche {

    @Override
    public String getDescricao() {
        return getOpcao().get(opcao).toString();
    }

    @Override
    public ArrayList getOpcao() {
        opcoes.add(" Presunto,");
        opcoes.add(" Bife de hambúrguer bovino,");
        opcoes.add(" Salsicha,");
        
        return opcoes;
    }
    
}
