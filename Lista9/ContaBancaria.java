
import java.time.LocalDate;
import java.time.LocalDateTime;
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
public class ContaBancaria {
    private String numero;
    protected double saldo; 
    private Cliente cliente;
        
    public ContaBancaria (String numero, double saldo, Cliente cliente) {
        setNumero(numero);
        setSaldo(saldo);
        setCliente(cliente);
        
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }
   
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
    protected void incluirMovimento (double valor, ArrayList<Movimento> movimentacoes) {
        String tipoString = JOptionPane.showInputDialog("Informe o tipo da operação\n"
                + "1 - Debito\n"
                + "2 - Credito\n");
        int tipo = Integer.parseInt(tipoString);
        
        TipoMovimento ti =  identificarTipoMovimento(tipo);
        LocalDate dataAtual = LocalDate.now();
        LocalDateTime horaAtual = LocalDateTime.now();
        
        Movimento movimento = new Movimento(valor, ti, dataAtual, horaAtual);
        movimentacoes.add(movimento);    
    }
    
        
    public void depositar (ArrayList<ContaBancaria> contas, double valor) {
        String numeroConta = JOptionPane.showInputDialog("Informe o numero da conta: ");
        
        for (ContaBancaria a : contas) {
            if (a.getNumero().equalsIgnoreCase(numeroConta)) {
                a.setSaldo(a.getSaldo() + valor);
                JOptionPane.showMessageDialog(null, "Depósito realizado");
            } else {
                JOptionPane.showMessageDialog(null, "Conta não encontrada");
            }
        }
    }
    
    
    public void sacar (double valorSaque, ArrayList<ContaBancaria> contas, String numeroConta) {
               
        for (ContaBancaria a : contas) {           
            if (a.getNumero().equalsIgnoreCase(numeroConta)) {
                a.setSaldo(a.getSaldo() - valorSaque);
            }
            
            
            JOptionPane.showMessageDialog(null, "Saque realizado");
        }

    }
    
    
    public void transferir(ArrayList<ContaBancaria> contas) {
    String contaDoadora = JOptionPane.showInputDialog("Informe o número da conta doadora: ");
    String contaDestino = JOptionPane.showInputDialog("Informe o número da conta destino: ");
    
  
    if (contaDoadora.equalsIgnoreCase(contaDestino)) {
        JOptionPane.showMessageDialog(null, "A conta doadora e a conta destino devem ser diferentes.");
        return;
    }

    String valorTransferenciaString = JOptionPane.showInputDialog("Informe o valor da transferência: ");
    double valorTransferencia;
    
    try {
        valorTransferencia = Double.parseDouble(valorTransferenciaString);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Valor de transferência inválido.");
        return;
    }
    
    ContaBancaria contaOrigem = null;
    ContaBancaria contaDestinoObj = null;
    
    for (ContaBancaria conta : contas) {
        if (conta.getNumero().equalsIgnoreCase(contaDoadora)) {
            contaOrigem = conta;
        } else if (conta.getNumero().equalsIgnoreCase(contaDestino)) {
            contaDestinoObj = conta;
        }
        
       
        if (contaOrigem != null && contaDestinoObj != null) {
            break;
        }
    }
    
 
    if (contaOrigem == null) {
        JOptionPane.showMessageDialog(null, "Conta doadora não encontrada.");
        return;
    }
    if (contaDestinoObj == null) {
        JOptionPane.showMessageDialog(null, "Conta destino não encontrada.");
        return;
    }
    
   
    if (contaOrigem.getSaldo() < valorTransferencia) {
        JOptionPane.showMessageDialog(null, "Saldo insuficiente para a transferência.");
        return;
    }
    
    contaOrigem.setSaldo(contaOrigem.getSaldo() - valorTransferencia);
    contaDestinoObj.setSaldo(contaDestinoObj.getSaldo() + valorTransferencia);
    
    JOptionPane.showMessageDialog(null, "Transferência realizada com sucesso.\n"
                                      + "Novo saldo da conta doadora: " + contaOrigem.getSaldo() + "\n"
                                      + "Novo saldo da conta destino: " + contaDestinoObj.getSaldo());
    }
    
    
    public TipoMovimento identificarTipoMovimento (int tipo) {
         switch (tipo) {
            case 1:
                return TipoMovimento.DEBITO; 
            case 2:
                return TipoMovimento.CREDITO;   
            default:
                throw new AssertionError();
        }
    }
    
    
    public String exibirMovimentações (ArrayList<Movimento> movimentacoes) {
        String dados = "";
        for (Movimento a : movimentacoes) {
            dados += "Valor: " + a.getValor() + "\n"
                    + "Tipo: " + a.getTipoMovimento() + "\n"
                    + "Data: " + a.getDataAcao() + "\n"
                    + "Hora: " + a.getHoraAcao();
        }
        return dados;
    }
   
    
    
    
}//CLASSE

