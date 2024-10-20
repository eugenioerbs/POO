/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codes;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Eugênio
 */

public class Main {
    ArrayList<Comanda> comandas = new ArrayList<>();
    private Produto produto;
    private Comanda comanda;
    
    public Main () {
        int op;
        
        do {
        String opcao = JOptionPane.showInputDialog("ESCOLHA\n"
                + "1 - Criar comanda\n"
                + "2 - Adicionar produto na comanda\n"
                + "3 - Finalizar comanda");
        op = Integer.parseInt(opcao);
        
            switch (op) {
                case 1:
                    String codigo = JOptionPane.showInputDialog("Informe um código para a comanda: ");
                    comanda = new Comanda(codigo);
                    comandas.add(comanda);
                    
                    break;
                case 2:
                    String codigoComanda = JOptionPane.showInputDialog("informe o código da comanda que deseja adicionar o produto: ");
                    String nome = JOptionPane.showInputDialog("Informe o produto: ");
                    String valorString = JOptionPane.showInputDialog("Informe o valor: ");
                    double valor = Double.parseDouble(valorString);
                    String quantidadeString = JOptionPane.showInputDialog("Informe a quantidade de " + nome + " comprada: ");
                    int quantidade = Integer.parseInt(quantidadeString);
                    
                    produto = new Produto(nome, valor, quantidade);
                    
                    comanda.incluirProdutoNaComanda(produto, comandas, codigoComanda);
                    
                    break;
                case 3:
                    String codigoComandaParaFinalizar = JOptionPane.showInputDialog("informe o código da comanda que deseja adicionar o produto: ");
                    
                    JOptionPane.showMessageDialog(null, "Valor a pagar: " + comanda.finalizarComanda(codigoComandaParaFinalizar, comandas));
    
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    
                    break;
                default:
                    throw new AssertionError();
            }
            
        } while (op != 4);
        
        
    }//consturor
    public static void main(String[] args) {
        Main main = new Main();
    }
    
    
}//class
