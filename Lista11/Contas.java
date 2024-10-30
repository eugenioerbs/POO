/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codes;

import java.util.ArrayList;

/**
 *
 * @author Eugênio
 */

public class Contas {
    private ArrayList<Pagavel> contas = new ArrayList<>();
    
    public Contas () {
        contas = new ArrayList<>();
        
    }//construtor
    
    
    public void incluirConta (Pagavel p) {
        contas.add(p);
    }

    public ArrayList<Pagavel> getContas() {
        return contas;
    }
    
    public double calcularTotalContas () {
        double result = 0;
        
        for (Pagavel a : contas) {
            result += a.calcularValorPagar();
        }
        return result;
    }
    
    
}//classe
