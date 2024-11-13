/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codes;



/**
 *
 * @author Eugênio
 */
public class Bebida extends Item {
    
    public Bebida (String nome, double valor) {
        super(nome, valor);
        
    }//construtor
    
    
    public String imprimirItem () {
        StringBuilder dados = new StringBuilder();
        
        dados.append("O valor da ").append(getNome()).append(" é R$").append(getValor());
          
        return dados.toString();
    }
    
    
}//class
