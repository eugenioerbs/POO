/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codes;

/**
 *
 * @author tsegatti
 */

public class ContaAgua implements Pagavel {
    private int metrosCubicos;
    private double precoMetrosCubicos;
    
    public  ContaAgua (int metrosCubicos, double precoMetrosCubicos) {
        
    }

    public int getMetrosCubicos() {
        return metrosCubicos;
    }

    public void setMetrosCubicos(int metrosCubicos) {
        this.metrosCubicos = metrosCubicos;
    }

    public double getPrecoMetrosCubicos() {
        return precoMetrosCubicos;
    }

    public void setPrecoMetrosCubicos(double precoMetrosCubicos) {
        this.precoMetrosCubicos = precoMetrosCubicos;
    }

    @Override
    public double calcularValorPagar() {
        return metrosCubicos * precoMetrosCubicos;
    }
    

    
}
