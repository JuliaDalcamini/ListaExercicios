/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.contats.sanduiches;

import com.contats.sanduiches.builders.CachorroQuenteBuilder;
import com.contats.sanduiches.builders.Director;
import com.contats.sanduiches.builders.HamburguerBuilder;
import com.contats.sanduiches.builders.MistoQuenteBuilder;
import com.contats.sanduiches.builders.Sanduiche;

/**
 *
 * @author Julia Dalcamini
 */
public class Main {
    
    public static void main(String[] args) throws Exception {
        Director director = new Director();
        
        //Opcoes paes: 0- Frances 1-Sovado 2-Hamburguer 3-Forma
        // Hotdog: somente opcoes 0 e 1
        // Hamburguer: somente opcao 2
        // Misto quente: somente opcoes 0 e 3
        Sanduiche sanduiche = director.buildSanduiche(new CachorroQuenteBuilder(1));
        System.out.println("Sanduiche: " + sanduiche.getDescricao());
        
        sanduiche = director.buildSanduiche(new MistoQuenteBuilder(3));
        System.out.println("Sanduiche: " + sanduiche.getDescricao());
        
        sanduiche = director.buildSanduiche(new HamburguerBuilder());
        System.out.println("Sanduiche: " + sanduiche.getDescricao());
        
    }
        
}
