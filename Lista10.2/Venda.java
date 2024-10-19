/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codes;

/**
 *
 * @author everbs
 */
public class Venda {
    private double valor;
    
    public Venda (double valor) throws IllegalArgumentException {
        setValor(valor);
        
    }//CONSTRUTOR

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) throws IllegalArgumentException {
        if (valor <= 0) {
            throw new IllegalArgumentException("Nao pode ser menor que 0");
        }
        this.valor = valor;
    }
    
  
}//CLASSE
