/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codes;

import javax.swing.JOptionPane;

/**
 *
 * @author Eugênio
 */

public class Pagamento {
    private Comanda comanda;
    
    public Pagamento (Comanda comanda) {
        setComanda(comanda);
        
    }//construtor

    
    public Comanda getComanda() {
        return comanda;
    }

    public void setComanda(Comanda comanda) {
        this.comanda = comanda;
    }
    
    
    public double calcularTotalComanda (Comanda comand) {
        double desconto = calcularDesconto(comand);
        double valorComanda = comand.calcularValorComanda(comand);
        
        return valorComanda - desconto;   
    }
    
    public void pagar (Comanda comand) {
        JOptionPane.showMessageDialog(null, "Comanda paga");
        
    }
    
    
    public double calcularDesconto (Comanda comand) {
        double desconto = 0;
        double valorComanda = comand.calcularValorComanda(comand);
        
        if (valorComanda > 50) {
            desconto = (valorComanda * 5) / 100;
        }
      
        return desconto;
    }
    
    
}//class
