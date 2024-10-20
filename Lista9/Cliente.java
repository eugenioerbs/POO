/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codes;

/**
 *
 * @author Eugênio
 */

public class Cliente {
    private String nome;
    private String rua;
    
    public Cliente (String nome, String rua) {
        setNome(nome);
        setRua(rua);
        
    }//construtor

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) { 
        if (nome.isBlank()) {
            throw new IllegalArgumentException("Nome não pode ser vazio!");
        }
        this.nome = nome;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        if (rua.isBlank()) {
            throw new IllegalArgumentException("Rua não pode ser vazio!");
        }
        this.rua = rua;
    }
    
    
}//classe
