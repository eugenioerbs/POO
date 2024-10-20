/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codes;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Eugênio
 */
public class ContaEspecial extends ContaBancaria {
    private double limiteCredito;
    
    public ContaEspecial (int numero, double saldo, Cliente titular, double limiteCredito) {
        super(numero, saldo, titular);
        setLimiteCredito(limiteCredito);
        
    }//construtor

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        if (limiteCredito < 0) {
            throw new IllegalArgumentException("O limite de crédito não pode ser negativo!");
        }
        this.limiteCredito = limiteCredito;
    }   
    
    
    public void sacarComCredito (double valorr, String nome, ArrayList<ContaEspecial> contasEspeciais) {      
        if (valorr <= 0) {
            JOptionPane.showMessageDialog(null, "Valor nao pode ser negativo!");
            return;
        }
        
        ContaEspecial contaDesejada = null;
        boolean contaEncontrada = false;
        for (ContaEspecial a : contasEspeciais) {
            if (a.getTitular().getNome().equalsIgnoreCase(nome)) {
                contaDesejada = a;               
                contaEncontrada = true;
                break;
            }
        }
        
        if (contaEncontrada != true) {
            JOptionPane.showMessageDialog(null, "Conta não encontrada!");
            return;
        }
        
        if (valorr < contaDesejada.getSaldo()) {
            contaDesejada.setSaldo(contaDesejada.getSaldo() - valorr);
            JOptionPane.showMessageDialog(null, "Valor sacado com sucesso :)");
            
        } else if (valorr > contaDesejada.getSaldo() && valorr < (contaDesejada.getSaldo() + contaDesejada.getLimiteCredito())) {
            double calculo = contaDesejada.getSaldo() + contaDesejada.getLimiteCredito(); //valor disponível pra uso
            double calculo2 = calculo -= valorr; // valor atualizado do limite
            contaDesejada.setLimiteCredito(calculo2);
            contaDesejada.setSaldo(0);
            JOptionPane.showMessageDialog(null, "Valor sacado com créditos bem sucessedido :)");
            
        } else if (valorr > (contaDesejada.getSaldo() + contaDesejada.getLimiteCredito())) {
            JOptionPane.showMessageDialog(null, "Valor alto demais, ultrapassa os créditos");
        }
        
    }
    
    
}//classe
