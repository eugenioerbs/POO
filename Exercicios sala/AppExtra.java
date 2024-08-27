
import javax.swing.JOptionPane;


public class AppExtra {
    
    private ContaBancaria[] contas;  //Array armazena objetos da clase ContaBancaria
    private int quantidadeContas; //Armazena o índice de contas criadas, sendo emcrementada de conta em conta criada.
    
    public AppExtra(){
    contas = new ContaBancaria[10]; // inicializou o Array
    quantidadeContas = 0; //Inicializou a variável
    
    int op;
        do {
            String retorno = JOptionPane.showInputDialog("Digite " + "uma opção: \n1 - criar conta bancária\n" + "2 - sacar\n" + "3 - depositar\n" + "4 - transferir\n" + "5 - sair");
            
            op = Integer.parseInt(retorno);
            
           switch (op) {
            case 1 -> criarConta();
            case 2 -> sacar();
            case 3 -> depositar();
            case 4 -> transferir();
            case 5 -> {
            }
            default -> JOptionPane.showMessageDialog(null, "Opção inválida");
        }
            
        } while (op != 5);  // DO-while para sempre mostrar as opções do cliente, até ela ser 5
        
    
    } // constructor
    
    
    public static void main(String[] args) {
        new AppExtra();
        
    } // static
    
    
    
    private ContaBancaria buscar (String numeroConta) {
        for (ContaBancaria c : contas) {
            if (c != null && c.getNumero().trim().equalsIgnoreCase(numeroConta)) {
                return c;
            }
        }
        return null;
        
    } // end buscar
    
    
    
    private void criarConta (){
        
    String numeroConta = JOptionPane.showInputDialog("Número da conta: ");
    
    if (buscar(numeroConta) == null && quantidadeContas < contas.length) {
         String titular = JOptionPane.showInputDialog("Titular: ");
         
            ContaBancaria conta = new ContaBancaria(numeroConta, titular, 0.0);
            contas[quantidadeContas] = conta;
            quantidadeContas++;
            JOptionPane.showMessageDialog(null, "Conta criada");
    } else {
        JOptionPane.showMessageDialog(null, "Conta já existe ou já está cheio");
    }
    
} // end criar
    

    
    
    private void sacar (){
        
        String numeroConta = JOptionPane.showInputDialog("Número da conta: ");
        ContaBancaria conta = buscar(numeroConta);
        
        if (conta != null) {
            boolean deuErro = true;
            do {
                float valor = Float.parseFloat(JOptionPane.showInputDialog("Valor do saque: "));
                try {
                    conta.sacar(valor);
                    JOptionPane.showMessageDialog(null, "Saldo R$" + conta.getSaldo());
                    deuErro = false;
                } catch (IllegalArgumentException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            } while (deuErro && conta.getSaldo() > 0);
        } else {
            JOptionPane.showMessageDialog(null, "Conta não existe");
        }
        
    } // end sacar
    
    
    
    private void depositar (){
        String numeroConta = JOptionPane.showInputDialog("Número da conta: ");
        ContaBancaria conta = buscar(numeroConta);
        if (conta != null) {
            float valor = Float.parseFloat(JOptionPane.showInputDialog("Valor do depósito: "));
            conta.depositar(valor);
            JOptionPane.showMessageDialog(null, "Saldo R$" + conta.getSaldo());
        } else {
            JOptionPane.showMessageDialog(null, "Conta não existe");
        }
        
    } // end depositar
    
    
    
    private void transferir (){
        String numeroContaOrigem = JOptionPane.showInputDialog("Número da conta: "); 
        ContaBancaria contaOrigem = buscar(numeroContaOrigem);
        if (contaOrigem != null) {
            String numeroContaDestino = JOptionPane.showInputDialog("Número da conta de despósito: ");
            ContaBancaria contaDestino = buscar(numeroContaDestino);
            if (contaDestino != null) {
                float valor = Float.parseFloat(JOptionPane.showInputDialog("Valor da transferência: "));
                contaOrigem.transferir(contaDestino, valor);
                JOptionPane.showMessageDialog(null, "Saldo R$" + contaOrigem.getSaldo());
                JOptionPane.showMessageDialog(null, "Saldo Destino R$" + contaDestino.getSaldo());
            } else {
                JOptionPane.showMessageDialog(null, "Conta destino não existe");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Conta origem não existe");
        }
        
    } // end transferir
    
    
    
    
    
} // classe
