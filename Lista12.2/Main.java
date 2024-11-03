/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codes;

/**
 *
 * @author Eugênio
 */
public class Main {
    
    public Main () {
        Teclado teclado = new Teclado();
        
        int numeroInt = teclado.lerInt();
        System.out.println("Número inteiro lido: " + numeroInt);
        
        int numeroDouble = teclado.lerInt();
        System.out.println("Número decimal lido: " + numeroDouble);
        
        boolean valorBoolean = teclado.lerBoolean();
        System.out.println("Boolean lido: " + valorBoolean);
        
        String valorString = teclado.lerString();
        System.out.println("String lida: " + valorString);
        
    }//construtor
    public static void main(String[] args) {
        Main main = new Main();
    }
    
    
}//classe
