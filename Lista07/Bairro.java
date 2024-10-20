/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codes;

/**
 *
 * @author Eugênio
 */

public class Bairro {
    private String nome;
    private double coeficienteIptu;
    
    public Bairro (String nome, double coeficienteIptu) {
        setNome(nome);
        setCoeficienteIptu(coeficienteIptu);
        
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws IllegalArgumentException {
        if (nome.isBlank()) {
            throw new IllegalArgumentException("Nome do bairro deve ser informado");
        }
        this.nome = nome;
    }

    public double getCoeficienteIptu() {
        return coeficienteIptu;
    }

    public void setCoeficienteIptu(double coeficienteIptu) throws IllegalArgumentException {
        if (coeficienteIptu <= 0) {
            throw new IllegalArgumentException("Não pode ser negativo");
        }
        this.coeficienteIptu = coeficienteIptu;
    }
    
    
}
