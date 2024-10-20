/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codes;

/**
 *
 * @author Eugênio
 */

public class Imovel {
    private String rua;
    private double area;
    private Bairro bairro;
    private Finalidade finalidade;
    
    public Imovel (String rua, double area, Bairro bairro, Finalidade finalidade) {
        setRua(rua);
        setArea(area);
        setBairro(bairro);
        setFinalidade(finalidade);
        
    }//construtor

    
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) throws IllegalArgumentException {
        if (area <= 0) {
            throw new IllegalArgumentException("Área não pode ser negativa");
        }
        this.area = area;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) { 
        this.bairro = bairro;
    }

    public Finalidade getFinalidade() {
        return finalidade;
    }

    public void setFinalidade(Finalidade finalidade) throws IllegalArgumentException {
        if (finalidade == null) {
            throw new IllegalArgumentException("Finalidade deve ser informada");
        }
        this.finalidade = finalidade;
    }
    
    
    public Double calcularIptu (Imovel i, double area) { //Retorna somente o valor, favor colocar a escrita na saída do código
        double result = 0;
        
        if (i.getFinalidade() == Finalidade.RESIDENCIAL) {
            result = area * 1;
        } else if (i.getFinalidade() == Finalidade.COMERCIAL && area <= 100) {
            result = 500;
        } else if (i.getFinalidade() == Finalidade.COMERCIAL && area > 100 && area <= 400) {
            result = 1000;
        } else if (i.getFinalidade() == Finalidade.COMERCIAL && area > 400) {
            result = area * 2.55;
        } else if (i.getFinalidade() == Finalidade.INDUSTRIAL && area <= 2000) {
            result = 1000;
        } else if (i.getFinalidade() == Finalidade.INDUSTRIAL && area > 2000) {
            result = area * 0.55;
        }
        return result;
    }
       
}//classe
