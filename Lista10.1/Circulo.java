/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codes;

/**
 *
 * @author Eugênio
 */
public class Circulo extends Figura {
    private double raio;
    
    public Circulo (double raio){
        setRaio(raio);
        
    }

    
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

        
    @Override
    public double calcularArea () {
        double result = 3.14 * (raio * raio);
        
        return result;
    }
    
}
