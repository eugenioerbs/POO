/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codes;

import java.util.ArrayList;

/**
 *
 * @author everbs
 */

public class Empresa {
    private ArrayList<Funcionario1> funcionarios;
    private String nome;
    
    public Empresa (String nome) {
        setNome(nome);
        funcionarios = new ArrayList<>();
    }//Construtor

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.isBlank()) {
            throw new IllegalArgumentException("Nome deve ser informado");
        }
        this.nome = nome;
    }

    public ArrayList<Funcionario1> getFuncionarios() {
        return funcionarios;
    }
    
    
    public void incluirFuncionario (Funcionario1 f) {
        if (f == null) {
            throw new IllegalArgumentException("Funcionario deve ser informado");
        }
        funcionarios.add(f);
    }
    
    public void removerFuncionario (Funcionario1 f) {
        
        for (Funcionario1 a : funcionarios) {
            if (a.getNome().equalsIgnoreCase(f.getNome())) {
                funcionarios.remove(a);
                break;
            }
        }
    }
    
    
    public double cacularCustosSalarios () {
        double  salarioTotal = 0;
        
        for (Funcionario1 a : funcionarios) {
            salarioTotal += a.calcularSalario();
        }
        return salarioTotal;
    }
    
    
    
}//CLASSE
