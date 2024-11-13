/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codes;


/**
 *
 * @author Eugênio
 */

public class Couvert extends Item {
    
    public Couvert (String nome, double valor) {
        super(nome, valor);
        
    }//construtor
    
    
    public String imprimirItem () {
        StringBuilder dados = new StringBuilder();
        
        dados.append("O valor do Couvert de hoje é R$").append(getValor()).append(" , Divirta-se!");
          
        return dados.toString();
        
    }
    
    
}//classe
