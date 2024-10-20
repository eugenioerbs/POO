/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codes;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Eugênio
 */

public class Gasto {
    private TipoGasto tipoGasto;
    private LocalDate data;
    private double valor;
    private FormaPagamento formaPagamento;
    
    public Gasto (TipoGasto tipoGasto, LocalDate data, double valor, FormaPagamento formaPagamento) {
        setTipoGasto(tipoGasto);
        setData(data);
        setValor(valor);
        setFormaPagamento(formaPagamento);
        
    }//construtor

    
    public TipoGasto getTipoGasto() {
        return tipoGasto;
    }

    public void setTipoGasto(TipoGasto tipoGasto) {
        this.tipoGasto = tipoGasto;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
    
    
    public String calcularTotalGastos (ArrayList<Gasto> gastos) {
        StringBuilder dados = new StringBuilder();
        
        double totalRemedio = 0;        
        double totalRoupa = 0;
        double totalRefeicao = 0;
        
        double totalDinheiro = 0;
        double totalCheque = 0;
        double totalCartao = 0;
        double totalChequePre = 0;

        for (Gasto a : gastos) {
            if (a.getTipoGasto() == TipoGasto.REMEDIO) {
                totalRemedio += a.getValor();
                
            } else if (a.getTipoGasto() == TipoGasto.ROUPA) {
                totalRoupa += a.getValor();
                
            } else if (a.getTipoGasto() == TipoGasto.REFEICAO) {
                totalRefeicao += a.getValor();
            }
            
        }
        
        for (Gasto a : gastos) {
            if (a.getFormaPagamento() == FormaPagamento.DINHEIRO) {
                totalDinheiro += a.getValor();
               
            } else if (a.getFormaPagamento() == FormaPagamento.CHEQUE) {
                totalCheque += a.getValor();
               
            } else if (a.getFormaPagamento() == FormaPagamento.CARTAO) {
                totalCartao += a.getValor();
               
            } else if (a.getFormaPagamento() == FormaPagamento.CHEQUEPRE) {
                totalChequePre += a.getValor();              
            }
            
        }
        
        dados.append("Total gastos remédio: R$").append(totalRemedio).append("\n")
        .append("Total gastos roupa: R$").append(totalRoupa).append("\n")
        .append("Total gastos refeição: R$").append(totalRefeicao).append("\n")
        .append("\n")
        .append("Total gastos no dinheiro: R$").append(totalDinheiro).append("\n")
        .append("Total gastos no cheque: R$").append(totalCheque).append("\n")
        .append("Total gastos no cartão: R$").append(totalCartao).append("\n")
        .append("Total gastos no cheque pré: R$").append(totalChequePre).append("\n");
       
        return dados.toString();
    }
    
    
}//classe
