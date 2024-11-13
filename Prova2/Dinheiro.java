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

public class Dinheiro extends Pagamento {
    private double valorPago;
            
    public Dinheiro (Comanda comanda, double valorPago) {
        super(comanda);
        setValorPago(valorPago);
        
    }//construtor

    
    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }
    
    
    @Override
    public double calcularTotalComanda (Comanda comand) {
        double desconto = calcularDesconto(comand);
        double valorComanda = comand.calcularValorComanda(comand);
        
        return valorComanda - desconto;   
    }
    
    
    @Override
    public void pagar (Comanda comand) {
        if (valorPago == calcularTotalComanda(comand)) {
            JOptionPane.showMessageDialog(null, "Comanda paga\n"
                    + "Valor pago: " + valorPago + " | Valor da comanda: " + calcularTotalComanda(comand));
        } else if (valorPago > calcularTotalComanda(comand)) {
            JOptionPane.showMessageDialog(null, "Pago a mais, valor do troco: " + calcularTroco(comand) + "\n"
                    + "Valor pago: " + valorPago + "Valor da comanda: " + calcularTotalComanda(comand));
        } else if (valorPago < calcularTotalComanda(comand)) {
            JOptionPane.showMessageDialog(null, "Faltou dinheiro, faltam R$" + calcularTroco(comand) + "\n"
            + "Valor pago: " + valorPago + " | Valor da comanda: " + calcularTotalComanda(comand));
        }       
    }
    
    
    @Override
    public double calcularDesconto (Comanda comand) {
        double valorComanda = comand.calcularValorComanda(comand);
        
        double desconto = (valorComanda * 10) / 100;
      
        return valorComanda - desconto;
    }
    
    
    public double calcularTroco (Comanda comand) { //troco e tambem se caso exceda o valor a m
        double troco = 0;
        
        if (valorPago > comand.calcularValorComanda(comand)) {
            troco = valorPago - comand.calcularValorComanda(comand);
        } else if (valorPago < comand.calcularValorComanda(comand)) {
            troco = comand.calcularValorComanda(comand) - valorPago; //valor que falta para completar o pagamento
        }
        
        return troco;
    }
    
    
}//classe
