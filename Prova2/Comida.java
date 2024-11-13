/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codes;


/**
 *
 * @author Eugênio
 */

public class Comida extends Item{
    
    public Comida (String nome, double valor) {
        super(nome, valor);
        
    }//cosntrutor
    
    
    public String imprimirItem () {
        StringBuilder dados = new StringBuilder();
        
        dados.append(getNome()).append(" - R$").append(getValor());
          
        return dados.toString();
    }
    
    
}//class
