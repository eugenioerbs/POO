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
    private Contas contas;
    private PrevidenciaPrivada previdenciaPrivada;  
    
    public Main () {
        contas = new Contas();
        
        int op;
        do {            
            String opcao = JOptionPane.showInputDialog("Escolha\n"
                + "1 - Incluir conta de água\n"
                + "2 - Incluir conta mensalidade de ensino\n"
                + "3 - Incluir investimento\n"
                + "4 - Calcular tudo e mostrar\n"
                + "5 - Sair");
            op = Integer.parseInt(opcao);
            
            switch (op) {
                case 1:
                    String metrosCubicosString = JOptionPane.showInputDialog("Digite os metros cubicos");
                    String valorMetrosCubicosString = JOptionPane.showInputDialog("Digite o valor dos metros cubicos");
                    int metrosCubicos = Integer.parseInt(metrosCubicosString);
                    int valorMetrosCubicos = Integer.parseInt(valorMetrosCubicosString);
                    
                    Pagavel contaAgua = new ContaAgua(metrosCubicos, valorMetrosCubicos);
                    contas.incluirConta(contaAgua);
                    
                    break;
               case 2:
                    String nrCreditosString = JOptionPane.showInputDialog("Digite o numero de creditos");
                    String precoCreditoString = JOptionPane.showInputDialog("Digite o preço do credito");
                    int nrCreditos = Integer.parseInt(nrCreditosString);
                    double precoCredito = Double.parseDouble(precoCreditoString);
                    
                    Pagavel mensalidadeEnsino = new MensalidadeEnsino(nrCreditos, precoCredito);
                    contas.incluirConta(mensalidadeEnsino);
                    
                    break;
                case 3:
                    String saldoString = JOptionPane.showInputDialog("Digite o saldo");
                    String valorString = JOptionPane.showInputDialog("Digite o valor");
                    double saldo = Double.parseDouble(saldoString);
                    double valor = Double.parseDouble(valorString);
                    
                    previdenciaPrivada = new PrevidenciaPrivada(saldo, valor);
                    contas.incluirConta(previdenciaPrivada);
                    
                    previdenciaPrivada.investir();
                    
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "O valor total: R$" + contas.calcularTotalContas());
                    contas.calcularTotalContas();
                    
                    boolean encontrada = false;
                    for (Pagavel a : contas.getContas()) {
                        if (a instanceof PrevidenciaPrivada){
                            PrevidenciaPrivada pp = (PrevidenciaPrivada) a;
                            JOptionPane.showMessageDialog(null, "Saldo da previdencia privada: R$" + pp.getSaldo());
                            encontrada = true;
                        }
                    }
                    
                    if (encontrada != true) {
                        JOptionPane.showMessageDialog(null, "Não existe nenhuma Previdência Privada");
                    }
                    
                    break;
                case 5:
                    //saindooo
                    
                    break;
                default:
                    throw new AssertionError();
            }
            
        } while (op != 5);
        
    
       
        
        
    }//construtor
    public static void main(String[] args) {
        Main main = new Main();
    }
    
    
}//class
