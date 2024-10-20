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

public class ContaLuz {
    private LocalDate dataLeituraRelogio;
    private String numeroLeitura;
    private int quantidadeKwGastaMes;
    private double valorConta;
    private LocalDate dataPagamento;
    private double mediaConsumo;
    
    public ContaLuz (LocalDate dataLeituraRelogio, String numeroLeitura, int quantidadeKwGastaMes, double valorConta, LocalDate dataPagamento, double mediaConsumo) {
        setDataLeituraRelogio(dataLeituraRelogio);
        setNumeroLeitura(numeroLeitura);
        setQuantidadeKwGastaMes(quantidadeKwGastaMes);
        setValorConta(valorConta);
        setDataPagamento(dataPagamento);
        setMediaConsumo(mediaConsumo);
        
    }//construtor

    
    public LocalDate getDataLeituraRelogio() {
        return dataLeituraRelogio;
    }

    public void setDataLeituraRelogio(LocalDate dataLeituraRelogio) {
        this.dataLeituraRelogio = dataLeituraRelogio;
    }

    public String getNumeroLeitura() {
        return numeroLeitura;
    }

    public void setNumeroLeitura(String numeroLeitura) {
        this.numeroLeitura = numeroLeitura;
    }

    public int getQuantidadeKwGastaMes() {
        return quantidadeKwGastaMes;
    }

    public void setQuantidadeKwGastaMes(int quantidadeKwGastaMes) {
        this.quantidadeKwGastaMes = quantidadeKwGastaMes;
    }

    public double getValorConta() {
        return valorConta;
    }

    public void setValorConta(double valorConta) {
        this.valorConta = valorConta;
    }

    public LocalDate getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDate dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public double getMediaConsumo() {
        return mediaConsumo;
    }

    public void setMediaConsumo(double mediaConsumo) {
        this.mediaConsumo = mediaConsumo;
    }    
    
    
    public String contaMenorConsumo (ArrayList<ContaLuz> contas) {
        StringBuilder dadosDoMes = new StringBuilder();
        
        int valorKwMenor = Integer.MAX_VALUE;
        
        for (ContaLuz a : contas) {
            if (a.getQuantidadeKwGastaMes() < valorKwMenor) {
                valorKwMenor = a.getQuantidadeKwGastaMes();
            }           
        }
        
        ContaLuz contaMenor = null;
        
        for (ContaLuz b : contas) {
            if (b.getQuantidadeKwGastaMes() == valorKwMenor) {
                contaMenor = b;
            }
        }
        
        dadosDoMes.append("Menor consumo - KW: ").append(contaMenor.getQuantidadeKwGastaMes()).append("Data: ").append(contaMenor.getDataLeituraRelogio());
        
        return dadosDoMes.toString();
    }
    
    
    public String contaMaiorConsumo (ArrayList<ContaLuz> contas) {
        StringBuilder dadosDoMes = new StringBuilder();
        
        int valorKwMaior = Integer.MIN_VALUE;
        
        for (ContaLuz a : contas) {
            if (a.getQuantidadeKwGastaMes() > valorKwMaior) {
                valorKwMaior = a.getQuantidadeKwGastaMes();
            }           
        }
        
        ContaLuz contaMaior = null;
        
        for (ContaLuz b : contas) {
            if (b.getQuantidadeKwGastaMes() == valorKwMaior) {
                contaMaior = b;
            }
        }
        
        dadosDoMes.append("Maior consumo  -  KW: ").append(contaMaior.getQuantidadeKwGastaMes()).append("  -  ").append("Data: ").append(contaMaior.getDataLeituraRelogio());
        
        return dadosDoMes.toString();
    }
    
    
    
    
}//classe
