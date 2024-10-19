/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codes;

/**
 *
 * @author everbs
 */

public class Funcionario1 {
    private String nome;
    private double salarioBase;
    
    public Funcionario1 (String nome, double salarioBase) throws IllegalArgumentException {
        setNome(nome);
        setSalarioBase(salarioBase);
        
    }//CONSTRUTOR

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws IllegalArgumentException {
        if (nome.isBlank()) {
            throw new IllegalArgumentException("Nome nao pode ser vazio");
        }
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) throws IllegalArgumentException {
        if (salarioBase <= 0) {
            throw new IllegalArgumentException("Salario nao pode ser negativo nem nullo");
        }
        this.salarioBase = salarioBase;
    }
   
    
     public double calcularSalario () {
         return salarioBase;
     }
     
     
}//CLASSE
