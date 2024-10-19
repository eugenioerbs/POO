/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codes;

import java.util.ArrayList;

/**
 *
 * @author everbs
 */

public class Programador extends Funcionario1 {
    private ArrayList<String> linguagens;
    
    public Programador (String nome, double salarioBase) {
        super(nome, salarioBase);
        linguagens = new ArrayList<String>();
        
    }//CONSTRUTOR

    
    public ArrayList<String> getLinguagens() {
        return linguagens;
    }
            
    public void inserirLinguagem (String linguagem) throws IllegalArgumentException {
        if (linguagem.isBlank()) {
            throw new IllegalArgumentException("Deve ser informada uma linguagem de programação");
        }
        if (buscarLinguagem(linguagem) != null) {
            throw new IllegalArgumentException("Não pode ser adicionada mais de uma vez a a mesma linguagem");
        }
        linguagens.add(linguagem);
    }
    
    public void removerLinguagem (String linguagem) {
        String linguagemRemover = buscarLinguagem(linguagem);
        
        if (linguagemRemover != null) {
            linguagens.remove(linguagemRemover);
        }
    }
    
    private String buscarLinguagem (String linguagem) {
        for (String a : linguagens) {
            if (a.equalsIgnoreCase(linguagem)) {
                return a;
            }
        }
        return null;
    }
    
    
    @Override
    public double calcularSalario () {
         if (buscarLinguagem("Java") != null) {
             return getSalarioBase() + (getSalarioBase() * 0.2);
         }
         return getSalarioBase();
     }
    
    
    
    
    
}//CLASSE
