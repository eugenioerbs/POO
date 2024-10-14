//Eugênio Victor Erbs | Manhã BCC
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Codes;

import javax.swing.JOptionPane;

/**
 *
 * @author Eugênio
 */



/**
 * Classe responsável por abrigar o construtor que possui os códigos que interagem com o cliente.
 * @author Eugênio
 */
public class AppEstadia {
    
    /**
     * Construtor responsável por interagir com o cliente, e chamar os métodos criados na classe Estadia
     * dando assim a resposta valor para o cliente.
     */
    public AppEstadia (){
        
        
        int escolhaCerta;
        do {
            String esolha = JOptionPane.showInputDialog(
            "Esolha uma opção:\n "
            + "1 - Fazer orçamento\n"
            + "2 - Sair");
            escolhaCerta = Integer.parseInt(esolha);
            
            switch (escolhaCerta) {
        
                case 1:
                String qnt = JOptionPane.showInputDialog("Informe a quantidade de dias que passará no hotel: ");
                String periodoParametro = JOptionPane.showInputDialog("Informe somente o mês em que passará no hotel: ");
                int quantidadeDiasParametro = Integer.parseInt(qnt);
        
                Estadia cliente = new Estadia(periodoParametro, quantidadeDiasParametro);

                JOptionPane.showMessageDialog(null, "O preço a se pagar pela estadia: " + cliente.precoPagar());
                
                break;
                case 2:
                
                break;
                default:
                    throw new AssertionError();
            }
            
        } while (escolhaCerta != 2);
        
        
        
    }//CONSTRUTOR
    public static void main(String[] args) {
        AppEstadia appEstadia = new AppEstadia();
    }
    

} //CLASSE
