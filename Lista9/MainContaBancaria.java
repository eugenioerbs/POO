
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Eugênio
 */




public class MainContaBancaria {
    ArrayList<ContaBancaria> contas = new ArrayList<>();
    
    
    public MainContaBancaria () {
        ArrayList<Movimento> movimentacoes = new ArrayList<>();
        ContaBancaria avulso = new ContaBancaria("", 0, null);
        
        int op;
        
        do {         
            String opcao = JOptionPane.showInputDialog("Escolha\n"
                    + "1 - Criar conta\n"
                    + "2 - Depositar\n"
                    + "3 - Sacar\n"
                    + "4 - Transferir\n"
                    + "5 - Mostrar dados da conta"
                    + "6 - Sair do programa\n"
                    + "7 - Mostrar todas movimentações");
            op = Integer.parseInt(opcao);
            
            switch (op) {
                case 1:
                    String numero = JOptionPane.showInputDialog("Digite o numero da conta");
                    String saldoString = JOptionPane.showInputDialog("Digite o saldo da conta");
                    double saldo = Double.parseDouble(saldoString);
                    String nome = JOptionPane.showInputDialog("Digite o nome do titular da conta");
                    String endereco = JOptionPane.showInputDialog("Digite o endereço");
                    
                    Cliente cliente = new Cliente(nome, endereco);                   
                    ContaBancaria contaBancaria = new ContaBancaria(numero, saldo, cliente);
                    contas.add(contaBancaria);
                    
                    break;
                case 2:
                    String valorStrig = JOptionPane.showInputDialog("Informe o valor: ");
                    double valor = Double.parseDouble(valorStrig);  
                    avulso.depositar(contas, valor);
                    avulso.incluirMovimento(valor, movimentacoes);
                    break;
                    
                case 3:
                    String valorSaqueString = JOptionPane.showInputDialog("Informe o valor do saque: ");
                    double valorSaque = Double.parseDouble(valorSaqueString);
                    String numeroConta = JOptionPane.showInputDialog("Informe o número da conta que quer sacar: ");
                                        
                    for (ContaBancaria a : contas) {                                               
                        if (a.getNumero().equalsIgnoreCase(numeroConta) && (a.getSaldo() - valorSaque) >= 0) {                                 
                            a.sacar(valorSaque, contas, numeroConta);
                            JOptionPane.showMessageDialog(null, "Saque realizado");
                        }             
                    }
                    avulso.incluirMovimento(valorSaque, movimentacoes);
                    
                    break;
                case 4: //O incluir movimentação nao funciona aqui pois o dado de entrada é inserido dentro do método (i have to change)
                    avulso.transferir(contas);
                    
                    break;
                    
                case 5:
                    for (ContaBancaria a : contas) {
                        JOptionPane.showMessageDialog(null, "Titular: " + a.getCliente().getNome() + "\n"
                                                          + "Numero conta: " + a.getNumero() + "\n"
                                                          + "Saldo: " + a.getSaldo());
                    }
                    break;
                    
                case 6:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    break;
                case 7:
                    avulso.exibirMovimentações(movimentacoes);
                    break;
                default:
                    throw new AssertionError();
            }
            
        } while (op != 6);
        
        
    }//CONSTRUTOR
    public static void main(String[] args) {
        new MainContaBancaria();
    }
    
    
}//CLASSE

