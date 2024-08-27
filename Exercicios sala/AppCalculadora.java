
package com.mycompany.treinos;

import java.util.Scanner;

        
public class AppCalculadora {
    public static void main (String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        Calculadora cal = new Calculadora();
        
        System.out.println("Digite um numero: ");
        int num1 = entrada.nextInt();
        System.out.println("Digite um numero: ");
        int num2 = entrada.nextInt();
        
        
        System.out.println("Escolha a operação: ");
        System.out.println("1 - Somar ");
        System.out.println("2 - Subtrair ");
        System.out.println("3 - Dividir ");
        System.out.println("4 - Multiplicar ");
        int escolha = entrada.nextInt();
        
        int resultado = 0;
        
        switch (escolha) {
            case 1:
                resultado = cal.somar(num1, num2, resultado);
                System.out.println("Resultado: " + resultado);
            break;
            case 2:
                resultado = cal.subtrair(num1, num2, resultado);
                System.out.println("Resultado: " + resultado);
            break;
            case 3:
                resultado = cal.dividir(num1, num2, resultado);
                System.out.println("Resultado: " + resultado);
            break;
            case 4:
                resultado = cal.multiplicar(num1, num2, resultado);
                System.out.println("Resultado: " + resultado);
            break;          
            default:
        
        }
                      
    } // static
}// constructor
