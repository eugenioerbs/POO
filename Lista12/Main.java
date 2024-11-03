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

public class Main {
    private Bairro bairro;
    private Imovel imovel;
    
    public Main () {
        
        
        String rua = JOptionPane.showInputDialog("Informe e rua: ");
        String areaString = JOptionPane.showInputDialog("Informe a área do imovel: ");
        double area = Double.parseDouble(areaString);
        
        String nomeBairro = JOptionPane.showInputDialog("Informe o bairro: ");
        String coeficienteString = JOptionPane.showInputDialog("Informe o coeficiente de " + nomeBairro + ":");
        double coeeficiente = Double.parseDouble(coeficienteString);
        
        String finalidadeString = JOptionPane.showInputDialog("""
                                                              FINALIDADE DO IMOVEL
                                                              1 - RESIDENCIAL
                                                              2 - COMERCIAL
                                                              3 - INDUSTRIAL""");
        int finalidadeInt = Integer.parseInt(finalidadeString);
        Finalidade finalidadeIdenficada = idenfiticarFinalidade(finalidadeInt);
       
        try {
            bairro = new Bairro(nomeBairro, coeeficiente);
            imovel = new Imovel(rua, area, bairro, finalidadeIdenficada);
            
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        JOptionPane.showMessageDialog(null, "Cálculo IPTU: R$ " + imovel.calcularIptu(imovel, area));
        
        
    }//construtor
    public static void main(String[] args) {
        Main main = new Main();
    }//------------------------Métodos-abaixo-desta-linha-----------------------
    
    
    public Finalidade idenfiticarFinalidade (int finalidade) {
        switch (finalidade) {
            case 1 -> {
                return Finalidade.RESIDENCIAL;
            }
            case 2 -> {
                return Finalidade.COMERCIAL;
            }
            case 3 -> {
                return Finalidade.INDUSTRIAL;
            }
            default -> {
            }
        }
        return null;
    }
    
    
}//classe
