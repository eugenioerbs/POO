/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codes;

/**
 *
 * @author Eugênio
 */
public class Quadrado extends Retangulo {
    private int medida;
    
    public Quadrado (int largura, int altura, int medida) {
        super(largura, altura);
        setMedida(medida);
        
    }
    
    
    public int getMedida() {
        return medida;
    }

    public void setMedida(int medida) {
        this.medida = medida;
    }
    
   
    @Override
    public double calcularArea () {
        double result = medida * medida;
        
        return result;
    }
    
    
}
