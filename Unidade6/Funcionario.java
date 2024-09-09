/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista6;

import static com.mycompany.lista6.FaixaIrpf.PRIMEIRA;

/**
 *
 * @author Eugênio
 */
public class Funcionario {
    private String nome;
    private double salario;
    
    public Funcionario (String nome, double salario){
        setNome(nome);
        setSalario(salario);
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        if (nome.equals("")){
            throw new IllegalArgumentException("Nome inválido! Digite um nome:");
        }
        this.nome = nome;
    }

    public void setSalario(double salario) {
        if (salario < 0 || salario == 0){
            throw new IllegalArgumentException("Salario inválido! Digite um salário:");
        }
        this.salario = salario;
    }
    
    
    public FaixaIrpf identificarFaixaIrpf (){
        if (salario < 1903.98){
            return FaixaIrpf.PRIMEIRA;
        } else if (salario > 1903.99 && salario < 2836.65){
            return FaixaIrpf.SEGUNDA;
        } else if (salario > 2836.66 && salario < 3751.05){
            return FaixaIrpf.TERCEIRA;
        }else if (salario > 3751.06 && salario < 4664.68){
            return FaixaIrpf.QUARTA;
        } else if (salario > 4664.69){
            return FaixaIrpf.QUINTA;
        }
              
        return FaixaIrpf.NENHUM;
    }
    
    
    public double calcularIrpf (){
        FaixaIrpf faixa = identificarFaixaIrpf();
        double imposto = 0.0;
        
        switch (faixa) {
                case PRIMEIRA:
                
                break;
                case SEGUNDA:
                double diferenca = (salario - 1903.98) * 7.5;
                imposto = diferenca / 100;
                break;
                
                case TERCEIRA:                   
                double diferenca1 = (2826.65 - 1903.98) * 7.5;
                double diferenca2 = (salario - 2826.65) * 15;
                imposto = (diferenca1 + diferenca2) / 100;
                break;
                
                case QUARTA:
                double diferenca3 = (2826.65 - 1903.98) * 7.5;
                double diferenca4 = (3751.05 - 2826.65) * 15;
                double diferenca5 = (salario - 3751.05) * 22.5;
                imposto = (diferenca3 + diferenca4 + diferenca5) / 100;
                break;
                
                case QUINTA:
                double diferenca6 = (2826.65 - 1903.98) * 7.5;
                double diferenca7 = (3751.05 - 2826.65) * 15;
                double diferenca8 = (4664.68 - 3751.05) * 22.5;
                double diferenca9 = (salario - 4664.68) * 27.5;
                imposto = (diferenca6 + diferenca7 + diferenca8 + diferenca9) / 100;
                break;
                default:
                throw new AssertionError();
        }
        
        return imposto;
        
    }
            
} // classe
