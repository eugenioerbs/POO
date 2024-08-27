
package com.mycompany.treinos;

import java.util.Scanner;


public class AppBiscoito {
   
        public static void main(String[] args) {
          Scanner entrada = new Scanner (System.in);
        
       
        
        Biscoito[] vetor = new Biscoito[10];
        
        for (int a = 0; a < 10; a++) {
            Biscoito bisc = new Biscoito();
            System.out.println("Digite o formato do biscoito: ");
            bisc.formato = entrada.next();
            System.out.println("Digite o tamanho do biscoito: ");
            bisc.tamanho = entrada.nextInt();
            System.out.println("Digite o sabor do biscoito: ");
            bisc.sabor = entrada.next();
            vetor[a] = bisc;
            
            System.out.println("Biscoito feito e registrado!");
            System.out.println("Formato: " + vetor[a].formato);
            System.out.println("Tamanho: " + vetor[a].tamanho);
            System.out.println("Sabor: " + vetor[a].sabor);
            
        } //end for 
        
            
            
        } // end static 
        
            
       

    
} // end all
