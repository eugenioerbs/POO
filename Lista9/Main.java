/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codes;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Eugênio
 */
public class Main {
    private ContaBancaria contaBancaria;
    private Cliente cliente;
    private ContaEspecial contaEspecial;
    ArrayList<ContaBancaria> contas = new ArrayList<>();
    ArrayList<ContaEspecial> contasEspeciais = new ArrayList<>();
    
    public Main () {
        
        int op;
        do {
            String opcao = JOptionPane.showInputDialog("ESCOLHA\n"
                    + "1 - Sacar\n"
                    + "2 - Depositar\n"
                    + "3 - Transferir\n"
                    + "4 - Exibir dados\n"
                    + "5 - Criar conta\n"
                    + "6 - Exibir movimentos");
            op = Integer.parseInt(opcao);
            
            switch (op) {
                case 1: //-----------------------------------------------------------------------------------------------------                  
                    String nomeDesejaSacar = JOptionPane.showInputDialog("Informe o nome do receptor do saque: ");
                    String valorSaqueString = JOptionPane.showInputDialog("Informe o valor do saque: ");
                    double valorSaque = Double.parseDouble(valorSaqueString);
                    
                    String tipoSaqueString = JOptionPane.showInputDialog("SAQUE EM QUE CONTA?\n"
                            + "1 - Conta Bancaria\n"
                            + "2 - Conta Especial (crédito)");
                    int tipoSaque = Integer.parseInt(tipoSaqueString);
                    
                    if (tipoSaque == 1) {
                        contaBancaria.sacar(valorSaque, nomeDesejaSacar, contas);
                        
                    } else if (tipoSaque == 2) {
                        contaEspecial.sacarComCredito(valorSaque, nomeDesejaSacar, contasEspeciais);
                    }

                    break;
                case 2: //-----------------------------------------------------------------------------------------------------
                    String nomeDesejaDepositar = JOptionPane.showInputDialog("Informe o nome do receptor do depósito: ");
                    String valorDepositoString = JOptionPane.showInputDialog("Informe o valor do depósito: ");
                    double valorDeposito = Double.parseDouble(valorDepositoString);
                    
                    contaBancaria.depositar(valorDeposito, nomeDesejaDepositar, contas);
                    
                    
                    break;
                case 3: //-----------------------------------------------------------------------------------------------------
                    String doador = JOptionPane.showInputDialog("Digite o nome do doador: ");
                    String receptor = JOptionPane.showInputDialog("Digite o nome do receptor: ");
                    String valorString = JOptionPane.showInputDialog("Informer o valor de transferência: ");
                    double valor = Double.parseDouble(valorString);
                    
                    contaBancaria.transferir(valor, doador, receptor, contas);
                    
                    break;
                case 4: //-----------------------------------------------------------------------------------------------------
                    String numeroContaExibirString = JOptionPane.showInputDialog("Informe o número da conta: ");
                    int numeroContaExibir = Integer.parseInt(numeroContaExibirString);
                    
                    String dadosConta = exibirConta(numeroContaExibir);
                    String dadosContaEspecial = exibirContaEspecial(numeroContaExibir);
                    
                    boolean contaNormalEncontrada = false;
                    boolean contaEspecialEncontrada = false;
                    
                    if (dadosConta != null) {
                        contaNormalEncontrada = true;
                        
                    } else if (dadosContaEspecial != null) {
                        contaEspecialEncontrada = true;
                        
                    }
                    
                    if (contaNormalEncontrada != false) {
                        JOptionPane.showMessageDialog(null, dadosConta);
                        
                    } else if (contaEspecialEncontrada != false) {
                        JOptionPane.showMessageDialog(null, dadosContaEspecial);
                        
                    } else {
                        JOptionPane.showMessageDialog(null, "Conta não enconteada :(");
                    }
            
                    break;
                case 5: //-----------------------------------------------------------------------------------------------------
                    String numeroString = JOptionPane.showInputDialog("Digite um numero para a conta: ");
                    int numero = Integer.parseInt(numeroString);
                    String saldoString = JOptionPane.showInputDialog("Digite um saldo para a conta: ");
                    double saldo = Double.parseDouble(saldoString);
                    String nome = JOptionPane.showInputDialog("Digite o nome de quem vai titular esta conta: ");
                    String rua = JOptionPane.showInputDialog("Informe a rua de " + nome);
                    
                    String tipoString = JOptionPane.showInputDialog("TIPO DE CONTA\n"
                            + "1 - Conta Bancaria\n"
                            + "2 - Conta Especial (crédito)");
                    int tipo = Integer.parseInt(tipoString);
                    
                    if (tipo == 1) {
                        try {
                        cliente = new Cliente(nome, rua);
                        contaBancaria = new ContaBancaria(numero, saldo, cliente);
                        contas.add(contaBancaria);
                        JOptionPane.showMessageDialog(null, "Conta Bancaria feita com sucesso :)");
                        
                    } catch (IllegalArgumentException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage());
                    }
                        
                    } else if (tipo == 2) {
                        String limiteCreditoString = JOptionPane.showInputDialog("Informe o limite do crédito: ");
                        double limiteCredito = Double.parseDouble(limiteCreditoString);
                        
                        try {
                            cliente = new Cliente(nome, rua);
                            contaEspecial = new ContaEspecial(numero, saldo, cliente, limiteCredito);
                            contasEspeciais.add(contaEspecial);
                            JOptionPane.showMessageDialog(null, "Conta especial feita com sucesso :)");
                            
                        } catch (IllegalArgumentException e) {
                            JOptionPane.showMessageDialog(null, e.getMessage());
                        }                       
                    }
                                   
                    break;
                case 6:
                    String numContaExibirMovimentosString = JOptionPane.showInputDialog("Digite número: ");
                    int numContaExibirMovimentos = Integer.parseInt(numContaExibirMovimentosString);
                    
                    String dados = contaBancaria.exibirMovimentos(numContaExibirMovimentos, contas);
                    JOptionPane.showMessageDialog(null, dados);
                    
                    break;
                default:
                    throw new AssertionError();
            }

            
        } while (op != 7);
        

    }//construtor
    public static void main(String[] args) {
        Main main = new Main();
    }
    
    //MÉTODOS---------------------------------------------------------------------------------------------------------
    
    public String exibirConta (int numeroConta) { 
        StringBuilder dados = new StringBuilder();
        
        for (ContaBancaria a : contas) {
            if (a.getNumero() == numeroConta) {
                dados.append("Nome: ").append(a.getTitular().getNome()).append("\n")
                .append("Número: ").append(a.getNumero()).append("\n")                                  
                .append("Rua: ").append(a.getTitular().getRua()).append("\n")
                .append("Saldo: R$").append(a.getSaldo()).append("\n")
                .append("\n---------------------------------------------------------");
                
                return dados.toString();
            }           
        }
        return null;
    }
    
    
        public String exibirContaEspecial (int numeroConta) { 
        StringBuilder dados = new StringBuilder();
        
        for (ContaEspecial a : contasEspeciais) {
            if (a.getNumero() == numeroConta) {
                dados.append("Nome: ").append(a.getTitular().getNome()).append("\n")
                .append("Número: ").append(a.getNumero()).append("\n")                                  
                .append("Rua: ").append(a.getTitular().getRua()).append("\n")
                .append("Saldo: R$").append(a.getSaldo()).append("\n")
                .append("Créditos: ").append(a.getLimiteCredito());
                
                return dados.toString();
            }           
        }
        return null;
    }
    
    
}//classe