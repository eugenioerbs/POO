/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codes;

import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Eugênio
 */

public class Main {
    ArrayList<ContaLuz> contas = new ArrayList<>();
    private ContaLuz contaLuz;
    
    public Main () {
        
        int op;
        
        do {
        String opcao = JOptionPane.showInputDialog("ESCOLHA\n"
                + "1 - Registrar conta de luz\n"
                + "2 - Mostrar todas contas registradas\n"
                + "3 - Mostrar mês de maior consumo\n"
                + "4 - Mostrar mês de menor consumo");
        op = Integer.parseInt(opcao);
        
        switch (op) {
            case 1:
            LocalDate dataLeitura = LocalDate.now();
            String numeroLeitura = JOptionPane.showInputDialog("Digite o número da leitura: ");
            String qntKwMesString = JOptionPane.showInputDialog("Digite os Kw gastos no mês: ");
            int qntKwMes = Integer.parseInt(qntKwMesString);
            String valorContaString = JOptionPane.showInputDialog("Digite o valor da conta: ");
            double valorConta = Double.parseDouble(valorContaString);
            LocalDate dataPagamento = LocalDate.now();
            double mediaConsumo = calcularMediaConsumo(qntKwMes);
        
            try {
                contaLuz = new ContaLuz(dataLeitura, numeroLeitura, qntKwMes, valorConta, dataPagamento, mediaConsumo);
                contas.add(contaLuz);
                JOptionPane.showMessageDialog(null, "Conta cadastrada com sucesso :)");

                } catch (IllegalArgumentException e) {
                   JOptionPane.showMessageDialog(null, e.getMessage());
              }
        
                break;
            case 2:
                String exibir = exibirTodasContas(contas);
                JOptionPane.showMessageDialog(null, exibir);
                
                break;
            case 3:
               String contaMaiorConsumo = contaLuz.contaMaiorConsumo(contas);
               JOptionPane.showMessageDialog(null, contaMaiorConsumo);
               
                break;
            case 4:
                String contaMenorConsumo = contaLuz.contaMenorConsumo(contas);  
                JOptionPane.showMessageDialog(null, contaMenorConsumo);
                
                break;
            case 5:
                
                break;
            default:
                throw new AssertionError();
        }
        
        } while (op != 5);

        
    }//construtor
    public static void main(String[] args) {
        Main main = new Main();
    }//-----------------Métodos daqui pra baixo ----------------------------------------------------
    
    
    public double calcularMediaConsumo (int qntKwMes) {
        double calculo = qntKwMes / 30;
        
        return calculo;
    }
    
    
    public String exibirTodasContas (ArrayList<ContaLuz> contas) {
        StringBuilder dados = new StringBuilder();
        
        for (ContaLuz a : contas) {
            dados.append("Data leitura: ").append(a.getDataLeituraRelogio()).append("\n")
            .append("Número da leitura: ").append(a.getNumeroLeitura()).append("\n")
            .append("Kw gasto: ").append(a.getQuantidadeKwGastaMes()).append("\n")
            .append("Valor a pagar: ").append(a.getValorConta()).append("\n")
            .append("Data pagamento: ").append(a.getDataPagamento()).append("\n")
            .append("Média consumo: ").append(a.getMediaConsumo()).append("\n")
            .append("---------------------------------------------------------------------\n");
        }
        
        return dados.toString();
    }
    
    
}//classe
