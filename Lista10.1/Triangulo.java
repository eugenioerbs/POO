/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codes;

/**
 *
 * @author Eugênio
 */
public class Triangulo extends Figura {
    private int lado1;
    private int lado2;
    private int lado3;
    
    public Triangulo (int lado1, int lado2, int lado3) {
        setLado1(lado1);
        setLado2(lado2);
        setLado3(lado3);
        
    }

    
    public double getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }

    
    @Override
    public double calcularArea () {
        double s = (lado1 + lado2 + lado3) / 2; //15
        double result = Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
        return result;
    }
    
    
}
