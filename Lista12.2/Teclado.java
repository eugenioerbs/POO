/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codes;

import java.util.Scanner;

/**
 *
 * @author Eugênio
 */

public class Teclado {
    private Scanner scanner;
    
    public Teclado () {
        scanner = new Scanner(System.in);
        
    }
    
    public int lerInt () {
        while (true) {
            System.out.print("Digite um número inteiro: ");
            String entrada = scanner.nextLine();
            try {
                return Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                System.out.print("Entrada inválida, digite um inteiro!");
            }
        }
    }
    
    
    public double lerDouble () {
        while (true) {
            System.out.print("Digite um número decimal: ");
            String entrada = scanner.nextLine();
            try {
                return Double.parseDouble(entrada);
            } catch (NumberFormatException e) {
                System.out.print("Entrada inválida, digite um decimal!");
            }
        }
    }
    
    
    public boolean lerBoolean () {
        while (true) {
            System.out.print("Digite SIM, VERDADEIRO ou POSITIVO para verdadeiro | e NÃO, FALSO, ou NEGATIVO para falso: ");
            String entrada = scanner.nextLine();
            
            if (entrada.equalsIgnoreCase("sim") || entrada.equalsIgnoreCase("verdadeiro") || entrada.equalsIgnoreCase("positivo")) {
                return true;
            } else if (entrada.equalsIgnoreCase("não") || entrada.equalsIgnoreCase("falso") || entrada.equalsIgnoreCase("negativo")) {
                return false;
            }           
        }
    }
    
    
    public String lerString () {
        System.out.print("Digite um texto: ");
        return scanner.nextLine();
    }
    
    
}
