/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codes;

import javax.swing.JOptionPane;

/**
 *
 * @author Eugênio
 */
public class MainFigura {
    
    public MainFigura () {
        
        String figuraString = JOptionPane.showInputDialog("Infome o tipo de figura\n"
                + "1 - Circulo\n"
                + "2 - Triângulo\n"
                + "3 - Retangulo\n"
                + "4 - Quadrado");
        int figuraInt = Integer.parseInt(figuraString);
        
        switch (figuraInt) {
            case 1:
                String raioString = JOptionPane.showInputDialog("Infome o raio: ");
                int raio = Integer.parseInt(raioString);
                
                Circulo circulo = new Circulo(raio);
                
                JOptionPane.showMessageDialog(null, "A area: " + circulo.calcularArea());
                break;
            case 2:
                String lado1String = JOptionPane.showInputDialog("Infome o lado 1: ");
                int lado1 = Integer.parseInt(lado1String);
                String lado2String = JOptionPane.showInputDialog("Infome o lado 2: ");
                int lado2 = Integer.parseInt(lado2String);
                String lado3String = JOptionPane.showInputDialog("Infome o lado 3: ");
                int lado3 = Integer.parseInt(lado3String);
                
                Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
                
                JOptionPane.showMessageDialog(null, "A area: " + triangulo.calcularArea());
                break;
            case 3:
                String larguraString = JOptionPane.showInputDialog("Infome a largura: ");
                int largura = Integer.parseInt(larguraString);
                String alturaString = JOptionPane.showInputDialog("Infome a altura: ");
                int altura = Integer.parseInt(alturaString);
                
                Retangulo retangulo = new Retangulo(largura, altura);
                
                JOptionPane.showMessageDialog(null, "A area: " + retangulo.calcularArea());
                break;
            case 4:
                String larguraaString = JOptionPane.showInputDialog("Infome a largura: ");
                int larguraa = Integer.parseInt(larguraaString);
                String alturaaString = JOptionPane.showInputDialog("Infome a altura: ");
                int alturaa = Integer.parseInt(alturaaString);
                String medidaString = JOptionPane.showInputDialog("Infome a medida: ");
                int medida = Integer.parseInt(medidaString);
                
                Quadrado quadrado = new Quadrado(larguraa, alturaa, medida);
                
                JOptionPane.showMessageDialog(null, "A area: " + quadrado.calcularArea());
                break;
            default:
                throw new AssertionError();
        }
        
    }//CONSTRUTOR
    public static void main(String[] args) {
        MainFigura mainFigura = new MainFigura();
    }
    
}//CLASSE
